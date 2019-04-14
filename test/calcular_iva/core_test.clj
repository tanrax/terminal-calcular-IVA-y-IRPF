(ns calcular-iva.core-test
  (:require [clojure.test :refer :all]
            [calcular-iva.core :refer :all]))

(deftest fixDecimalsToPriceTest
  (testing "Fix decimals to Price"
    "Formatod de decimales a precio"
    (is (= (fixDecimalsToPrice 101) "101"))
    (is (= (fixDecimalsToPrice 10.1) "10.10"))
    (is (= (fixDecimalsToPrice 10.04) "10.04"))
    (is (= (fixDecimalsToPrice 10.1234) "10.12"))))

(deftest porcentajesDePago-100-test
  (testing "Porcentaje de Pago"
    " Cifra exacta"
    (is (= (porcentajesDePago 100) ["40" "40" "20"]))
    (is (= (porcentajesDePago 50.3) ["20.12" "20.12" "10.06"]))))

(deftest formatNumberToEurosTest
  (testing "Formato de numero"
    (is (= (formatNumberToEuros 99) "99€"))
    (is (= (formatNumberToEuros "99") "99€"))
    (is (= (formatNumberToEuros 99.01) "99.01€"))
    (is (= (formatNumberToEuros "99.01") "99.01€"))
    (is (= (formatNumberToEuros 99.01) "99.01€"))
    (is (= (formatNumberToEuros "99.01") "99.01€"))))
 
(deftest calcIVA
  (testing "Calcula IVA"
    (is (= (float (calcWithIVA 100)) 21.0))
    (is (= (str (float(calcWithIVA 110))) "23.1"))
    (is (= (calcWithIVA 0) 0))))

(deftest calcIRPF
  (testing "Calcula IRPF"
    (is (= (calcWithIRPF 100) 15))
    (is (= (float (calcWithIRPF 110)) 16.5))
    (is (= (calcWithIRPF 0) 0))))

