FROM openjdk:8
ADD target/E-tilang-2-0.0.1-SNAPSHOT.jar E-tilang-2-0.0.1-SNAPSHOT.jar
EXPOSE 9090:9090
ENTRYPOINT ["java","-jar","E-tilang-2-0.0.1-SNAPSHOT.jar"]