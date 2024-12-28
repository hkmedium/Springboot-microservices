FROM amazoncorretto:17

LABEL version="1.0"

EXPOSE 8290:8293
#ENV PORT 8190
#EXPOSE 8191

WORKDIR /app

COPY target/commentservicespringboot-0.0.1-SNAPSHOT.jar /app/commentservicespringboot.jar

ENTRYPOINT ["java", "-jar", "commentservicespringboot.jar"]