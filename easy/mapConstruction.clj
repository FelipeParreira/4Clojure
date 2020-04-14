#(loop [mp {} ks %1 vs %2]
   (if (or (empty? ks) (empty? vs))
     mp
     (recur (assoc mp (first ks) (first vs)) (rest ks) (rest vs))
  )
)
