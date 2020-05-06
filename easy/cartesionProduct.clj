#(loop [sq1 %1 sq2 (apply list %2) nm 0 product []]
   (if (empty? sq1)
     (set product)
     (if (= nm (- (count sq2) 1))
       (recur (rest sq1) sq2 (rem (inc nm) (count sq2)) (conj product [(first sq1) (nth sq2 nm)]))
       (recur sq1 sq2 (rem (inc nm) (count sq2)) (conj product [(first sq1) (nth sq2 nm)]))
     )
     
 )
)
