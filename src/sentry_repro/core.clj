(ns sentry-repro.core
  (:require [clojure.tools.logging :as log]
            [sentry-clj.core :as sentry])
  (:gen-class))

(defn -main [& args]
  (log/error "ERROR")
  (println "Success"))
