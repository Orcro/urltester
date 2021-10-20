; SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk
; 
; SPDX-License-Identifier: Apache-2.0

; for development testing, notice there's no ns

;(clojure.string/replace urls #"https:\/\/|http:\/\/" "www."))

;(def secondmatch (clojure.string/replace firstmatch #"https:\/\/|http:\/\/" "www."))

;(def result (sh "ping" "-c 1" secondmatch))

; for repl testing 
(def p "test/urltester/example_files/test2.md")

(slurp "https://www.duckduckgo.com")
(slurp "https://duckduckgo.com")
(slurp "https://www.google.co.uk")

(getUrls p)
(map validUrl (getUrls p))
(checkFilePath p)
p



(defn pingUrls
  "Pings each URL in the list passed to this function"
  [urls]
  ; simply print the urls to start
  (map slurp urls))

(pingUrls (getUrls p))

(slurp (first (getUrls p)))

(getUrls p)

(type (slurp "https://www.google.co.uk"))

(type 1)

(type (slurp "https://www.g0groweip.co.uk"))

(if (= 
      (type (slurp "https://www.google.co.uk")) 
      java.lang.String)
  (println "yes")
  (println "no"))

(if (= 
      (type (slurp "https://www.g0gohrewlkje.com")) 
      java.lang.String)
  (println "yes")
  (println "no"))

(type (try
        (slurp "https://www.gheoiwqahjkil.com")
        true
        (catch Throwable e
          nil)))

(try
  (slurp "https://www.google.co.uk")
  true
  (catch Throwable e
    nil))

(defn validUrl
  "Validate a single url, return "
  [url]
  (try 
    (slurp url)
    true
    (catch Throwable e
      false)))

; (defn checkUrlList
;   "old function opens firefox tabs"
;   [urls]
;   (spit "out.sh" (str "firefox --new-window " (clojure.string/join " --new-window " urls)))
;   (clojure.java.shell/sh "bash" "out.sh")
;   (clojure.java.shell/sh "rm" "out.sh")
;   nil)

; true
(validUrl "https://www.google.co.uk")
; true
(validUrl "https://ask.fedoraproject.org/t/frequently-asked-questions-about-ask-fedora-faq/10235")
; false
(validUrl "https://wiggajsdklf")
; false
(validUrl "not")

(require '[clj-http.client :as client])
(client/get "https://google.com")
(client/get "https://duckduckgo.com")

(client/get "https://google.com")
(client/get "https://thisdhtlnalskd.com")
(client/get "https://www.thisdhtlnalskd.com")

(type nil)

(validUrl "https://fjhoeiwhqfo.com")
