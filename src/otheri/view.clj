(ns otheri.view
  (:use
   otheri.model
   [clojure.string :only (join)]))

(defn on-state-changed
  "handler for model change"
  [& e]
  ())

(defn init-view
  "initialize view"
  [handler]
  ((println "Welcome to the Battle Zone!")
   (println "'x' is Black and 'o' is White.")
   (println "Input the column name first, like 'a1' or 'b2'")
   (println "Just hit Enter to exit.")))

(defn start-ui
  "begin user interaction"
  []
  ())