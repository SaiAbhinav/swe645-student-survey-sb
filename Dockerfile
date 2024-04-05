FROM openjdk:17
COPY survey-application.jar survey-application.jar
ENTRYPOINT ["java", "-jar", "survey-application.jar"]
EXPOSE 8080
