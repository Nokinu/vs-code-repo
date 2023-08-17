FROM openjdk:17-jdk-slim
RUN addgroup --system spring && adduser --system spring -ingroup spring
COPY target/Wallet_vsdb/* /Wallet_vsdb/
RUN chown -R spring:spring /Wallet_vsdb
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
ENV PORT 8080
EXPOSE 8080
