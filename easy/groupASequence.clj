#(loop [sq %2 grouped {}]
   (if (empty? sq)
     grouped
     (let [v (%1 (first sq)) el (first sq)]
       (if (contains? grouped v)
         (recur (rest sq) (update-in grouped [v] (fn [x] (conj x el))))
         (recur (rest sq) (assoc grouped v [el]))
      )
     )
 )
)
