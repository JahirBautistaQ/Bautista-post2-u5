# Bautista-post2-u5
Unidad 5: Integración en Aplicaciones Web Post-Contenido 2

Biblioteca API es una aplicación REST desarrollada con Spring Boot que permite gestionar un catálogo de libros. A través de esta API se pueden realizar operaciones básicas como crear, consultar, actualizar y eliminar libros.

El sistema utiliza una base de datos en memoria H2, lo que facilita su ejecución sin necesidad de configuraciones externas. Además, cuenta con documentación interactiva mediante Swagger para probar los endpoints directamente desde el navegador.

Tecnologías utilizadas
Java 17
Spring Boot 3.5
Spring Web
Spring Data JPA
H2 Database
Lombok
Springdoc OpenAPI (Swagger)
Dependencias principales
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>

    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.7.0</version>
    </dependency>
</dependencies>
Instrucciones de ejecución
Clonar el repositorio o descargar el proyecto
Abrir una terminal en la carpeta del proyecto
Ejecutar los siguientes comandos:
./mvnw clean install
./mvnw spring-boot:run
La aplicación se ejecutará en:
http://localhost:8080
Documentación de la API

Swagger UI permite visualizar y probar los endpoints:

http://localhost:8080/swagger-ui/index.html
Base de datos H2

La aplicación usa una base de datos en memoria.

Acceso a la consola:

http://localhost:8080/h2-console

Configuración:

JDBC URL: jdbc:h2:mem:biblioteca_db
Usuario: sa
Contraseña: (vacía)
Endpoints principales
Obtener todos los libros
GET /libros
Obtener libro por ID
GET /libros/{id}
Crear libro
POST /libros

Ejemplo:

{
  "titulo": "Clean Code",
  "autor": "Robert C. Martin",
  "isbn": "9780132350884",
  "categoria": "Programación",
  "anioPublicacion": 2008
}
Actualizar libro
PUT /libros/{id}
Eliminar libro
DELETE /libros/{id}
Capturas de pantalla

A continuación se deben incluir capturas del funcionamiento de la API:

Swagger UI mostrando los endpoints
Ejecución de un GET de todos los libros
Creación de un libro (POST)
Respuesta de la API en formato JSON
<img width="1891" height="970" alt="image" src="https://github.com/user-attachments/assets/25f9bd06-24c3-4c68-85b3-3dcbdb6b85dd" />
<img width="1843" height="953" alt="image" src="https://github.com/user-attachments/assets/fede22b8-4601-44ad-9ab5-6d88a3be9587" />
<img width="1320" height="475" alt="image" src="https://github.com/user-attachments/assets/58d35fda-5f28-4558-8eeb-fca1646bd6e5" />


Notas finales
La base de datos se reinicia cada vez que se detiene la aplicación
Swagger facilita la prueba de endpoints sin herramientas externas
El proyecto sigue una arquitectura por capas: controlador, servicio y repositorio
