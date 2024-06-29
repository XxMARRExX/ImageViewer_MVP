# ImageViewer MVP

## Descripción
`ImageViewer` es una aplicación diseñada para la visualización de imágenes. Esta aplicación sigue el patrón arquitectónico Model-View-Presenter.

# Arquitectura Model-View-Presenter (MVP)

Model-View-Presenter (MVP) es un patrón de arquitectura de software diseñado para facilitar la separación de la lógica de la interfaz de usuario de la lógica de negocio, mejorando la organización del código y 
facilitando su mantenimiento y prueba. Similar a MVC, MVP también se divide en tres componentes principales, pero con algunas diferencias en las responsabilidades y la interacción. Aquí se detallan los componentes del MVP:

## Modelo
El Modelo en MVP funciona de manera similar al de MVC, siendo la representación de los datos y las reglas de negocio que gestionan el acceso y las modificaciones de estos datos. Es responsable de:

- Manejar las operaciones de datos, como cargar, guardar y actualizar información en una base de datos o cualquier otro almacenamiento permanente.
- Aplicar las reglas de negocio, asegurando que todos los datos sean coherentes y válidos según las necesidades de la aplicación.
- Notificar al Presentador de cualquier cambio en los datos para que pueda actualizar la Vista adecuadamente.

## Vista
La Vista en MVP es mucho más pasiva comparada con su papel en MVC. En MVP, la Vista se limita principalmente a presentar la información al usuario y delega casi todas las otras responsabilidades al Presentador. 
Específicamente, la Vista:

- Muestra los datos proporcionados por el Presentador.
- Envía las acciones del usuario al Presentador, como clics de botón, entradas de texto, etc.
- Se actualiza basándose en la información o los comandos recibidos del Presentador, sin contener lógica de negocio o acceso directo a los datos.

## Presentador
El Presentador es el componente central en el patrón MVP y asume las responsabilidades que en MVC son compartidas entre la vista y el controlador. 
El Presentador actúa como el mediador entre la Vista y el Modelo, siendo responsable de:

- Recibir las entradas del usuario desde la Vista.
- Manipular los datos a través del Modelo o decidir otras acciones a realizar.
- Recuperar los datos del Modelo y formatearlos para su presentación.
- Actualizar la Vista con los nuevos datos o estados, asegurándose de que la interfaz de usuario refleje los cambios adecuados.

El patrón MVP es particularmente popular en aplicaciones donde la separación clara entre la interfaz de usuario y la lógica de negocio es crítica para la prueba de unidades y la mantenibilidad del código. 
Además, facilita un mejor manejo de proyectos donde el diseño de la interfaz de usuario y la lógica de negocio pueden evolucionar independientemente pero de manera coordinada. Los sistemas de APPLE siguen en gran medida
está arquitectura dandole al usuario un control dinámico de la aplicación.

## Características
- **Carga y visualización de imágenes**: Soporta diversos formatos de imagen para carga y visualización. (".png", ".jpeg", ".png")
- **Interfaz intuitiva**: Interfaz gráfica amigable y fácil de usar.
- **Navegación entre imágenes**: Permite a los usuarios navegar entre imágenes almacenadas en un directorio de manera circular (Cuando se llega a la útlima foto la siguiente sería la primera en la que se comenzo).
- **Navegación dinámica entre imágenes**: Las imagenes se desplazan a partir de clicar en la pantalla y deslizar con el ratón. Dándole dinamismo a la aplicación

## Capturas de Pantalla
Aquí algunas capturas de pantalla de la aplicación en acción:

### Especificación del directorio
![image](https://github.com/XxMARRExX/ImageViewer_MVC/assets/95377322/11403323-d573-4a82-9976-3eaf9b0c035c)

### Navegación por los directorios
![image](https://github.com/XxMARRExX/ImageViewer_MVC/assets/95377322/9463d844-06c7-4012-bbdb-13bfb3a42952)

### Visualización de imágenes
![image](https://github.com/XxMARRExX/ImageViewer_MVP/assets/95377322/6249690c-a5c3-45ad-a8d7-64569cdf085c)


## Tecnologías Utilizadas
- **Java**: Lenguaje de programación usado para la lógica de la aplicación.
- **Swing**: Biblioteca de java para la interfaz gráfica de usuario.
- **Maven**: Herramienta de gestión y construcción de proyectos.
- **IntelliJ**: Entorno de desarrollo integrado.
- **Git**: Control de versiones.

## Cómo Empezar
Para ejecutar `ImageViewer MVP` en tu entorno local, sigue estos pasos:

### Prerrequisitos
- Java JDK 11 o superior.
- Maven para la construcción y gestión del proyecto.

### Instalación
1. Clona el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/XxMARRExX/ImageViewer_MVP.git
   cd ImageViewer_MVP
2. Ejecuta en tu consola el comando:
   ```bash
   java -jar .\out\artifacts\ImageViewer_MVP_jar\ImageViewer_MVP.jar
