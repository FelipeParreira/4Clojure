#(let [it (clojure.set/intersection %1 %2)]
   (clojure.set/union (clojure.set/difference %1 it) (clojure.set/difference %2 it))
)
