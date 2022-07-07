From openjdk:8
EXPOSE 8080
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
ONBUILD ADD . /usr/src/app
ONBUILD RUN mvn install
ONBUILD ADD /usr/src/app/target/springdocker-0.0.1-SNAPSHOT.jar springdocker-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/springdocker-0.0.1-SNAPSHOT.jar"]
