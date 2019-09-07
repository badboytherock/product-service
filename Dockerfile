FROM registry.hub.docker.com/library/openjdk
ADD src/test/java/com/example/configclient /app
RUN cd /app;mvn spring-boot:run