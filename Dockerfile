FROM maven:latest
LABEL authors="trang"

WORKDIR /app

COPY  pom.xml /app

COPY . /app

RUN mvn package

CMD ["java", "-jar", "target/AikidoPracticeTracker.jar"]