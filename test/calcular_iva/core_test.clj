(ns calcular-iva.core-test
  (:require [clojure.test :refer :all]
            [calcular-iva.core :refer :all]))

(deftest porcentajesDePago-100-test
  (testing "Porcentaje de Pago"
    " Cifra exacta"
    (is
     (= (porcentajesDePago 100) [100 40 40]))
    (is
     (= (porcentajesDePago "text") nil))))
