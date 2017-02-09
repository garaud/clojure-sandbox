(ns for-clojure.core-test
  (:require [clojure.test :refer :all]
            [for-clojure.core :refer :all]))


(deftest test-problem-15-double-down
  (testing "double down - problem 15"
    (is (= (double-down 2) 4))
    (is (= (double-down -3) -6))
    (is (= (double-down 0) 0))))
