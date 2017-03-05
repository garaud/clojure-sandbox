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

;; problem 23
(defn my-reverse [col]
  "reverse a sequence (reverse and rseq are restrictions)"
  (reduce (fn [acc val] (into [val] acc)) [] col))

;; problem 25
(defn find-odd [seq]
  "find the odd numbers from a sequence"
  (filter #(= (rem % 2) 1) seq))

;; problem 26
(defn fibonacci [n]
  "return the first N fibonacci numbers."
  (loop [prev 0 cur 1 count n res (list 1)]
    (if (= count 1)
      (reverse res)
      (recur cur (+ prev cur) (dec count) (conj res (+ prev cur))))))

;; problem 27
(defn palindrome? [col]
  "is the sequence palindrome?"
  (= (seq col) (reverse col)))

;; problem 28
(defn my-flatten [col]
  "flatten a sequence"
  (letfn [(nested [cur acc]
            (cond
              (not (coll? cur)) (conj acc cur)
              (empty? cur) acc
              :else (nested (first cur) (nested (rest cur) acc))))]
    (nested col ())))

;; problem 29
(defn caps [sentence]
  "only return capital letters"
  (clojure.string/replace sentence #"[^A-Z]" ""))

;; problem 30
(defn remove-duplicate [col]
  "compress a sequence, remove consecutive duplicates"
  (reverse
   (reduce
    (fn [acc val] (if-not (= (first acc) val) (conj acc val) acc)) () col)))

;; problem 31
(defn pack-duplicate [col]
  "pack consecutive duplicates into sub-lists"
  (loop [col col
         prev (first col)
         cur (second col)
         seq ()
         res ()]
    (if (empty? col)
      (reverse (conj res seq))
      (recur (rest col) ; col
             cur ; prev
             (second col) ; cur
             (if (= cur prev)
               (conj seq cur)
               (list cur)) ; seq
             (if (= cur prev)
               res
               (conj res seq))))))

;; problem 32
(defn duplicate [col]
  "duplicate each element of a sequence"
  (reverse (reduce (fn [acc val] (conj acc val val)) () col)))

;; problem 33
(defn my-replicate [col n]
  "replicate each element of a sequence"
  col)

;; problem 38
(defn max-value [& args]
  "maxiumum value"
  (reduce (fn [m val] (if (> val m) val m)) 0 args))

;; problem 134
(defn nil-key-value [k hash]
  "return true if the value of the key is nil"
  (if (contains? hash k)
    (nil? (k hash))
    false))

;; problem 156
(defn map-defaults [value keys]
  "map with default values"
  (into {} (map (fn [x] {x value}) keys)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello 4Clojure!! lein test to launch all tests"))
