FROM maven:latest
LABEL authors="tommi"
WORKDIR /app
COPY pom.xml /app/
COPY . /app/
RUN mvn package
CMD ["java", "-jar", "target/Test.jar"]