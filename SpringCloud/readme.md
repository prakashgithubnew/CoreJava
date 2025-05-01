**What is Spring Cloud and why it should be used?**
---------------------------------------------------
Spring Cloud provides you the modules or libraries to build scalable , latency efficient, 
and complex microservices on spring framework.

It helps developers to build service discovery , service registry , configuration management,
load balancing and distributed applications.

**what is the difference between spring cloud and spring boot**
---------------------------------------------------------------
Spring Boot is a Java framework which is used for quicker application development, and is specifically used in Microservice architecture.

Spring cloud is used for integrating these microservices so that they can easily work together in a distributed 
environment and can communicate with each other.

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





