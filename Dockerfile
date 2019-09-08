FROM registry.hub.docker.com/library/openjdk
ADD . /app
RUN cd /app;/app/mvnw install
WORKDIR /app
CMD ['start.sh']