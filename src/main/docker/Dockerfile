FROM frolvlad/alpine-oraclejdk8:slim
ADD *.jar /opt/app.jar
# time zone
RUN echo "Asia/Shanghai" > /etc/timezone
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /opt/app.jar $EXTRA_PARAM"]
EXPOSE 18000

