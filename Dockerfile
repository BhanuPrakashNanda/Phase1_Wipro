From openjdk:8
EXPOSE 8081
Add target/spring-boot-docker-mysql.war medicare.war
ENTRYPOINT ["java","-jar","/medicare.war"]
