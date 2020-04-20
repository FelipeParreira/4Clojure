#(loop [sq %1 nm 0 inl []]
   (if (empty? sq)
     inl
   (let [el (first sq)]
   		(if (> (inc nm) (count inl))
     (recur (rest sq) (rem (inc nm) %2) (conj inl [el]))
     (recur (rest sq) (rem (inc nm) %2) (update-in inl [nm] (fn [x] (conj x el))))
  	)  
   )
 )
)
