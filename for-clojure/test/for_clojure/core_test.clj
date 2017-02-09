(ns for-clojure.core-test
  (:require [clojure.test :refer :all]
            [for-clojure.core :refer :all]))


(deftest test-problem-15-double-down
  (testing "double down - problem 15"
    (is (= (double-down 2) 4))
    (is (= (double-down -3) -6))
    (is (= (double-down 0) 0))))

(deftest test-problem-19-last-element
  (testing "last element - problem 19"
    (is (= (last-element [1 2 3 4 5]) 5))
    (is (= (last-element '(5 4 3)) 3))
    (is (= (last-element ["b" "c" "d"]) "d"))))

(deftest test-problem-20-penultimate-element
  (testing "penultimate element (last but one)"
    (is (= (penultimate (list 1 2 3 4 5)) 4))
    (is (= (penultimate ["a" "b" "c"]) "b"))
    (is (= (penultimate [[1 2] [3 4]]) [1 2]))))

(deftest test-problem-21-nth-element
  (testing "Nth element - problem 21 *special restrictions*: 'nth'"
    (is (= (element-at '(4 5 6 7) 2) 6))
    (is (= (element-at [:a :b :c] 0) :a))
    (is (= (element-at [1 2 3 4] 1) 2))
    (is (= (element-at '([1 2] [3 4] [5 6]) 2) [5 6]))))

(deftest test-problem-22-count-a-sequence
  (testing "count a sequence -problem 22 *special restrictions*: 'count'"
    (is (= (element-nb '(1 2 3 3 1)) 5))
    (is (= (element-nb "Hello World") 11))
    (is (= (element-nb [[1 2] [3 4] [5 6]]) 3))
    (is (= (element-nb '(13)) 1))
    (is (= (element-nb '(:a :b :c)) 3))))
