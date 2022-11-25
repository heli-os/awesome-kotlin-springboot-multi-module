FROM azul/zulu-openjdk:11.0.15-11.56.19-jre-x86
LABEL MAINTAINER="Heli"

VOLUME /tmp
ARG JAR_FILE
COPY --chown=application:application ${JAR_FILE} application.jar

ENV TZ=Asia/Seoul
EXPOSE 8080

ENTRYPOINT exec java $JAVA_OPTS -jar ./application.jar
CMD []
