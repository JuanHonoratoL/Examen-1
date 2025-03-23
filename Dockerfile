FROM amazoncorretto:21-alpine-jdk
COPY

ENTRYPOINT ["java","-jar","/app.jar"]