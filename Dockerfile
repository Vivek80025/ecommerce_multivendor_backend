# ---------- Stage 1: Build the JAR ----------
FROM eclipse-temurin:21-jdk-jammy AS build

# Set working directory
WORKDIR /app

# Copy Maven files and source code
COPY pom.xml .
COPY src ./src

# Install Maven, build the JAR
RUN apt-get update && apt-get install -y maven && \
    mvn clean package -DskipTests

# ---------- Stage 2: Lightweight runtime ----------
FROM gcr.io/distroless/java21-debian12:nonroot


# Set working directory
WORKDIR /app

# Copy the built JAR from build stage
COPY --from=build /app/target/*.jar app.jar

# Expose your Spring Boot port
EXPOSE 8080

# Run Spring Boot app
ENTRYPOINT ["java","-Xmx400m","-jar","app.jar"]


