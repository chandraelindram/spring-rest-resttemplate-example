FROM openjdk:8
ADD target/hackathon-0.0.1-SNAPSHOT.jar hackathon.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "hackathon.jar" ]