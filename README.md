# Calcular IVA y IRPF por terminal

## Descargar

``` bash
curl https://github.com/tanrax/terminal-calcular-IVA-y-IRPF/raw/master/dist/calcular_iva-1.0.0-standalone.jar --output calcular_iva-1.0.0-standalone.jar
```

## Uso

``` bash
java -jar calcular_iva-1.0.0-standalone.jar [numero]
```

## Ejemplo

Calculamos los impuestos de 300 euros.

``` bash
java -jar calcular_iva-1.0.0-standalone.jar 300
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
