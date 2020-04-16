#(loop [sq1 %1 sq2 %2 prod 0]
   (if (or (empty? sq1) (empty? sq2))
     prod
     (recur (rest sq1) (rest sq2) (+ prod (* (first sq1) (first sq2))))
 )
)
