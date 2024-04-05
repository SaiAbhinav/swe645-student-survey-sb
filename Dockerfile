FROM openjdk:17
COPY ./target/survey-application.jar .
ENTRYPOINT ["java", "-jar", "survey-application.jar"]
EXPOSE 8080
