; SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk 
; 
; SPDX-License-Identifier: Apache-2.0


; This file is used by Clojure & Leiningen to manage the project.


(defproject urltester "0.5.1"
  :description "A Java applet written in Clojure for testing the validity of URLs within a text-based file."
  :url "https://github.com/galacticalex/urltester"
  :license {:name "Apache-2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [clj-http "3.12.3"]
                 [incanter "1.9.3"]
                 [io.github.nextjournal/clerk "0.5.346"]]
  :main ^:skip-aot urltester.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})

