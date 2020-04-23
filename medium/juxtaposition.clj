#(fn [& args]
   (loop [fns %& rs []]
     (if (empty? fns)
       rs
       (recur (rest fns) (conj rs (apply (first fns) args)))
  )
 )
)
