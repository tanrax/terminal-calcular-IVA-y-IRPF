# Calcular IVA y IRPF por terminal

## Descargar

Binario

``` bash
curl https://github.com/tanrax/terminal-calcular-IVA-y-IRPF/raw/master/dist/calcular_iva --output calcular_iva
```

O versión jar (Java)

``` bash
curl https://github.com/tanrax/terminal-calcular-IVA-y-IRPF/raw/master/dist/calcular_iva-1.0.1-standalone.jar --output calcular_iva-1.0.1-standalone.jar
```

## Uso

``` bash
./calcular_iva [numero]
```

o

``` bash
java -jar calcular_iva-1.0.1-standalone.jar [numero]
```

## Ejemplo

Calculamos los impuestos de 345 euros.

``` bash
java -jar calcular_iva-1.0.1-standalone.jar 345
```

Nos devolverá.

``` bash
"FACTURA sencilla"
"Introducida: 345€"
"IVA (+21%): 72.45€"
"IRPF (-15%): 51.75€"
"Total: 365.70€"

"FACTURA educacion"
"Introducida: 345€"
"IRPF (-15%): 51.75€"
"Total: 293.25€"
```
