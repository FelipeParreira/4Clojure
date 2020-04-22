#(loop [sq % mapped {} vs []]
   (if (empty? sq)
     (if (empty? vs)
       mapped
       (assoc mapped (first vs) (rest vs))
     )
     (let [el (first sq)]
       (if (keyword? el)
         (if (empty? vs)
           (recur (rest sq) mapped (conj vs el))
           (recur (rest sq) (assoc mapped (first vs) (rest vs)) [el])
         )
         (recur (rest sq) mapped (conj vs el))
   )
  )
 )
)
