(ns calcular-iva.core
  (:gen-class))

"Constantes"
(def IVA 21)
(def IRPF 15)

(defn facturaSencilla
  "Muestra datos de una factura secilla"
  [inNumber]
  (def number (Float. inNumber))
  (def numberWithIVA (* number (/ IVA 100)))
  (def numberWithIRPF (* number (/ IRPF 100)))
  (println "FACTURA sencilla")
  (println "Introducida:" number " €" )
  (println "IVA (+" IVA "%):" numberWithIVA "€" )
  (println "IRPF (-" IRPF "%):" numberWithIRPF "€" )
  (println "Total:" (- (+ number numberWithIVA) numberWithIRPF) "€" ))

(defn facturaEducacion
  "Muestra datos de una factura secilla"
  [inNumber]
  (def number (Float. inNumber))
  (def numberWithIVA (* number (/ IVA 100)))
  (def numberWithIRPF (* number (/ IRPF 100)))
  (println "FACTURA educacion")
  (println "Introducida:" number " €" )
  (println "IRPF (-" IRPF "%):" numberWithIRPF "€" )
  (println "Total:" (- number numberWithIRPF) "€" ))

(defn porcentajesDePago
  "Muestra los porcentajes de pago 40%, 40% y 20%"
  [inNumber]
  (def number (Float. inNumber))
  (def number40 (* number (/ 40 100)))
  (def number20 (* number (/ 20 100)))
  (println "40% -" number40 "€")
  (println "40% -" number40 "€")
  (println "20% -" number20 "€"))

(defn -main
  "Calc IVA and IRPF"
  [input]
  (println)
  (facturaSencilla input)
  (println)
  (facturaEducacion input)
  (println)
  (porcentajesDePago input))
