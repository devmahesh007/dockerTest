FROM openjdk:17
EXPOSE 8080
ADD target/subscriber-docker.jar subscriber-docker.jar
ENTRYPOINT ["java", "-jar", "/subscriber-docker.jar"]