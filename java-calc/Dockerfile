FROM openjdk:11-jre-slim
COPY --from=build /usr/src/app/target/app.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
