# Integrantes
-Jorge Andres Arroyo Cedeño
-Cherley María Caiza Chasipanta
# central-svc

Microservicio central para gestión de agricultores y cosechas.

## Tecnologías

- Java 17  
- Spring Boot 3.1.4  
- PostgreSQL  
- RabbitMQ  
- Maven  

## Configuración

Variables de entorno (opcional, con valores por defecto):

- `JDBC_URL`: URL de conexión a PostgreSQL (default: `jdbc:postgresql://localhost:5432/centraldb`)  
- `DB_USER`: Usuario de la base de datos (default: `postgres`)  
- `DB_PASS`: Contraseña de la base de datos (default: `postgres`)  
- `RABBIT_HOST`: Host RabbitMQ (default: `localhost`)  
- `RABBIT_PORT`: Puerto RabbitMQ (default: `5672`)  
- `RABBIT_USER`: Usuario RabbitMQ (default: `guest`)  
- `RABBIT_PASS`: Contraseña RabbitMQ (default: `guest`)  

## Endpoints

### Agricultores

- `GET /agricultores` - Listar agricultores  
- `GET /agricultores/{id}` - Obtener agricultor por ID  
- `POST /agricultores` - Crear agricultor  
- `PUT /agricultores/{id}` - Actualizar agricultor  
- `DELETE /agricultores/{id}` - Eliminar agricultor  

### Cosechas

- `GET /cosechas` - Listar cosechas  
- `GET /cosechas/{id}` - Obtener cosecha por ID  
- `POST /cosechas` - Registrar nueva cosecha  

## Ejecución

```bash
./mvnw spring-boot:run
