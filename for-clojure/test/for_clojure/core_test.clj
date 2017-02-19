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
  (testing "penultimate element (last but one) - problem 20"
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

(deftest test-problem-23-reverse-a-sequence
  (testing "reverse a sequence - problem 23 *special restrictions*: 'reverse' and 'rseq'"
    (is (= (my-reverse [1 2 3 4 5]) [5 4 3 2 1]))
    (is (= (my-reverse (sorted-set 5 7 2 7)) '(7 5 2)))
    (is (= (my-reverse [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]]))))

(deftest test-problem-25-find-odd-numbers
  (testing "find the odd numbers from a sequence - problem 25"
    (is (= (find-odd #{1 2 3 4 5}) '(1 3 5)))
    (is (= (find-odd [4 2 1 6]) '(1)))
    (is (= (find-odd [2 2 4 6]) '()))
    (is (= (find-odd [1 1 1 3]) '(1 1 1 3)))))

(deftest test-problem-26-fibonacci-sequence
  (testing "return the first X fibonacci numbers - problem 26"
    (is (= (fibonacci 3) '(1 1 2)))
    (is (= (fibonacci 6) '(1 1 2 3 5 8)))
    (is (= (fibonacci 8) '(1 1 2 3 5 8 13 21)))))

(deftest test-problem-27-palindrome-detector
  (testing "find if the sequence is a palindrome - problem 27"
    (is (false? (palindrome? '(1 2 3 4 5))))
    (is (true? (palindrome? "racecar")))
    (is (true? (palindrome? [:foo :bar :foo])))
    (is (true? (palindrome? '(1 1 3 3 1 1))))
    (is (false? (palindrome? '(:a :b :c))))))

(deftest test-problem-134-a-nil-key
  (testing "return true if there a nil value for a given key - problem 134"
    (is (true?  (nil-key-value :a {:a nil :b 2})))
    (is (false? (nil-key-value :b {:a nil :b 2})))
    (is (false? (nil-key-value :c {:a nil :b 2})))))

(deftest test-problem-156-map-defaults
  (testing "build a map with a default value - problem 156"
    (is (= (map-defaults 0 [:a :b :c]) {:a 0 :b 0 :c 0}))
    (is (= (map-defaults "x" [1 2 3]) {1 "x" 2 "x" 3 "x"}))
    (is (= (map-defaults [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]}))))

