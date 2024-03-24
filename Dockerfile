FROM techiescamp/jre-17:1.0.0
WORKDIR /my-random-app

RUN git clone -b release/24.03.00 https://github.com/NnoyTra/my-random-app.git
RUN mvn install

# Copy the JAR file (/my-random-app)
COPY /target/my-random-app.jar ./my-random-app.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the jar file
CMD ["java", "-jar", "my-random-app.jar"]