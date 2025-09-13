FROM eclipse-temurin:17-jre-alpine
WORKDIR /opt/app
COPY /src/main/resources/config.properties application.properties
COPY /target/product-service.jar product-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "product-service.jar"]