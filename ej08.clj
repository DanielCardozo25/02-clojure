/* Definir la función nth-fibo que reciba un número entero no negativo y devuelva el
correspondiente término de la sucesión de Fibonacci. */

(defn nth-fibo [x] (if (< x 0) "Nro no valido" (reduce *(map #(* 1 %) (range 1 (+ x 1)) ) ) ) )
