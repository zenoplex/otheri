(ns otheri.view
  (:use
   otheri.model
   [clojure.string :only (join)]))

(def code-a 97) ; code for letter \a
(def code-curly 123) ; next of letter \z 
(def col-headers
  (take b-size (map (comp str char) (range code-a code-curly))))
(def col-header-str
  (str " " (join " " col-headers)))

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