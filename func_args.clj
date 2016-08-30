;; Test some func call with the & syntax for muliple parameters
;; Always a vector [] for parameters
;;
;; Cider: C-c M-j to start the REPL


(defn simple [a b]
  "simple function with only two arguments"
  (println "a:" a)
  (println "b:" b))

(simple "jazz" "blues")
(simple "jazz") ;; ArityException when a parameter is missing


(defn multiple [first & args]
  "function with one mandatory argument and zero or several optional args"
  (println "first:" first)
  (println "args:" args))

(multiple "jazz") ;; args is nil
(multiple "jazz" "blues" 12) ;; args is (blues 12)
(multiple "jazz" '(blues 12 -3.14) "end") ;; args is (('blues 12 -3.14) "end")

