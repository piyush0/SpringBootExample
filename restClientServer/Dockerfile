FROM openjdk:8
VOLUME /tmp
EXPOSE 8083
ADD ./target/restClientServer-1.0-SNAPSHOT.jar restClientServer.jar
ENTRYPOINT ["java","-jar","/restClientServer.jar"]
