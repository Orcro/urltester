; SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk 
; 
; SPDX-License-Identifier: EPL-2.0 

(ns urltester.core
  (:gen-class)
  (:require clojure.java.shell clojure.java.io)
  (:import java.lang.Runtime))

; this is the global regex used to match urls make this external
(def urlregex #"https:\/\/.*|http:\/\/.*")

; for repl testing 
(def p "test/urltester/example_files/test1.txt")

; don't remove just yet

;(clojure.string/replace urls #"https:\/\/|http:\/\/" "www."))

;(def secondmatch (clojure.string/replace firstmatch #"https:\/\/|http:\/\/" "www."))

;(def result (sh "ping" "-c 1" secondmatch))

(defn getUrls
  "Extract URLs from the filepath provided as an argument."
  [filePath]
  (def fulltext (slurp filePath))
  (re-seq urlregex fulltext))

(defn pingUrls
  "Pings each extracted URL."
  [urls]
  (spit "out.sh" (str "firefox --new-window " (clojure.string/join " --new-window " urls)))
  (clojure.java.shell/sh "bash" "out.sh")
  (clojure.java.shell/sh "rm" "out.sh")
  nil)

(defn checkFilePath
  "Verify that a user provided filepath is valid"
  [filePath]
  (if (.exists (clojure.java.io/file filePath))
    (pingUrls (getUrls filePath))
    (print (str "\nThe provided file at the path:\n\n" filePath "\n\ndoesn't exist.\n\n"))))

(defn -main
  
  "This, is the entry point to the program."
  [& args]
  (if (= (count args) 1)
    (checkFilePath (first args)) 
    (print "\nYou must call a filepath. Like this: \n\n> java -jar version-urltester.jar /full/path/to/file.txt\n\n"))
  (shutdown-agents))
