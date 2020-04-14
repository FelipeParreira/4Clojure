#(fn [nm]
   (loop [tm % exp 1]
     (if (<= tm 0)
       exp
       (recur (dec tm) (* exp nm))
     )
   )
 )
