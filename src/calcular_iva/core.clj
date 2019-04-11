(ns calcular-iva.core
  (:gen-class))

"Constantes"
(def IVA 21)
(def IRPF 15)

(defn fixDecimalsToPrice
  "Arregla los decimales para el precio"
  [inNumber]
  (clojure.string/replace (format "%.2f" (Float. (str inNumber))) #"\.00" ""))

(defn calcWithIVA
  "Calcula precio con IVA"
  [number]
  (* number (/ IVA 100)))

(defn calcWithIRPF
  "Calcula precio con IRPF"
  [number]
  (* number (/ IRPF 100)))

(defn formatNumberToEuros
  "Format number to euros"
  [inNumber]
  (str (fixDecimalsToPrice inNumber) "€"))

(defn facturaSencilla
  "Muestra datos de una factura secilla"
  [inNumber]
  (def number (Float. (str inNumber)))
  (prn (str "FACTURA sencilla"))
  (prn (str "Introducida: " (formatNumberToEuros number)))
  (prn (str "IVA (+" IVA "%): " (formatNumberToEuros (calcWithIVA number))))
  (prn (str "IRPF (-" IRPF "%): " (formatNumberToEuros (calcWithIRPF number))))
  (prn (str "Total: " (formatNumberToEuros (- (+ number (calcWithIVA number)) (calcWithIRPF number))))))

(defn facturaEducacion
  "Muestra datos de una factura secilla"
  [inNumber]
  (def number (Float. (str inNumber)))
  (prn (str "FACTURA educacion"))
  (prn (str "Introducida: " (formatNumberToEuros number)))
  (prn (str "IRPF (-" IRPF "%): " (formatNumberToEuros (calcWithIRPF number))))
  (prn (str "Total: " (formatNumberToEuros (- number (calcWithIRPF number))))))

(defn porcentajesDePago
  "Muestra los porcentajes de pago 40%, 40% y 20%"
  [inNumber]
  (def number (Float. (str inNumber)))
  (def number40 (* number (/ 40 100)))
  (def number20 (* number (/ 20 100)))
  (prn (str "40% - " (formatNumberToEuros number40)))
  (prn (str "40% - " (formatNumberToEuros number40)))
  (prn (str "20% - " (formatNumberToEuros number20)))
  [(fixDecimalsToPrice number40) (fixDecimalsToPrice number40) (fixDecimalsToPrice number20)])

(defn -main
  "Calc IVA and IRPF"
  [input]
  (prn)
  (facturaSencilla input)
  (prn)
  (facturaEducacion input)
  (prn)
  (porcentajesDePago input))
