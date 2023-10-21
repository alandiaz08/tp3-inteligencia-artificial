#  TP 3 Inteligencia Artificial 🧪

Introducción
El objetivo para esta actividad es:
-    Implementar y evaluar la solución a través de un modelo neuronal artificial.
________________________________________

## 🛠️ Consigna

A partir de la descripción realizada del problema y sus implicancias, se deben cumplir las siguientes actividades, de forma individual.

1.    Hacer un análisis de los modelos neuronales artificiales, poniendo el foco en las formas de aprendizaje y preparar un breve resumen de los mismos destacando sus aplicaciones.
2.    Orientar el análisis anterior hacia la identificación de imágenes del tipo de las del problema abordado: modelos apropiados, ventajas y limitaciones.
3.    Desarrollar e implementar un prototipo destinado a la identificación de imágenes a través del modelo de Hopfield en el contexto de un caso sencillo. Describir sus características, ventajas y limitaciones frente al problema tratado y presentar un ejemplo. También resumir las dificultades encontradas.
4.    Analizar las coincidencias y diferencias entre el problema de fondo (línea de montaje) y las posibilidades que ofrecen el método aplicado y su prototipo. Justificar.


```
1. Análisis de Modelos Neuronales Artificiales
Formas de Aprendizaje
•	Aprendizaje Supervisado: Se alimenta al modelo con un conjunto de datos etiquetado. Es útil para tareas de clasificación y regresión.
•	Aprendizaje No Supervisado: No requiere etiquetas. Se usa generalmente para tareas de agrupación o asociación.
•	Aprendizaje por Reforzamiento: Se basa en un sistema de recompensas y castigos. Es útil para tomar una serie de decisiones que maximizan una recompensa.
Breve Resumen y Aplicaciones
•	Redes Neuronales Feedforward (ANN): Son las más básicas y se usan principalmente en tareas de clasificación y regresión. Aplicaciones en finanzas, marketing, etc.
•	Redes Neuronales Convolucionales (CNN): Especializadas en el procesamiento de imágenes. Aplicaciones en detección de objetos, visión por computadora, etc.
•	Redes Neuronales Recurrentes (RNN): Se utilizan para problemas que implican secuencias, como el procesamiento del lenguaje natural. Aplicaciones en traducción automática, generación de texto, etc.
•	Redes Adversariales Generativas (GANs): Se usan para generar nuevos datos que son similares pero no idénticos a los datos de entrenamiento. Aplicaciones en arte, diseño, etc.
•	Redes de Hopfield: Usadas para reconocimiento de patrones y recuperación de memoria. Aplicaciones en sistemas de recomendación, optimización, etc.
2. Orientación Hacia la Identificación de Imágenes
Modelos Apropiados
•	CNN: Son las más apropiadas para tareas de identificación de imágenes debido a su capacidad para aprender características jerárquicas de los datos.
•	Autoencoders: Pueden ser útiles si la tarea implica una reducción de dimensionalidad o la eliminación de ruido en las imágenes.
•	Redes de Hopfield: Podrían ser útiles para la identificación de patrones si la tarea no requiere una alta complejidad o variabilidad en las imágenes.
Ventajas
•	CNN: Alta precisión, escalabilidad y la capacidad de manejar imágenes complejas.
•	Autoencoders: Capacidad para eliminar ruido y reducir dimensionalidad.
•	Redes de Hopfield: Menor costo computacional y tolerancia al ruido.
Limitaciones
•	CNN: Costosas en términos de recursos computacionales y pueden ser difíciles de interpretar.
•	Autoencoders: Menos precisos para tareas de clasificación en comparación con CNN.
•	Redes de Hopfield: Limitadas en términos de capacidad de almacenamiento y escalabilidad.
Al centrarse en la identificación de imágenes para una línea de montaje, las CNN serían probablemente la mejor opción debido a su alta precisión y capacidad para aprender características complejas. Sin embargo, si los recursos computacionales son una limitación o la tarea no requiere una alta complejidad, una red de Hopfield podría ser una opción más viable.
3. Descripción del Prototipo
Objetivo: El prototipo utilizará una Red de Hopfield para identificar imágenes en un entorno de línea de montaje sencillo, como puede ser el de una fábrica que procesa piezas de formas específicas.
Características:
•	Entrada de imágenes en escala de grises.
•	La red está pre-entrenada con las formas que necesita identificar.
•	Realiza comparaciones en tiempo real para asignar la mejor coincidencia.
Ventajas
1.	Bajo Costo Computacional: Las Redes de Hopfield son menos intensivas en recursos.
2.	Rápida Implementación: Fácil de implementar en comparación con modelos más complejos como CNN.
3.	Tolerancia al Ruido: Pueden identificar patrones incluso si hay un cierto grado de ruido o variación.
Limitaciones
1.	Baja Capacidad de Almacenamiento: Limitadas en el número de patrones que pueden aprender.
2.	Sensibilidad a Atributos: No tan efectivas en identificar variaciones menores en los objetos.
3.	Escalabilidad: No es práctica para problemas más complejos o con grandes volúmenes de datos.
Ejemplo
Imaginemos una fábrica que necesita clasificar tuercas y tornillos. Las imágenes de estas piezas se capturan y se envían a la Red de Hopfield, que ha sido entrenada previamente para reconocer estos dos tipos de objetos. La red compara cada nueva imagen con las almacenadas y determina si es una tuerca o un tornillo.
Dificultades Encontradas
1.	Entrenamiento: Aunque las Redes de Hopfield son más fáciles de entrenar que otros modelos, determinar los pesos óptimos puede ser complicado.
2.	Ruido y Variabilidad: Si las tuercas y tornillos tienen variaciones significativas, la Red de Hopfield podría tener dificultades para identificarlas correctamente.
3.	Pruebas y Ajustes: Ajustar la red para que funcione en tiempo real en un entorno de línea de montaje puede requerir numerosas iteraciones.
4. Análisis de Coincidencias y Diferencias entre el Problema de Fondo (Línea de Montaje) y el Método Aplicado
Coincidencias
•	Reconocimiento de Patrones: Tanto el problema de la línea de montaje como los modelos neuronales artificiales (especialmente CNN y Redes de Hopfield) son excelentes en el reconocimiento de patrones, lo que es esencial para la identificación de piezas.
•	Escalabilidad: Ambos sistemas (línea de montaje y redes neuronales) son escalables. En una línea de montaje, se pueden añadir más estaciones para más tareas. En el caso de los modelos neuronales, se pueden añadir más neuronas y capas para manejar tareas más complejas.
•	Automatización: Tanto las redes neuronales como las líneas de montaje tienen como objetivo la automatización de tareas que, de otro modo, requerirían la intervención humana.
Diferencias
•	Flexibilidad: Las líneas de montaje son generalmente rígidas y requieren una reconfiguración física para adaptarse a nuevas tareas. Los modelos neuronales pueden ser reentrenados con nuevos datos para adaptarse a nuevas tareas, lo que resulta en una mayor flexibilidad.
•	Costo y Tiempo: Entrenar una red neuronal puede ser costoso en términos de tiempo y recursos de cómputo, especialmente para las CNN. Por otro lado, la configuración inicial de una línea de montaje es costosa, pero los costos operativos pueden ser más bajos.
•	Tolerancia al Error: En una línea de montaje, un fallo en una etapa puede detener toda la producción o resultar en productos defectuosos. Los modelos neuronales, especialmente las redes de Hopfield, tienen cierta capacidad para manejar el ruido y los errores.
Justificación
Dado que el tema central del módulo 3 es sobre modelos neuronales artificiales, aplicar estas tecnologías al problema de la línea de montaje tiene sentido tanto desde una perspectiva educativa como práctica.
Si la tarea principal es la identificación de piezas en una línea de montaje, un modelo como una CNN podría ser excesivo, mientras que una red de Hopfield podría ofrecer una solución más sencilla y eficaz, aunque menos precisa. Sin embargo, si la línea de montaje tiene requisitos muy detallados para la identificación de piezas (por ejemplo, diferenciaciones muy sutiles entre piezas), entonces una CNN sería más apropiada debido a su alta precisión.
La elección del modelo dependerá de los requisitos específicos del problema, los recursos disponibles y el nivel de precisión requerido.
```