# First stage: Maven build
FROM maven:3.6.3-jdk-11-slim AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app/
WORKDIR /usr/src/app
RUN mvn clean package -DskipTests

# Second stage: Prepare the runtime container
FROM openjdk:11-jre-slim
COPY --from=build /usr/src/app/target/*.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
