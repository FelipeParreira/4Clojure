#(if (%1 %2 %3)
   :lt
   (if (%1 %3 %2)
     :gt
     :eq
  )
)