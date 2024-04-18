FROM maven:3.6.3-jdk-11-slim AS build

# Copy pom.xml and source code
COPY pom.xml /usr/src/app/
COPY src /usr/src/app/src

WORKDIR /usr/src/app

# Package the application
RUN mvn clean package

# Start a new stage from scratch
FROM openjdk:11-jre-slim
COPY --from=build /usr/src/app/target/app.jar /app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]

