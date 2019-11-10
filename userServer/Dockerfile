FROM openjdk:8
VOLUME /tmp
EXPOSE 8085
ADD ./target/userServer-1.0-SNAPSHOT.jar userServer.jar
ENTRYPOINT ["java","-jar","/userServer.jar"]
