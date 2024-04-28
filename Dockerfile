FROM eclipse-temurin:21-jdk-alpine
VOLUME /tmp
COPY target/test-classes/redbull-ecommerce-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080