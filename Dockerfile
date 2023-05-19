FROM adoptopenjdk/openjdk11:latest
EXPOSE 8080
ADD target/payment-service-2.6.7.jar payment-service-2.6.7.jar
ENTRYPOINT ["java","-jar","./payment-service-2.6.7.jar"]