(ns otheri.model-test
  (:require [clojure.test :refer :all]
            [otheri.model :refer :all]))

(deftest test-col-from-pos
  (testing "should get column value from position"
    (is (= 2 (col-from-pos 10)))
    (is (= 0 (col-from-pos 8)))))

(deftest test-row-from-pos
  (testing "should get row value from position"
    (is (= 1 (row-from-pos 10)))
    (is (= 1 (row-from-pos 8)))))

(deftest test-pos-from-rowcol
  (testing "should get position from row col value"
    (is (= 0 (pos-from-rowcol 0 0)))
    (is (= 8 (pos-from-rowcol 1 0)))
    (is (= 1 (pos-from-rowcol 0 1)))
    (is (= 10 (pos-from-rowcol 1 2)))
    (is (= 63 (pos-from-rowcol 7 7)))))