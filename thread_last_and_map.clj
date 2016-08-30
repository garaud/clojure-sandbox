;; ->> and map
;; try macro-expand
;;
;; Cider: C-c M-j


(def items [{:name "john" :age 34}
            {:name "alice" :age 32}
            {:name "miles" :age 56}])

;; just take :name
(map (fn [x] (:name x)) items)

;; add a third (key,val) pair
(into [] (map (fn [x] (assoc x :active false)) items))

;; same with thread-last ->> macro
(macroexpand '(->> items
                   (map (fn [x] (assoc x :active false)))
                   (into [])))
(->> items
     (map (fn [x] (assoc x :active false)))
     (into []))

;; map / filter with first and second
(map first [[1 2] [-5 -6] [0.1 0.2]])
(map second [[1 2] [-5 -6] [0.1 0.2]])
(filter second [[1 true] [-5 false] [0.1 true]])

;; map and filter with ->>
(macroexpand '(->> items (filter :active) (map first)))
(->> items (filter :active) (map first)) ;; () because false is a default value
