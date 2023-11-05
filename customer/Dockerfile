FROM openjdk:17-oracle
MAINTAINER nrich
EXPOSE 8002
COPY target/customer-*.jar app.jar
# 运行jar包
ENTRYPOINT ["java","-jar","/app.jar"]

