#(loop [product (* %1 %2) digits '()]
   (if (= product 0)
    (if (= (count digits) 0)
      [0]
      (apply vector digits)
    )
    (let [digit (rem product 10)]
      (recur (/ (- product digit) 10) (conj digits digit))
    )
  ) 
)
