#(loop [sq %1 ind 0 indexed []]
   (if (empty? sq)
     indexed
     (recur (rest sq) (inc ind) (conj indexed [(first sq) ind]))
  )
)
