(ns app.core
  (:require [reagent.core :as reagent :refer [atom]]
            [app.views :as views]
            [cljs.spec.alpha :as s]
            [cljs.spec.test.alpha :as st]
            [expound.alpha :as expound]))

(enable-console-print!)
(set! s/*explain-out* expound/printer)


(defn ^:export main []
  (let [elem (.getElementById js/document "demo")
        dest (.getElementById js/document "demo1")
        i (.-innerHTML elem)]
    (set! (.-innerHTML dest) (str i " xd ")))
  (reagent/render-component
    [views/app]
    (.getElementById js/document "app")))

(st/instrument)
