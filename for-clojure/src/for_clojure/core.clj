(ns for-clojure.core
  (:gen-class))

;; problem 15
(defn double-down [x]
  "double x"
  (* x 2))

;; problem 19
(defn last-element [col]
  "get the last element"
  (first (reverse col)))

;; problem 20
(defn penultimate [col]
  "get the last but one element"
  (nth (reverse col) 1))

;; problem 21
(defn element-at [col n]
  "return the nth element (nth is a restriction)"
  (first (drop n col)))

;; problem 22
(defn element-nb [col]
  "count the number of elements (count is a restriction)"
  (reduce (fn [acc v] (inc acc)) 0 col))

;; problem 134
(defn nil-key-value [k hash]
  "return true if the value of the key is nil"
  (if (contains? hash k)
    (nil? (k hash))
    false))

;; problem 156
(defn map-defaults [value keys]
  "map with default values"
  {})

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello 4Clojure!! lein test to launch all tests"))
