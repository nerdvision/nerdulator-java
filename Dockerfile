FROM openjdk:10

COPY target/nerdulator.jar /opt/nerd/nerdulator.jar
ADD https://get.nerd.vision/java/latest/nerdvision.jar /opt/nerd/nerdvision.jar

ENV NV_KEY="enter your key here"

EXPOSE 8080

CMD ["java", "-javaagent:/opt/nerd/nerdvision.jar=api.key=${NV_KEY}", "-jar", "/opt/nerd/nerdulator.jar"]