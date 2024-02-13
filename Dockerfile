FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/demo-of-web-service-0.0.1-SNAPSHOT.jar app.jar
LABEL authors="sendh"
ENTRYPOINT ["java", "-jar", "/app.jar"]