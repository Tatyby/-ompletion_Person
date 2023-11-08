FROM openjdk:17
EXPOSE 8081
ADD target/task_1-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
