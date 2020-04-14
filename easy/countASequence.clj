#(loop [sq % total 0]
   (if (empty? sq)
     total
     (recur (rest sq) (inc total))
 )
)
