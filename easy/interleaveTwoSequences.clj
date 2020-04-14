#(loop [sq1 %1 sq2 %2 inl []]
   (if (or (empty? sq1) (empty? sq2))
     inl
     (recur (rest sq1) (rest sq2) (conj inl (first sq1) (first sq2)))
  )
)
