FROM alpine-oraclejdk8:8.131.11-slim
ADD *.jar /opt/app.jar
# time zone
RUN echo "Asia/Shanghai" > /etc/timezone
ENTRYPOINT ["/bin/ash", "-c", "java $JAVA_OPTS -jar /opt/app.jar $EXTRA_PARAM"]
EXPOSE 18000