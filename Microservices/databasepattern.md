**Microservice Database Design Patterns**
-----------------------------------------

**Database per service pattern**
--------------------------------
Per service DB is recommended
when shard DB is preferred ? - when migrating monolithic to microservice at initial planning.
or very small application.

2 Phase commit - Prepare and then commit
Not good as it's managed by coordinator and if coordinator
failed then whole transaction will be failed. Centralized control is the problem.


**SAGA**
--------
Break the whole transaction in multiple local transactions.
   a. Choreography - event driven(Messaging system),Kafka,SQS etc
   b. Orchestrator - an orchestrator will tell each service what to do. eventuaute is collabration
   framework, Microprofile and AXON saga is also an option to implement orchestration.

**CQRS**
--------

Command - Query-Responsibility -segregate pattern
          Read and write cross cutting concerns isolation.
          Problem is eventual consistency will be there as the data which is written need to be replicate
          to read DB and it may take some time which can lead to dirty reads.
          Synchronization between READ and WRITE DB Model need to be done.
          Event source(Kafka/rabbit MQ) can be used to synchronize the data between read and write model.
          Use synchronized operation means read first and then write.
          Where to use: For frequent read and write operations not for infrequent read and write operations.


**Which one to use CQRS or SAGA?**
----------------------------------
 Both are built for different purposes 

CQRS -When you have different-2 services to scale.
 
SAGA - when you have business process which need multiple processes to execute and commit.