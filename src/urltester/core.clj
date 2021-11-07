; SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk
; 
; SPDX-License-Identifier: Apache-2.0


(ns urltester.core
  (:gen-class)
  (:require [clj-http.client :as client]))


; global regex used to match urls (should give this its own ns for eventual customizability)
(def urlregex #"https:\/\/.*|http:\/\/.*")


(defn getUrls
  "Extract URLs from the filepath provided as an argument. This returns a list."
  [filePath]
  (re-seq urlregex (slurp filePath)))


(defn tryUrl
  "Sends an HTTP GET request to the passed argument. If the request is successful, prints true, else false."
  [url]
  (let [response? (try
                    (client/get url)
                    "valid."
                    (catch Throwable e
                      "invalid."))]
    (println (str "URL: " url " is " response?)))

  nil)


(defn checkUrlList
  "Attempts a HTTP GET request for each URL in the list passed to the function"
  [urls]
  (dorun (map tryUrl urls)))


(defn handleStartup
  "Helper function to check startup parameters, keeps -main clean."
  [args]

  (def startupErrors (list "\nThe provided filepath doesn't exist.\n\n" ; 0
                           "\nYou must specify a filepath.\n\n" ; 1
                           "\nYou have provided too many filepaths.\n\n")) ; 2

  (if (= (count args) 1) ; is a single parameter provided?

    (do 
      (if (.exists (clojure.java.io/file (first args))) ; yes -> is it a valid filepath?
        true ; yes -> return true, signaling program to continue
        (do ; no -> output error message, return false
            (print (nth startupErrors 0))
            false)))

    (do 
      (if (= (count args) 0) ; no -> so were parameters provided?
        (do ; no -> print error message, return false
            (print (nth startupErrors 1))
            false)
        (do ; too many were -> print error message, return false
            (print (nth startupErrors 2))
            false)))))


(defn -main
  "This, is the entry point to the program."
  [& args]
  (if (= true (handleStartup args))
    (checkUrlList (getUrls (first args)))))



