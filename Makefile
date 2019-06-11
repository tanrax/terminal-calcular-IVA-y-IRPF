.DEFAULT_GOAL := build

build:
	lein do clean, uberjar
	native-image --report-unsupported-elements-at-runtime \
             --initialize-at-build-time \
             -jar ./target/uberjar/calcular_iva-1.0.1-standalone.jar \
             -H:Name=./dist/calcular_iva
