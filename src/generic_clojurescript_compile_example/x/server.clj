(ns generic-clojurescript-compile-example.x.server
  (:require [noir.server :as server]))

(server/load-views "src/generic_clojurescript_compile_example/x/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8888"))]
    (server/start port {:mode mode
                        :ns 'generic-clojurescript-compile-example})))

