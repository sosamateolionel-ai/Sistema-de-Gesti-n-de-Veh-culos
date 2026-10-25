# Sistema de Gestión de Vehículos

## Descripción

Este proyecto implementa un sistema de gestión de vehículos utilizando Java y programación orientada a objetos. Permite representar diferentes tipos de vehículos, como automóviles particulares, camiones y motocicletas, compartiendo características comunes y mostrando información específica de cada uno.

## Funcionamiento

El programa crea tres vehículos y los almacena en un arreglo de tipo `vehiculo`. Luego recorre la flota para encender cada vehículo y mostrar sus datos en la consola.

Cada vehículo posee una marca, un modelo, un año, una matrícula y un estado de encendido. Además, cada subclase incorpora una característica particular:

* **AutoParticular:** registra la velocidad máxima en km/h.
* **Camion:** registra la capacidad de carga en toneladas.
* **Motocicleta:** registra la cilindrada en centímetros cúbicos (cc).

El sistema valida que los datos de texto no sean nulos ni estén vacíos y que los valores numéricos específicos sean mayores que cero. Si un dato no cumple las condiciones, se genera una excepción `IllegalArgumentException`.

## Clases principales

### `vehiculo`

Clase base que contiene los atributos comunes de todos los vehículos. Permite encenderlos, apagarlos, consultar su estado y mostrar sus datos. También incorpora un método de validación para los campos de texto.

### `AutoParticular`

Hereda de `vehiculo` y agrega el atributo `velocidadMaxima`. Sobrescribe el método `mostrarDatos()` para incluir la velocidad máxima.

### `Camion`

Hereda de `vehiculo` y agrega el atributo `capacidadCarga`. Sobrescribe `mostrarDatos()` para mostrar la capacidad de carga.

### `Motocicleta`

Hereda de `vehiculo` y agrega el atributo `cilindradas`. Sobrescribe `mostrarDatos()` para mostrar la cilindrada de la motocicleta.

### `Main`

Crea un automóvil, un camión y una motocicleta. Los almacena en un arreglo de tipo `vehiculo`, recorre la flota y ejecuta los métodos `encender()` y `mostrarDatos()` para cada objeto.

## Conceptos de programación utilizados

* **Herencia:** las clases específicas heredan los atributos y métodos de `vehiculo`.
* **Polimorfismo:** un arreglo de tipo `vehiculo` almacena objetos de distintas subclases.
* **Sobrescritura de métodos:** cada subclase redefine `mostrarDatos()` para incluir información adicional.
* **Encapsulamiento:** los atributos son privados y se accede a ellos mediante métodos públicos.
* **Atributos constantes:** se utiliza `final` para evitar que los valores de los atributos se modifiquen después de su inicialización.
* **Validación de datos:** se controlan los campos de texto y los valores numéricos.
* **Excepciones:** se utiliza `IllegalArgumentException` para informar datos inválidos.
* **Arreglos y ciclos:** se utiliza un arreglo para almacenar la flota y un ciclo `for-each` para recorrerla.

## Ejecución

<img width="362" height="720" alt="image" src="https://github.com/user-attachments/assets/238e45cf-7541-4bd8-8899-39d1a3b46ebf" />

## Objetivo del ejercicio

Aplicar herencia, polimorfismo y encapsulamiento para modelar una flota de vehículos. El ejercicio demuestra cómo reutilizar una clase base, extender su funcionalidad mediante subclases y ejecutar comportamientos específicos utilizando referencias del tipo general.

## Consideraciones

El programa es una simulación educativa: el encendido y apagado solo modifican un atributo booleano, sin controlar vehículos reales. Los datos de los vehículos están definidos directamente en el código.
