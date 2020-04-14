#(loop [sq (rest %) inl [] med [(first %)]]
	(if (empty? sq)
      (conj inl med)
      (let [el (first sq)]
       (if (= el (last med))
         (recur (rest sq) inl (conj med el))
         (recur (rest sq) (conj inl med) [el])
   )
  )
 )   
)
