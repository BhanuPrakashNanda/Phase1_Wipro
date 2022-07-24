From openjdk:8
EXPOSE 8081
Add target/spring-boot-docker-mysql.war spring-boot-docker-mysql.war
ENTRYPOINT ["java","-jar","/spring-boot-docker-mysql.war"]
