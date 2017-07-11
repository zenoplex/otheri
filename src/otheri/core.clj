(ns otheri.core ; define namespace
  (:use
   otheri.view
   otheri.model))

(defn on-command
  "view handler"
  [cmdline]
  (let [cmd (first cmdline)
        pos (second cmdline)]
    (cond
      (= cmd :move) (play-move pos)
      (= cmd :exit) (System/exit 0)
      :else nil)))

(defn -main
  "entry point"
  [& args]
  (init-view on-command)
  (init-game on-state-changed)
  (start-ui))