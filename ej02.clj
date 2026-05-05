; V1 (by Elias)
(defn segundos[a b c d](+ d (* 60 (+ c (* 60 (+ b (* 24 a)) )) )))

; V2 (by Fabrizio)
(defn segundos[d h m s](+ (* d 86400)(* h 3600)(* m 60) s))
