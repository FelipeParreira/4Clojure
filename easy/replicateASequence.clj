#(loop [sq %1 rpt []]
   (if (empty? sq)
     rpt
     (recur (rest sq) (into rpt (take %2 (repeat (first sq)))))
 )
)
