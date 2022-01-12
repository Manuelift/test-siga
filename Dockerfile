FROM quay.io/eclipse/che-java8-maven:7.37.2

MAINTAINER manuelift

USER root

COPY src /home/app/src
COPY pom.xml /home/app

#ERROR
#RUN nocmd

RUN mkdir -p /var/local/SP

RUN mvn -f /home/app/pom.xml clean package

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/home/app/target/siga_mantenedores-0.0.1-SNAPSHOT.jar"]