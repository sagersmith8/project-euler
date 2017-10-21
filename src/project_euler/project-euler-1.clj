(ns project-euler.project-euler-1)

(defn compute-problem []  (reduce + (into #{} (concat (range 0 1000 5) (range 0 1000 3)))))
