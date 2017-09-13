FROM java:8
MAINTAINER eureka server
ADD target/investment-eureka-1.0-SNAPSHOT.jar /investment-eureka-1.0-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/investment-eureka-1.0-SNAPSHOT.jar"]