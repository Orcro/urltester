; SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk 
; 
; SPDX-License-Identifier: EPL-2.0 

(ns urltester.core
  (:gen-class)
  (:require clojure.java.shell clojure.java.io))

(defn getUrls
  "Extract URLs from the filepath provided as an argument."
  [filePath]

  (def fulltext (slurp filePath))

  (def urlregex #"https:\/\/.*|http:\/\/.*")

  ;(clojure.string/replace urls #"https:\/\/|http:\/\/" "www."))

  (re-seq urlregex fulltext))

(defn pingUrls
  "Pings each extracted URL."
  [urls]
  (print urls)
  (first urls))

;(def secondmatch (clojure.string/replace firstmatch #"https:\/\/|http:\/\/" "www."))

;(def result (sh "ping" "-c 1" secondmatch))

(defn checkFilePath
  "Verify that a user provided filepath is valid"
  [filePath]
  (if (.exists (clojure.java.io/file filePath))
    (print (pingUrls (getUrls filePath)))
    (print (str "\nThe provided file at the path:\n\n" filePath "\n\ndoesn't exist.\n\n"))))

(defn -main
  "This, is the entry point to the program."
  [& args]
  (if (= (count args) 1)
    (checkFilePath (first args)) 
    (print "\nYou must call a filepath. Like this: \n\n> java -jar version-urltester.jar /full/path/to/file.txt\n\n")))
