FROM openjdk:8-jre
COPY build/libs/sample-api-0.0.1-SNAPSHOT.jar sample-api.jar
ENTRYPOINT ["java", "-jar", "sample-api.jar"]