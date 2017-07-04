(defproject otheri "0.1.0-SNAPSHOT"
  :description "A board game, similar to Othello or Reversi, written in Clojure."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot otheri.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
