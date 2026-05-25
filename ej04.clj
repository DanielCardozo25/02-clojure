/*4. Definir las funciones red, green, blue y alpha que reciban el valor numérico de un
color de 32 bits y devuelvan, respectivamente, los valores de las componentes rojo,
verde, azul y alfa (RGBA: red, green, blue, alpha) del mismo*/

(defn alpha [x] (format "%X" (bit-and x 0xFF)))
(defn blue [x] (format "%X" (bit-and (bit-shift-right x 8) 0xFF)))
(defn green [x] (format "%X" (bit-and (bit-shift-right x 16) 0xFF)))
(defn red [x] (format "%X" (bit-and (bit-shift-right x 24) 0xFF)))
(defn color [x] (do (red x)(green x)(blue x)(alpha x)))
