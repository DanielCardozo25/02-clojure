/*5. Definir la función capicua? que reciba un número entero no negativo de hasta 5
dígitos y devuelva true si el número es capicúa; si no, false.*/

(defn capicua [x] (if (and(> x 0) (< x 100000)) (let [original (str x) al-reves (apply str (reverse original))] (= original al-reves)) "Nro no valido"))
