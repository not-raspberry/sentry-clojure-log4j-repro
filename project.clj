(defproject sentry-repro "0.1.0-SNAPSHOT"
  :description "Sentry Log4j crash reproduction"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.4.0"]
                 [org.slf4j/slf4j-log4j12 "1.7.25"]
                 [io.sentry/sentry-clj "0.5.1"]
                 [io.sentry/sentry-log4j "1.6.3"]
                 ]
  :main ^:skip-aot sentry-repro.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
