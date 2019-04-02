# Calcular IVA y IRPF por terminal

## Descargar

curl /target/uberjar/calcular_iva-1.0.0-standalone.ja

## Uso

``` bash
java -jar calcular_iva-0.1.0-standalone.jar [numero]
```

## Ejemplo

Calculamos los impuestos de 300 euros.

``` bash
java -jar calcular_iva-0.1.0-standalone.jar 300
```

Nos devolverá.

``` bash
FACTURA sencilla
Introducida: 300.0  €
IVA (+ 21 %): 63.0 €
IRPF (- 15 %): 45.0 €
Total: 318.0 €

FACTURA educacion
Introducida: 300.0  €
IRPF (- 15 %): 45.0 €
Total: 255.0 €

40% - 120.0 €
40% - 120.0 €
20% - 60.0 €
```
