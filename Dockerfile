FROM registry.hub.docker.com/library/openjdk
ADD . /app
RUN cd /app;/app/mvnw spring-boot:run