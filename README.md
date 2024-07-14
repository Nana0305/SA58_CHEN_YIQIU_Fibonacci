This repository contains a Spring Boot application that implements a REST API.
Steps to build and run the application:
1. Clone the repository to your local machine
2. Test the application with JUnit Test
3. Build the application using Maven, package it into a JAR file
4. Build the docker image: docker build -t coinapi:latest .
5. Run the docker container: docker run -p 8080:8080 coinapi:latest
6. The application will be accessible at 'http://localhost:8080'
7. Test output with a query string, such as 'http://localhost:8080/coin?amt=7.3&denoms=0.1,0.5,1,5,10'
