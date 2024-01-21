FROM adoptopenjdk:8-jre-hotspot

WORKDIR /app

COPY target/TeiresiasProphetPredictions-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
