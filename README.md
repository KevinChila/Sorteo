# Proyecto: Sorteo de Equipos para Liga de Fútbol

Este proyecto tiene como objetivo desarrollar una aplicación en Java que organiza de manera aleatoria los enfrentamientos entre equipos en diferentes etapas de un torneo de fútbol profesional. La aplicación realiza el sorteo de los partidos en las etapas de octavos de final, cuartos de final, semifinales y finales, asegurando que los equipos no se repitan en una misma etapa.

## Funcionalidades

- **Ingreso de Datos:**
  - El usuario selecciona la etapa del torneo (octavos, cuartos, semifinales).
  - Permite ingresar los nombres de los equipos según la etapa seleccionada.

- **Sorteo Aleatorio:**
  - La aplicación asigna aleatoriamente los enfrentamientos entre equipos utilizando recursividad.

- **Manejo de Excepciones:**
  - Se manejan excepciones personalizadas en caso de que la etapa sea inválida.

- **Archivo de Resultados:**
  - Los enfrentamientos sorteados se guardan en un archivo de texto (`resultados_[etapa].txt`).

## Estructura del Proyecto

1. **LigaSorteo.java**: Clase principal que gestiona el flujo de la aplicación, solicita los datos al usuario y organiza el sorteo.
2. **IngresoDeEquipos.java**: Permite ingresar los nombres de los equipos.
3. **Etapa.java**: Define el número de equipos según la etapa del torneo seleccionada.
4. **EtapaIncorrecta.java**: Excepción personalizada para manejar etapas inválidas.
5. **Resultado.java**: Muestra los partidos sorteados y guarda los resultados en un archivo de texto.
6. **Sorteo.java**: Realiza el sorteo aleatorio de los equipos utilizando recursividad.


## Ejecución

1. Ejecuta el archivo `LigaSorteo.java`.
2. Selecciona la etapa del torneo (octavos, cuartos, semifinales).
3. Ingresa los nombres de los equipos.
4. Visualiza los enfrentamientos y los resultados guardados en un archivo de texto.


