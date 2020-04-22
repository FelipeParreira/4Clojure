#(loop [bin % factor 1 nm 0]
   (if (empty? bin)
     nm
     (recur (butlast bin) (* factor 2) (+ nm (* factor (- (int (last bin)) 48))))
  )
)
