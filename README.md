# Challenge Foro Hub

![foro](https://github.com/user-attachments/assets/08141ea8-829d-4ca9-b880-5702cbdcbf7f)

Este proyecto es una aplicación de ejemplo que demuestra cómo crear una API REST utilizando Spring Boot. La aplicación permite gestionar tópicos, proporcionando funcionalidades para crear, listar, filtrar tópicos, eliminar y actualizar. A continuación, se detallan las características y la configuración del proyecto.

## Características

- **Creación de Tópicos**: Permite registrar nuevos tópicos en la base de datos.
  ![Crear topico](https://github.com/user-attachments/assets/4abe13a8-1b32-4ba0-aabb-9e87678357cf)

- **Listar Tópicos**: Permite listar todos los tópicos registrados.
  ![Listar topico](https://github.com/user-attachments/assets/da5b8429-43fb-4edc-853c-b03316400470)

- **Actualizar**: Permite actualizar ciertos datos de la aplicacion.
  ![Actualizar topico](https://github.com/user-attachments/assets/be6377cf-2025-4eb5-be95-afee8b43accc)

- **Eliminar**: Permite eliminar los topicos que ya no crea necesarios.
  ![Eliminar Topico](https://github.com/user-attachments/assets/29360944-0246-4554-95ba-d1294e791a2f)
  
- **Login**: Debe existir un login para realizar las operacines anteriores.
  ![login](https://github.com/user-attachments/assets/aa17945a-f175-4fd7-84a3-67ba435d53b2)

## Dependencias Utilizadas

El proyecto utiliza las siguientes dependencias:

- **Lombok**: Para reducir el código boilerplate mediante anotaciones.
- **Spring Web**: Para construir la API REST.
- **Spring Boot DevTools**: Para facilitar el desarrollo con características como el reinicio automático.
- **Spring Data JPA**: Para interactuar con la base de datos utilizando JPA.
- **Flyway Migration**: Para gestionar la migración de esquemas de base de datos.
- **PostgreSQL Driver**: Para conectarse a la base de datos PostgreSQL.
- **Validation**: Para validar datos de entrada.
- **Spring Security**: Para gestionar la seguridad de la aplicación.

## Configuración de la Base de Datos

La base de datos utilizada es PostgreSQL. Asegúrate de tener PostgreSQL instalado y configurado antes de ejecutar la aplicación.

## Ejecución del Proyecto

Para ejecutar el proyecto, sigue estos pasos:

1. Clona el repositorio.
2. Configura la base de datos PostgreSQL y actualiza las propiedades de la base de datos en `application.properties`.
3. Ejecuta las migraciones de Flyway para crear la tabla `topicos`.
4. Inicia la aplicación Spring Boot.
5. Utiliza herramientas como Postman o Insomnia para interactuar con la API REST.

## Video de Referencia

Puedes encontrar una guía detallada de este proyecto en el siguiente video: [YouTube Video](https://youtu.be/DGNMPo29lzA?si=E9pXU25iLRif36Y_)

## Autores

- Evelyn Flores
