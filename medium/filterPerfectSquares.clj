#(loop [nums (clojure.string/split % #",") squares []]
   (if (empty? nums)
     (clojure.string/join "," squares)
     (let [root (Math/sqrt (Integer/parseInt (first nums))) el (first nums)]
     	(if (=  (Math/floor root) root)
       (recur (rest nums) (conj squares el))
       (recur (rest nums) squares)
   )  
  )  
 )
)
