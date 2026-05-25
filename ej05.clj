/*5. Definir la función capicua? que reciba un número entero no negativo de hasta 5
dígitos y devuelva true si el número es capicúa; si no, false.*/

(defn capicua [x] (if (or (< x 0) (> x 99999)) "Nro invalido" (let[original (str x) al-reves (apply str (reverse original))] (= original al-reves) ) ))
