FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app/pom.xml
RUN ["mvn", "-f" ,"/home/app/pom.xml", "clean" ,"package"]
EXPOSE 8081
ENTRYPOINT ["java","-jar","/home/app/target/configServer-1.0-SNAPSHOT.jar"]
