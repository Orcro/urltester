(ns webtester.core
  (:gen-class)
  (:require clojure.java.shell))

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

(defn -main
  "This, is the entry point to the program."
  [& args]
  (print (pingUrls (getUrls (first args)))))
