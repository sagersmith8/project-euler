(ns project-euler.project-euler-2)

(defn compute-fib [[first-key second-key]]
  [second-key (+ first-key second-key)])

(defn fibby []
  (map first (iterate compute-fib [0 1])))

(defn compute-problem 
  [] 
  (reduce + (filter even? (take-while (partial > 4000000) (fibby)))))
