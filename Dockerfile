FROM registry.hub.docker.com/library/openjdk
ADD src/test/java/com/example/configclient /app
RUN cd /app;/app/mvnw spring-boot:run