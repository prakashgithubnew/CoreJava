**What is Spring Cloud and why it should be used?**
---------------------------------------------------
Spring Cloud provides you the modules or libraries to build scalable , latency efficient, 
and complex microservices on spring framework.

It helps developers to build service discovery , service registry , configuration management,
load balancing and distributed applications.

**what is the difference between spring cloud and spring boot**
---------------------------------------------------------------
Spring Boot is a Java framework which is used for quicker application development, and is 
specifically used in Microservice architecture.

Spring cloud is used for integrating these microservices so that they can easily work together 
in a distributed environment and can communicate with each other.

**There are multiple components in Spring Cloud which supports the cloud native development using spring cloud.**
-----------------------------------------------------------------------------------------------------------------

**Spring cloud config** - 
--------------------------
This is the component built for fetching any git repo properties and enable externalization of properties.
Spring Cloud Config provides server and client-side support for externalized configuration in a distributed system. 
With the Config Server you have a central place to manage external properties for applications across all environments.

**Spring Cloud Gateway**
-------------------------
Path based routes
circuit breaker design pattern
Add spring-cloud-starter-gateway dependency in pom.xml


**Spring Cloud Service Discovery**
----------------------------------

Service discovery helps tracking the service address and the ports where the service instances can be contacted to.
Apache Zookeeper, Eureka and Consul are a few well-known components which are used for Service Discovery.

**Spring Cloud service registry**
------------------------------------

where all instances of services are registered
service discovery has information of all the services registered in service registry


**Building Microservice and service registry/discovery using eureka library**
---------------------------------------------------------------------------

1.Create Microservice-simple microservice
---------------------------------------
1. Create microservice and add web and eureka client dependency
2. Have an end point ready.
3. @EnableDiscoveryClient Annotation in top of main application class
4. set eureka.client.register-with-eureka = true
4. Add eureka server URL so that this service can register with eureka server
5. set eureka-client-fetch-registry=true - This property is set to true because when one service
   will need to communicate to other service it will look in to registry the port and details 
   where another service is running and then it can connect to other MS.
6. set eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka

After this step 4 when MS will start it will automatically register with eureka server

2.Create Spring boot application-eureka server
--------------------------------------------
1. Create spring boot application with netflix eureka server dependency
2. Add @EnableEurekaServer annotation in main class
3. set eureka.client.register-with-eureka = false
4. set eureka-client-fetch-registry=false - this property is set to false for eureka server as 
   this property tells to fetch registry for service to service communication. 
    Eureka server is itself a registry so it will not look for registry to communicate service to service.
    Hence this property is set to false for eureka server.
    
5. provide eureka-service-url=<url where eureka server is running>

**Building Microservice API Gateway Pattern**
---------------------------------------------





**Client side discovery and server side discovery**
---------------------------------------------------
CSD
client will make a query to registry directly to connect with any service.

SSD
client will make a query to LB to identify the service and connect. LB will check with registry to
identify the service

**Kafka or RabbitMQ**
----------------------
Kakfa  - Distributed partitioned ,replicated and commit log service
RabbitMQ - centralized message brokering


ConfigServer
------------
centralized config properties

@RefreshScope - Bean Annotated will be refreshed on run time.









