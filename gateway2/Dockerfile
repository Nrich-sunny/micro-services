FROM openjdk:17-oracle
MAINTAINER nrich
EXPOSE 8003
COPY target/gateway2-*.jar app.jar
# 运行jar包
ENTRYPOINT ["java","-jar","/app.jar"]

