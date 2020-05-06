#(loop [fun %1 sq %2 classes {}]
   (if (empty? sq)
     (set (vals classes))
     (let [vl (fun (first sq)) el (first sq)]
       (recur fun (rest sq) (update-in classes [vl] (fn [x] (conj (set x) el))))
  )
 )  
)
