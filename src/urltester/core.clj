; SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk
; 
; SPDX-License-Identifier: Apache-2.0

; can java imports be removed? test
(ns urltester.core
  (:gen-class)
  (:require [clj-http.client :as client])
  (:require clojure.java.shell clojure.java.io)
  (:import java.lang.Runtime))

; global regex used to match urls (should give this it's own ns for customizability)
(def urlregex #"https:\/\/.*|http:\/\/.*")

(defn getUrls
  "Extract URLs from the filepath provided as an argument. This seems to return a list."
  [filePath]
  (def fulltext (slurp filePath))
  (re-seq urlregex fulltext))

(defn validUrl
  "Validate a single url, return true if valid, or false if there's an error of any kind."
  [url]
  (try 
    (client/get url)
    true
    (catch Throwable e
      false)))

(defn checkUrlList
  "Pings each URL in the list passed to this function"
  [urls]
  ; simply print the urls to start
  (print (map validUrl urls)))

; currently, this function calls the url validator - that should be moved back to -main
(defn checkFilePath
  "Verify that a user provided filepath is valid"
  [filePath]
  (if (.exists (clojure.java.io/file filePath))
    (checkUrlList (getUrls filePath))
    (print (str "\nThe provided file at the path:\n\n" filePath "\n\ndoesn't exist.\n\n"))))

(defn -main
  "This, is the entry point to the program."
  [& args]
  (if (= (count args) 1)
    (checkFilePath (first args)) 
    (print "\nYou must call a filepath. Like this: \n\n> java -jar version-urltester.jar /full/path/to/file.txt\n\n"))
  (shutdown-agents))
