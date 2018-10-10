FROM openjdk:8-jre-alpine
VOLUME /tmp
COPY zipkinserver-1.0.0.jar app.jar
EXPOSE 9000
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
