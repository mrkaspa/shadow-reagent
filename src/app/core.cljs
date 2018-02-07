(ns app.core
  (:require [reagent.core :as reagent :refer [atom]]
            [app.views :as views]
            [cljs.spec.alpha :as s]
            [cljs.spec.test.alpha :as st]
            [expound.alpha :as expound]))

(set! s/*explain-out* expound/printer)

(defn ^:export main []
  (reagent/render-component [views/app]
                            (.getElementById js/document "app")))

(st/instrument)
