#(loop [sq %1 n 0]
   (if (= n %2)
     (first sq)
     (recur (rest sq) (inc n))
  )
)
