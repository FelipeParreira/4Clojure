#(loop [div (min %1 %2)]
   (if (and (= 0 (rem %1 div)) (= 0 (rem %2 div)))
     div
     (recur (dec div))
   )
)
