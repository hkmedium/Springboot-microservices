FROM amazoncorretto:17

LABEL version="1.0"

EXPOSE 8290:8292
#ENV PORT 8190
#EXPOSE 8191

WORKDIR /app

COPY target/userservicespringboot-0.0.1-SNAPSHOT.jar /app/userservicespringboot.jar

ENTRYPOINT ["java", "-jar", "userservicespringboot.jar"]