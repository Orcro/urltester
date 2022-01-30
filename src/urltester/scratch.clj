; SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk
; 
; SPDX-License-Identifier: Apache-2.0




(require '[clj-http.client :as client]) ; for repl dev





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

(checkFilePath "test/urltester/example_files/test2.md")

(def filePath "test/urltester/example_files/test2.md")
(checkUrlList (getUrls filePath))
(tryUrl "https://www.google.co.uk")
(getUrls filePath)

(checkFilePath filePath)
(handleStartup filePath)
(def filePath (list filePath))
(first filePath)
(-main filePath)

; handleStartup tests

(-main "test/urltester/example_files/test2.md") ; should works? does
(-main "te") ; should not work? doesn't
(-main "test/urltester/example_files/test2.md" " andmore") ; shouldn't work? doesn't

; --
(-main "test/urltester/example_files/test2.md")
(getUrls "test/urltester/example_files/test2.md") 



(def workingUrl "https://www.google.co.uk")
(def brokeUrl "https://www.gfjewiofjwoogle.co.uk")

(defn tryUrl
  "Sends an HTTP GET request to the passed argument. If the request is successful, prints true, else false."
  [url]
  (let [response? (try
                    (client/get url)
                    "valid"
                    (catch Throwable e
                      "invalid"))]
    (println (str "url is " response?))))


(tryUrl workingUrl)
(tryUrl brokeUrl)

(require '[incanter.stats :as stats]) 
(stats/scalar-abs 8) ; => 8
(stats/scalar-abs -8) ; => 8 yay


(println "hi")

(def dat [:one :two :three :three])

dat

(map println dat)

;; work on #9 
(defn remove-duplicates
  "Identify unique values in the *input* and return them in a list."
  [input]
  (map println input))

(remove-duplicates dat)

(source let)


