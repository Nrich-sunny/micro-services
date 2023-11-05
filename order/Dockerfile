FROM openjdk:17-oracle
MAINTAINER nrich
EXPOSE 8001
COPY target/order-*.jar app.jar
# 运行jar包
ENTRYPOINT ["java","-jar","/app.jar"]

