#(loop [sq %2 intp []]
   (if (empty? sq)
     (butlast intp)
     (recur (rest sq) (conj intp (first sq) %1))
  )
)
