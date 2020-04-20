#(loop [sq % dedup [] dedupSet #{}]
   (if (empty? sq)
     dedup
     (let [el (first sq)]
       (if (contains? dedupSet el)
       (recur (rest sq) dedup dedupSet)
       (recur (rest sq) (conj dedup el) (conj dedupSet el))
    )
   )
 )
)
