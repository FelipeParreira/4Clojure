#(loop [sq % freq {}]
   (if (empty? sq)
     freq
     (let [el (first sq)]
     (recur (rest sq) (update-in freq [el] (fn [x] (+ 1 (or x 0)))))
   )
 )
)
