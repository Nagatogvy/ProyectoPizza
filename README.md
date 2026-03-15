# ProyectoPizza - Sistema de Gestión de Pedidos

## Objetivo

Comprender el funcionamiento de la estructura de datos pila implementada manualmente mediante listas ligadas en Java, aplicándola en un simulador de gestión de pedidos para una pizzería que permita registrar pedidos, deshacer acciones y rehacer pedidos eliminados.

## Descripción del proyecto

PizzaTrack es una aplicación de consola desarrollada en Java que simula el sistema de gestión de pedidos de una pizzería. El sistema utiliza la estructura de datos **Pila (Stack)** implementada manualmente con **listas ligadas**, permitiendo aplicar operaciones de **Undo (Deshacer)** y **Redo (Rehacer)**.

El sistema permite:

- Registrar pedidos de pizza
- Deshacer el último pedido registrado
- Rehacer un pedido previamente deshecho
- Visualizar el pedido actual en preparación

## Tecnologías utilizadas

- Java
- Visual Studio Code
- Git
- GitHub

## Estructura del proyecto

PizzaTrack
│
├── src
│   ├── Pizza.java
│   ├── Nodo.java
│   ├── Pila.java
│   ├── GestionPedidos.java
│   └── Main.java
│
└── README.md

## Instrucciones de ejecución

1. Abrir la terminal en la carpeta src

2. Compilar el programa:

javac *.java

3. Ejecutar el programa:

java Main

## Funcionalidades del sistema

1. Registrar Pizza  
Permite ingresar el nombre de la pizza y tres ingredientes que se almacenan en un arreglo.

2. Deshacer Pedido (Undo)  
Elimina el último pedido registrado moviéndolo a la pila secundaria.

3. Rehacer Pedido (Redo)  
Recupera el último pedido deshecho devolviéndolo a la pila principal.

4. Mostrar Pedido Actual  
Permite visualizar la pizza que se encuentra en el tope de la pila principal.

## Implementación de la pila

La estructura de pila se implementa manualmente utilizando **listas ligadas**, donde cada nodo contiene un objeto Pizza y una referencia al siguiente nodo.

Se implementaron los siguientes métodos fundamentales:

- push(): inserta un elemento en el tope de la pila  
- pop(): elimina el elemento del tope  
- peek(): muestra el elemento del tope sin eliminarlo  
- isEmpty(): verifica si la pila está vacía  

## Sistema Undo / Redo

El sistema utiliza dos pilas:

Pila Principal: almacena los pedidos activos.  
Pila Secundaria: almacena temporalmente los pedidos deshechos.

Flujo:

Registrar Pedido → push en pila principal  
Deshacer → pop de pila principal y push en pila secundaria  
Rehacer → pop de pila secundaria y push en pila principal  

## Capturas de ejecución

(Aquí se agregarán capturas de pantalla del programa en ejecución)

## Video de sustentación

Link del video: (Agregar enlace de YouTube o Drive)