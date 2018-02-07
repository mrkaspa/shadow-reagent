(ns app.state
  (:require [reagent.core :refer [atom]]
            [cljs.spec.alpha :as s]))


(defonce app-state (atom {:count 0}))

(defn update-state
  [count]
  (swap! app-state assoc :count count))

(s/fdef update-state
  :args (s/cat :count string?))
