FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.1.13-alpine-slim
COPY target/customer-management-*.jar customer-management.jar
EXPOSE 12001
CMD java -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar customer-management.jar