(ns generic-clojurescript-compile-example.x.views.welcome
  (:require [generic-clojurescript-compile-example.x.views.common :as common]
            [generic-clojurescript-compile-example.test-generic :as tg]
            )
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Generic square says :" (tg/square 4)]))
