FROM openjdk:8
VOLUME /tmp
EXPOSE 8081
ADD ./target/configServer-1.0-SNAPSHOT.jar configServer.jar
ENTRYPOINT ["java","-jar","/configServer.jar"]
