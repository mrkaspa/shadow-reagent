(ns app.events
  (:require [app.state :refer [app-state update-state]]))

(defn double-n
  [n fun]
  (let [d-fun (comp fun fun)]
    (d-fun n)))

(defn double-inc
  [n]
  (double-n n inc))

(defn double-dec
  [n]
  (double-n n dec))

(defn increment
  [event]
  (.preventDefault event)
  (->
    (:count @app-state)
    (double-inc)
    (update-state)))

(defn decrement
  [event]
  (.preventDefault event)
  (->
    (:count @app-state)
    (double-dec)
    (update-state)))
