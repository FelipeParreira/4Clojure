#(loop [fct 1 nm %]
   (if (<= nm 0)
     fct
     (recur (* fct nm) (dec nm))
  )
)
