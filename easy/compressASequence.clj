#(loop [sq % cmp []]
   (if (empty? sq)
     cmp
     (let [el (first sq)]
       (if (not= el (last cmp))
		 (recur (rest sq) (conj cmp el))
		 (recur (rest sq) cmp)         
       )
     )
  )
)
