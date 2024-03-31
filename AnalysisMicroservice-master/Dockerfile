FROM openjdk:17
EXPOSE 8080:8080
ADD target/analysis-microservice.jar analysis-microservice.jar
ENTRYPOINT ["java","-jar","/analysis-microservice.jar"]