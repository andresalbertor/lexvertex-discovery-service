FROM eclipse-temurin:21-jre-jammy
# wget: Docker healthcheck (actuator / Eureka UI probe), same as VPS lex-platform
RUN apt-get update \
    && apt-get install -y --no-install-recommends wget \
    && rm -rf /var/lib/apt/lists/*
WORKDIR /app
COPY build/libs/*.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
