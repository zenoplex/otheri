(ns otheri.view-test
  (:require [clojure.test :refer :all]
            [otheri.view :refer :all]))

(deftest test-col-headers
  (testing "should return column headers"
    (is (= ["a" "b" "c" "d" "e" "f" "g" "h"] col-headers))))

(deftest test-col-header-str
  (testing "should return str of col-headers"
    (is (= " a b c d e f g h" col-header-str))))