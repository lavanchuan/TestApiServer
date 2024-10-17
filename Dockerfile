FROM maven:3.8.5-openjdk-18 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:18.0.1-jdk-slim
COPY --from=build /target/JavaHelloworld-1.0.1.jar app/JavaHelloworld.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app/JavaHelloworld.jar"]