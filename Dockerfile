FROM openjdk:17
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} springbootdocker.jar
ENTRYPOINT ["java","-jar","/springbootdocker.jar"]