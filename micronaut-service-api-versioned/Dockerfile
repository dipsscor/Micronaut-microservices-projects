FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.1.13-alpine-slim
COPY target/micronaut-service-api-versioned-*.jar micronaut-service-api-versioned.jar
EXPOSE 11001
CMD java -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar micronaut-service-api-versioned.jar