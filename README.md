# A game to be improved

Este proyecto es un ejercicio de JavaFX para practicar la creación de un repositorio propio a partir de una base
## Objetivos

El objetivo principal es mejorar la lógica del juego o añadir funcionalidades y crear un repositorio donde se vea esto.
Además, deberás crear un archivo README.md donde expliques tus mejoras

## Cómo ejecutar el proyecto

Este proyecto está configurado con **Maven**. Usa JavaFX para la interfaz de usuario. Se recomienda IntelliJ para ejecutarlo correctamente.

## Uso de la IA generativa


Si haces uso de IA para el proceso de mejora de algun aspecto de la lógica del juego, cítala correctamente. [Cómo citar a la IA](https://openaccess.uoc.edu/server/api/core/bitstreams/2ef41918-449d-4033-a6c7-1f04dad489dd/content)

En mi caso, sería algo como:

- Juego generado con Google Gemini, modelo de lenguaje grande (2025). Prompt usado:

```
Creame un juego en JavaFX. No necesito ninguna funcionalidad de base de datos.

Simplemente habrá circulos de tamaño alteatorio (entre un min y un max) cayendo desde arriba abajo de la pantalla.

Hacer click en los circulos da puntos, si rebasan una linea (situada en el pie de la pantalla), perderan una vida. Al perder 3 vidas se acaba el juego.


Hazme también en fxml:

- Una pantalla de juego.

- Una pantalla de inicio

- Una pantalla de game over.


Creame tambien las clases necesarias para la logica del juego, de acuerdo a la arquitectura Controlador-Modelo-Vista
```