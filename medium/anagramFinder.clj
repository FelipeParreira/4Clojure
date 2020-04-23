#(loop [mp {} sq %]
   (if (empty? sq)
     (set (filter (fn [x] (> (count x) 1)) (vals mp)))
     (let [stwd (clojure.string/join "" (sort (first sq))) wd (first sq)]
       (if (contains? mp stwd)
         (recur (update-in mp [stwd] (fn [x] (conj x wd))) (rest sq))
         (recur (assoc mp stwd #{wd}) (rest sq))
      )
     )
 )
)
