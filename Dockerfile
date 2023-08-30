FROM eclipse-temurin:17
COPY target/dev-db.jar  dev-db.jar
CMD [ "java","-jar","dev-db.jar"]