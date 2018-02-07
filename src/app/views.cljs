(ns app.views
  (:require [app.state :refer [app-state]]
            [app.events :refer [increment decrement]]))

(defn header
  []
  [:div.banner
   [:h1 "A template for Reagent apps"]
   [:p "Starting point for ClojureScript apps with shadow-cljs, proto-repl, and reagent."]])

(defn counter
  []
  [:div.jumbotron
   [:div.btn-group
    [:button.btn {:on-click #(increment %)} "\u25B2"]
    [:p.counter (get @app-state :count)]
    [:button.btn {:on-click #(decrement %)} "\u25BC"]]])

(def banner-style
  {:style {:color "blue" :text-align :center}})

(defn banner
  []
  [:div banner-style "WARN"])

(defn app []
  [:div
   [header]
   [banner]
   [counter]])
