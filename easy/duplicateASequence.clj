#(loop [sq % dp []]
   (if (empty? sq)
     (apply list dp)
     (let [el (first sq)]
       (recur (rest sq) (conj (conj dp el) el))
     )
 )
)
