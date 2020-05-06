#(fn [& sq] (loop [fun % sq sq]
   (if (not (fn? fun))
     fun
     (recur (fun (first sq)) (rest sq))
  )
 )
)
