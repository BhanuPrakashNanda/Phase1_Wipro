From openjdk:8
EXPOSE 8080
ONBUILD RUN mvn install
ONBUILD ADD /usr/src/app/target/springdocker-0.0.1-SNAPSHOT.jar springdocker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springdocker-0.0.1-SNAPSHOT.jar"]
