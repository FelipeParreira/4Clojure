#(loop [[word & words] (clojure.string/split % #"-")]
   (if (empty? words)
     word
     (recur (cons (str word (clojure.string/capitalize (first words))) (rest words)))
  )
)
