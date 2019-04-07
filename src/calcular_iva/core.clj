(ns calcular-iva.core
  (:gen-class))

"Constantes"
(def IVA 21)
(def IRPF 15)

(defn parse-int [s]
   (Integer. (re-find  #"\d+" s )))

(defn formatNumberToEuros
  "Format number to euros"
  [inNumber]
  (def insNumber (str inNumber))
  (str 
    (if (re-find #"\.0$" insNumber) 
      (parse-int insNumber)
      (format "%.2f" (Float. inNumber))
      ) "€"))


(defn facturaSencilla
  "Muestra datos de una factura secilla"
  [inNumber]
  (def number (Float. (str inNumber)))
  (def numberWithIVA (* number (/ IVA 100)))
  (def numberWithIRPF (* number (/ IRPF 100)))
  (prn (str "FACTURA sencilla"))
  (prn (str "Introducida: " (formatNumberToEuros number)))
  (prn (str "IVA (+" IVA "%): " (formatNumberToEuros numberWithIVA)))
  (prn (str "IRPF (-" IRPF "%): " (formatNumberToEuros numberWithIRPF)))
  (prn (str "Total: " (formatNumberToEuros (- (+ number numberWithIVA) numberWithIRPF)))))

(defn facturaEducacion
  "Muestra datos de una factura secilla"
  [inNumber]
  (def number (Float. (str inNumber)))
  (def numberWithIVA (* number (/ IVA 100)))
  (def numberWithIRPF (* number (/ IRPF 100)))
  (prn (str "FACTURA educacion"))
  (prn (str "Introducida: " (formatNumberToEuros number)))
  (prn (str "IRPF (-" IRPF "%): " (formatNumberToEuros numberWithIRPF)))
  (prn (str "Total: " (formatNumberToEuros (- number numberWithIRPF)))))

(defn porcentajesDePago
  "Muestra los porcentajes de pago 40%, 40% y 20%"
  [inNumber]
  (def number (Float. (str inNumber)))
  (def number40 (* number (/ 40 100)))
  (def number20 (* number (/ 20 100)))
  (prn (str "40% - " (formatNumberToEuros number40)))
  (prn (str "40% - " (formatNumberToEuros number40)))
  (prn (str "20% - " (formatNumberToEuros number20)))
  [number number40 number20])

(defn -main
  "Calc IVA and IRPF"
  [input]
  (prn)
  (facturaSencilla input)
  (prn)
  (facturaEducacion input)
  (prn)
  (porcentajesDePago input))
