# Clientes-Crud-Spring
Proyecto es un CRUD de clientes desarrollado en Java y Spring, que utiliza tecnologías como Thymeleaf, Spring MVC, Spring Data, Spring Boot y MySql.

## Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalado lo siguiente:

1. JDK 8 o superior (Java Development Kit)
2. Netbeans IDE 17
3. Dependecias de Spring Framework
4. Base de datos MySQL.

## Configuración de la base de datos

1. Crea una base de datos llamada "control_clientes" en tu servidor de base de datos.

2. Ejecuta el siguiente script SQL para crear la tabla de clientes:

    ```sql
    CREATE TABLE cliente (
      id_cliente INT PRIMARY KEY AUTO_INCREMENT,
      nombre VARCHAR(45),
      apellido VARCHAR(45),
      email VARCHAR(45),
      telefono VARCHAR(45),
      saldo VARCHAR(45)
    );
    ```

## Como ejecutar el proyecto

1. Clona este repositorio o descarga los archivos como ZIP.
2. Importa el proyecto en tu IDE Netabeans.
3. Configura el GlassFish Server en tu IDE.
4. Ejecuta el proyecto en el servidor GlassFish.
5. Abre tu navegador web y accede a http://localhost:8080 para ver la aplicación en funcionamiento.
