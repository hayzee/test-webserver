(ns test-webserver.core
  (:gen-class)
  (:require [ring.adapter.jetty :as jetty]))

(defn handler [request]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (str request)})

(defn -main
  []
 (jetty/run-jetty handler {:port  8888
                           :join? false}))

