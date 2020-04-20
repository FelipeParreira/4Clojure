#(loop [ind %1 sq %2]
   (if (= 0 ind)
     sq
     (if (> ind 0)
       (recur (dec ind) (conj (apply vector (rest sq)) (first sq)))
       (recur (inc ind) (conj (butlast sq) (last sq)))
    )
  )
)
