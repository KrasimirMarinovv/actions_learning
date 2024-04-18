# Use the official Maven image to build your app
FROM maven:3.6.3-jdk-11-slim AS build

# Copy the project files to the container
COPY src /home/app/src
COPY pom.xml /home/app

# Package the application
RUN mvn -f /home/app/pom.xml clean package

# Use the official OpenJDK image to create a lean production image
FROM openjdk:11-jre-slim

# Copy the built jar file from the build stage
COPY --from=build /home/app/target/External-IP-Checker-1.0.2.jar /usr/local/lib/External-IP-Checker.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","/usr/local/lib/External-IP-Checker.jar"]
