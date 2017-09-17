FROM java:8
MAINTAINER zuul server
ADD target/investment-zuul-1.0-SNAPSHOT.jar /investment-zuul-1.0-SNAPSHOT.jar
EXPOSE 8888
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/investment-zuul-1.0-SNAPSHOT.jar"]