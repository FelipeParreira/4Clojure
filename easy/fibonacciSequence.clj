#(loop [sq [] nm % el1 1 el2 1]
   (if (<= nm 0)
     sq
     (recur (conj sq el1) (dec nm) el2 (+ el1 el2))
 )
)
