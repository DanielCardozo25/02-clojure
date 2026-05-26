/*7. Definir la función invertir que reciba un número entero no negativo y lo devuelva
espejado. */

(defn invertir [x] (if (< x 0) "Nro invalido" (let [original (str x) espejado (apply str (reverse original)) ] espejado) ) )
