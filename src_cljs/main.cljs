(ns main
  (:require 
    [pinot.dom :as pdom]
    [pinot.html :as ph]
    
    ;importing from generic .clj file in src
    [generic-clojurescript-compile-example.test-generic :as tg]
    ))


(defn log-str [x]
  (.log js/console (pr-str x)))

(log-str "Start")

(let [b (first (pdom/query "body"))]
  (pdom/append b 
               (ph/html [:p "pinot says: am here"]))

  (pdom/append b 
               (ph/html [:p (str "Generic clojurescript square says:" (tg/square 4))])))

(log-str "Complete")

