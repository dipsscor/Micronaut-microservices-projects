FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.1.13-alpine-slim
COPY target/customer-account-management-*.jar customer-account-management.jar
EXPOSE 13001
CMD java -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar customer-account-management.jar