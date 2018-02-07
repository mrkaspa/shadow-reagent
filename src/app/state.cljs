(ns app.state
  (:require [reagent.core :refer [atom]]))

(defonce app-state (atom {:count 0}))

(defn update-state
  [count]
  (swap! app-state assoc :count count))
