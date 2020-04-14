#(loop [sq %1 ind 1 dropped []]
   (if (empty? sq)
     dropped
     (if (= 0 (rem ind %2))
       (recur (rest sq) (inc ind) dropped)
       (recur (rest sq) (inc ind) (conj dropped (first sq)))
    )
  )
)
