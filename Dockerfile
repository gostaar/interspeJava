FROM maven:3.9.1-eclipse-temurin-17
COPY . .
RUN mvn install
EXPOSE 8080
CMD JAVA -jar .\target\interspe-0.0.1-SNAPSHOT.jar
