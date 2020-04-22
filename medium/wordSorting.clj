#(let [words (clojure.string/split (.replaceAll % "[^A-Za-z ]" "") #" ")]
   (sort (fn [a b] (compare (clojure.string/lower-case a) (clojure.string/lower-case b))) words)
)
