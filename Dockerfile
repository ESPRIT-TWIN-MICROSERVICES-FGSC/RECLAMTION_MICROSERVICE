FROM openjdk:8-jdk-alpine
EXPOSE 8084
ADD /target/RECLAMTION-MICROSERVICES-0.0.1-SNAPSHOT.jar RECLAMTION.jar
ENTRYPOINT ["java","-jar","RECLAMTION.jar"]
