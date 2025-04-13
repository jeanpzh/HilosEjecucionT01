#  Explicación General del Proyecto: Números Primos con Threads en Java

## Objetivo General
El presente proyecto demuestra cómo utilizar programación concurrente con hilos en Java para determinar números primos en un rango dado, comparando el desempeño de una solución secuencial frente a una paralela.

---

## Estructura del Proyecto

El proyecto consta de las siguientes clases principales:

| Clase             | Responsabilidad                                                              |
|-------------------|------------------------------------------------------------------------------|
| `Secuencial`      | Calcula números primos en un rango dado utilizando un solo hilo de ejecución.|
| `TareaPrimoParalela`      | Extiende de `Thread` y determina números primos en un segmento específico.   |
| `Paralela`        | Divide el trabajo de búsqueda en múltiples segmentos y administra los hilos. |

---

## Funcionamiento General

- La clase `Secuencial` realiza una búsqueda lineal tradicional de números primos dentro de un rango, sin utilizar técnicas paralelas.
- La clase `Paralela` reparte el rango total en segmentos, asignando cada segmento a un hilo (`TareaPrimo`) para ser procesado en paralelo. Esto permite aprovechar múltiples núcleos del procesador y reducir significativamente el tiempo de ejecución, especialmente en rangos grandes.
- La clase `MainApp` compara tiempos y resultados, proporcionando una evidencia clara del beneficio que aporta la programación concurrente en tareas intensivas.

---

## Nota sobre la elección del algoritmo:

**Recordatorio Importante**  
En este proyecto, **no se eligió el algoritmo de la Criba de Eratóstenes** (que es conocido por ser más eficiente para encontrar primos) debido a razones netamenete **demostrativas**. El propósito central es ilustrar claramente cómo utilizar múltiples hilos en Java y cómo repartir una tarea entre ellos.

La elección de un método sencillo (verificar divisibilidad individual de cada número) permite enfocarse mejor en el concepto de concurrencia y en el impacto del paralelismo sobre el rendimiento,.

> **⚠️ Atención:** Para aplicaciones reales que requieran máxima eficiencia en la detección de números primos, se recomienda usar la Criba de Eratóstenes o algoritmos más avanzados optimizados específicamente para esta tarea.

