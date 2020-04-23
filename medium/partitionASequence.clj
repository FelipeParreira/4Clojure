#(loop [sq %2 pt []]
   (if (< (count sq) %1)
     pt
     (recur (drop %1 sq) (conj pt (take %1 sq)))
 )
)
