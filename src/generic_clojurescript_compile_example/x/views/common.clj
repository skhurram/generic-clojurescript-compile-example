(ns generic-clojurescript-compile-example.x.views.common
  (:require
    [noir.core :as nc]
    [hiccup.page-helpers :as hph]))

(nc/defpartial 
  layout [& content]
  (hph/html5
    [:head
     [:title "Example generic clj"]
     (hph/include-css "/css/reset.css")]
    [:body
     [:div#wrapper
      content]
     ]
    (hph/include-js "/cljs/bootstrap.js")))
