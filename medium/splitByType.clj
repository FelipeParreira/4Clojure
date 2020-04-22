#(loop [sq % spt [] mp {}]
   (if (empty? sq)
     spt
     (let [typ (class (first sq)) el (first sq)]
       (if (contains? mp typ)
         (recur (rest sq) (update-in spt [(mp typ)] (fn [x] (conj x el))) mp)
         (recur (rest sq) (conj spt [el]) (assoc mp typ (count spt)))
   )
       
  )
 )
)
