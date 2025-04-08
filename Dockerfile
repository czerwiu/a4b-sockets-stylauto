FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . /app

RUN ./mvnw clean package -DskipTests

CMD ["java", "-jar", "target/delivery-api-0.0.1-SNAPSHOT.jar"]
