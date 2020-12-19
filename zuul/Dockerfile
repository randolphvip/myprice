FROM java:8-jre
MAINTAINER shang cong
ARG JAR_FILE
ADD ./target/${JAR_FILE} /app/app.jar
CMD ["java", "-Xmx200m", "-jar", "/app/app.jar"]

EXPOSE 8043