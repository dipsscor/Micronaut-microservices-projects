FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.1.13-alpine-slim

RUN addgroup -S app && adduser -S -g app app

WORKDIR /app
COPY build/libs/add-number-function-*-all.jar /app/Handler.jar

ADD https://github.com/openfaas/faas/releases/download/0.11.0/fwatchdog /usr/bin
RUN chmod +x /usr/bin/fwatchdog

USER app

ENV fprocess="java -Dcom.sun.management.jmxremote -noverify -XX:TieredStopAtLevel=1 -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -jar Handler.jar"

HEALTHCHECK --interval=1s CMD [ -e /tmp/.lock ] || exit 1

CMD ["fwatchdog"]