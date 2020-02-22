FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.1.13-alpine-slim
COPY target/account-management-*.jar account-management.jar
EXPOSE 11001
CMD java -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar account-management.jar