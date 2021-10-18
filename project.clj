; SPDX-FileCopyrightText: 2021 Orcro Ltd. team@orcro.co.uk 
; 
; SPDX-License-Identifier: Apache-2.0

(defproject urltester "0.0.4"
  :description "A Java applet written in Clojure for testing the validity of URLs within a text-based file."
  :url "https://github.com/galacticalex/urltester"
  :license {:name "Apache-2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot urltester.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
