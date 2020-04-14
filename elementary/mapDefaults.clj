#(loop [ks %2 mapping {}]
    (if (empty? ks)
      mapping
      (recur (rest ks) (assoc mapping (first ks) %1))
   )
)
