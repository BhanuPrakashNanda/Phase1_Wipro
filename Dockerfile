From openjdk:8
EXPOSE 8090
Add target/springdocker-0.0.1-SNAPSHOT.jar springdocker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","springdocker-0.0.1-SNAPSHOT.jar"]
