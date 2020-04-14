#(loop [nm %1 ranged []]
   (if (>= nm %2)
     ranged
     (recur (inc nm) (conj ranged nm))
  )
)
