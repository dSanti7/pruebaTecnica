FROM openjdk:17-jdk-alpine
ENV CONTAINER_NAME pruebaTecnica
LABEL authors="SANTIAGO"
ARG JAR_FILE=target/pruebaTecnica-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8081


# Comando para ejecutar la aplicación cuando se inicie el contenedor
ENTRYPOINT ["java", "-jar", "/app.jar"]
