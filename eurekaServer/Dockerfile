FROM java:8-jre
MAINTAINER shang cong

ADD ./target/eurekaServer.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/eurekaServer.jar"]

EXPOSE 4000