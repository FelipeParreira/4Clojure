#(loop [rv [] sq %]
   (if (empty? sq)
     rv
     (recur (conj rv (last sq)) (butlast sq))
 )
)
