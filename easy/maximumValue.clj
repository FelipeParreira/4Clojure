#(loop [mx (first %&) sq (rest %&)]
   (if (empty? sq)
     mx
     (recur 
      (let [el (first sq)]
        (if (> el mx)
          el
          mx
       )
      ) 
      (rest sq)
  )
 )
)
