From openjdk:8
EXPOSE 8081
Add target/medicare-0.0.1-SNAPSHOT.war medicare-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/medicare-0.0.1-SNAPSHOT.war"]
