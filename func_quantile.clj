;; function to compute a set of quantiles
;; should return an hashmap with the values and its related quantile

;; Can test on a randome sequence of 5000 values
(def seq-test (take 5000 (repeatedly rand)))


(defn quantile [q xs]
  "compute the kth quantile"
  (let [n (dec (count xs))
        i (-> (* q n)
              (+ 1/2)
              int)]
    (nth (sort xs) i)))


(quantile 0.25 seq-test)


(defn quantiles [qs xs]
  "version without hashmap"
  (let [f (fn [q] (quantile q xs))]
  (map f qs)))

(quantiles [0.1 0.25 0.5 0.75 0.9] seq-test)


(defn quantiles-2 [qs xs]
  "version with hashmap"
  (let [f (fn [q] (quantile q xs))]
    (zipmap qs (map f qs))))

(quantiles-2 [0.1 0.25 0.5 0.75 0.9] seq-test)
