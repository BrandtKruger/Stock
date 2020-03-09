REST Spring Boot Microservice, ZUUL Gateway, in memory database H2 and Swagger

Stock micro services listen on port 8090
ZUUL Gateway listen on port 8080

Included is a folder called "Release". Two bat files are included.
spring-boot-zuulgateway.bat - Start ZUUL Gateway
StockApplication.bat - Start Stock microservices


- Start ZUUL Gateway - java -jar target/spring-boot-zuulgateway-0.0.1-SNAPSHOT.jar
- Start Stock micro services - java -jar stocksapplication-0.0.1-SNAPSHOT.jar

Swagger functionality included, once the Stock services is runing enter below url in browser.
- Swagger url - http://localhost:8090/swagger-ui.html#/
Use Swagger to test application and get example messages

To test that using port 8080 will be routed to the Stock micro service port 8090 via the ZUUL Gateway
- Get all stock - http://localhost:8080/stocks
- Get stock with ID - http://localhost:8080/stocks/101


GIT Command

git remote add origin git@github.com:BrandtSA/Stock.git
git push -u origin master

Please note that price is in cents.

Docker images available
docker pull brandtsa/spring-boot-zuulgateway-0.0.0.1
docker pull brandtsa/stocksapplication-0.0.0.1

