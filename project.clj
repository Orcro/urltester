(defproject webtester "0.0.1"
  :description "A Java applet written in Clojure for testing the validity of URLs within a text-based file."
  :url "https://github.com/galacticalex/urltester"
  :license {:name "EPL-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot webtester.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
