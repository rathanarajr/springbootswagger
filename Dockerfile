FROM openjdk:8-jdk-alpine
MAINTAINER rathanaraj.r@dxc.com
COPY target/lma-boot-swagger-4-0.0.1-SNAPSHOT.jar lma-boot-swagger-4-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/lma-boot-swagger-4-0.0.1-SNAPSHOT.jar"]