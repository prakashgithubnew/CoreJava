Design Patterns are used to build a sophisticated system which can lead to-

       1. Efficient Maintenance of code
       2. Easy unit testing
       3. Code reusability
       4. faster development
       5. Faster Deployment
       6. Flexibility
       7. Easy understandable
       8. Organized and clean code


**API Gateway Pattern**
----------------------
These are also cross-cutting concerns.

* Route the requests
* rate limiting
* Authentication and authorization.
* Cache response
* transform request and response from JSON to XML and vice versa

      **Spring Cloud Library for API Gateway**
      -----------------------------------------
      Zuul API Gateway is decommissioned and Spring cloud gateway can be used as alternative.


        **what if Gateway is down or fails**
        ------------------------------------
        Solution1: Redundancy and Failover:
        Implement multiple instances of the API gateway and configure them to automatically
        Failover to a healthy instance if one fails.
        
        
        Solution2: Use a load balancer to distribute traffic across multiple API gateway instances,
        ensuring that if one instance fails, the load balancer directs traffic to the remaining healthy instances.
        

**Circuit Breaker Design Pattern**
-----------------------------------

**Service discovery**
---------------------


**Event Sourcing Pattern**
--------------------------


**Sidecar Pattern**
-------------------

**DDD**
-------

**DDD domains and subdomains**
------------------------------

Domains are Hospitals,ECommerce,Health , Banking, sports etc.

Sub domains - inventory management, product management , delivery management etc.

    **Benefits of DDD(domain and subdomain)-**
    -------------------------------------------
    
    Stable architecture since the subdomains are relatively stable
    
    Development teams are cross-functional, autonomous, and organized around delivering 
    business value rather than technical features.
    
    Services are cohesive and loosely coupled

**EDS** - Event Driven Design Pattern
-------------------------------------








**Common Closure Principle (CCP)**
----------------------------------
Another useful principle from OOD is the Common Closure Principle (CCP), which states that classes that change 
for the same reason should be in the same package.
