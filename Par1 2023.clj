1. (λx.a ((λy.y) r) ((λa.g) r)) (λxy.y x)

Orden Normal 
beta (a ((λy.y) r) ((λa.g) r))
beta (a ((λy.y) r) (g))
beta (a y g)

Orden Aplicativo
beta (λx.a (r) (g)) (λxy.y x)
beta (a r g)

Clojure
(defn esPerfecto [x] (map (partial / x) (range 1 (- x 1) ) ) )
Calcula las divisiones

(defn esPerfecto [x] (map (partial / x) (map (partial / x) (range 1 x)) ) )
devuelve nros enteros

(defn restoCero [x] (filter #(zero? (rem x %))(range 1 x)) )
duelve los nros enteros
(defn sumaLista [x] (reduce + (restoCero x) ))
(defn esPerfecto? [x] (zero? (- x (sumaLista x))))

sumDivsPropios(n) == n
(defn esPerfecto [n] (= n sumDivsPropios) )
(defn sumDivsPropios[n] (reduce + (divsPropios n) ) )
(defn divsPropios[n] (filter(fn [x](= 0(mod n x))) (range 1 n)))




(defn corr [x] (- x (esperfecto x) ) )
