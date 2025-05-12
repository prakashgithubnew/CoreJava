Spring DaTA redis
------------------
NoSQL database with Key Value un-structured data in DB.
Redis is an open source(BSD licensed) in-memory remote data structure store(database) that offers 
high performance,replication, and a unique data model.
The full form of Redis is Remote Directory Server.
Redis is a NoSQL DB of type Key-Value stores. In fact, Redis Database is an in-memory database 
that persists on disk. It means when we use Redis Database, we occupy a memory on the disk to 
use as a Database. The data model is key-value, but many several kind of values are supported 
such as Strings, Lists, Sets, Sorted Sets, Hashes, Streams, HyperLogLogs, Bitmaps etc.

**Why its different to other databases ?**
------------------------------------------
Redis stores data in ket value pairs.
Other Databases like MongoDB,Casandra,Oracle and Postgres stores data in disks but Redis stores data in 
in Memory which does not see time delays to access disks and are very fast.


**why NoSQL DB are very faster and have a good performance?**
-------------------------------------------------------------
NOSQL are better than SQL due to their design characteristics.
Few More reasons-
1. NOSQL are schema less and SQL are schema oriented due to which managing schema 
is little overhead and hectic.
2. NOSQL can be scaled horizontally means data can be spread many servers easily 
where SQL can be scaled vertically means hardwares need to be added and will be costly.
3. Good for cloud native and Big data friendly.

**What is the problem with NOSQL**
----------------------------------
Not every NOSQL does support ACID,Mongo DB supports ACID.
Redis provides partial ACID compliance by design.





Below are some of the important benefits that we can have from Redis:

1) In-memory data store
2) Flexible data structures : like Strings, Lists, Sets, Sorted Sets, Hashes, Bitmaps, HyperLoglogs
3) Simplicity and ease-of-use
4) High availability and scalability
5) Easy for Replication and persistence
6) High Extensibility


1. Add below dependency for Lettuce 

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
    <version>3.2.0</version>
</dependency>

2. Create Config file

        @Configuration
        public class AppConfig {
        
                @Bean
                JedisConnectionFactory jedisConnectionFactory() {
                return new JedisConnectionFactory();
                }
                
                @Bean
                public RedisTemplate<String, Object> redisTemplate() {
                RedisTemplate<String, Object> template = new RedisTemplate<>();
                template.setConnectionFactory(jedisConnectionFactory());
                return template;
                }
        }

3.Create entity file
4.Create DAO Layer
5.Create DAOImpl Class

        import java.util.Map;
        import javax.annotation.Resource;
        import org.springframework.data.redis.core.HashOperations;
        import org.springframework.stereotype.Repository;
        import com.dev.springboot.redis.model.Employee;
        
        @Repository
        public class EmployeeDaoImpl implements IEmployeeDao {
        
            private final String hashReference= "Employee";
        
            @Resource(name="redisTemplate")          // 'redisTemplate' is defined as a Bean in AppConfig.java
            private HashOperations<String, Integer, Employee> hashOperations;
        
            @Override 
            public void saveEmployee(Employee emp) {
                //creates one record in Redis DB if record with that Id is not present
                hashOperations.putIfAbsent(hashReference, emp.getEmpId(), emp);
            }
        
            @Override
            public void saveAllEmployees(Map<Integer, Employee> map) {
                hashOperations.putAll(hashReference, map);
            }
        
            @Override
            public Employee getOneEmployee(Integer id) {
               return hashOperations.get(hashReference, id);
            }
        
            @Override
            public void updateEmployee(Employee emp) {
               hashOperations.put(hashReference, emp.getEmpId(), emp);
            }
        
            @Override
            public Map<Integer, Employee> getAllEmployees() {
               return hashOperations.entries(hashReference);
            }
        
            @Override
            public void deleteEmployee(Integer id) {
               hashOperations.delete(hashReference, id);
            }
        }