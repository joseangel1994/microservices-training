# Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

# Information about who maintains the image
MAINTAINER "Jose Exposito"

USER root
# Install packages you need:
RUN apt-get update && apt-get install -y curl

# Add the application's jar image
COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-0.0.1-SNAPSHOT.jar

# Execute the application
ENTRYPOINT ["java", "-jar", "configserver-0.0.1-SNAPSHOT.jar"]