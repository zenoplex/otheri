(ns otheri.model)

(def b-size 8)
(def first-pos 0)
(def last-pos (* b-size b-size))
(def all-pos (range first-pos last-pos))
(def first-col 0)
(def last-col b-size)
(def first-row 0)
(def last-row b-size)

(defn col-from-pos
  "convert to column from position"
  [pos]
  (mod pos b-size))

(defn row-from-pos
  "convert to row from position"
  [pos]
  (quot pos b-size))

(defn pos-from-rowcol
  "retrieve position from row col value"
  [row col]
  (+ (* row b-size) col))

(def dirs #{:n :ne :e :se :s :sw :w :nw})

(def board (ref []))

(def player (ref nil))

(defn play-move
  "set to pos"
  [pos]
  ())

(defn init-game
  "initialize game"
  [observ]
  ())