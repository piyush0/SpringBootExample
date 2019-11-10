FROM openjdk:8
VOLUME /tmp
EXPOSE 8082
ADD ./target/discoveryServer-1.0-SNAPSHOT.jar discoveryServer.jar
ENTRYPOINT ["java","-jar","/discoveryServer.jar"]
