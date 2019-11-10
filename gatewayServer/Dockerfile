FROM openjdk:8
VOLUME /tmp
EXPOSE 8084
ADD ./target/gatewayServer-1.0-SNAPSHOT.jar gatewayServer.jar
ENTRYPOINT ["java","-jar","/gatewayServer.jar"]
