#(loop [sq %]
   (if (<= (count sq) 1)
     true
     (let [ft (first sq) lt (last sq)]
       (if (not= ft lt)
         false
         (recur (rest (butlast sq)))
   )
  )
 )
)
