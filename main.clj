(defn avrgmark
  [values]
  (if (empty? values)
    0
    (double(/ (reduce + values) (count values)))))

(def mark{"Inese" 10, "Vasja" 8, "Petja" 4, "Natasha" 7, "Anja" 10, "Lauris" 6, "Sandra" 8, "Krišjanis" 9})

(require '[clojure.string :as str])

(def result
  (avrgmark
    (map #(second %)
      (filter
        (fn [[key]] (str/ends-with? key "a"))
        mark))))