Async in Spring Boot
---------------------
In spring boot same can be achieved by using
@Async annotation

**What Spring Boot Starters Are Available Out There?**
------------------------------------------------------
At the time of this writing, there are more than 50 starters at our disposal. 
Here, we’ll list the most common:

spring-boot-starter: core starter, including auto-configuration support, logging and YAML
spring-boot-starter-aop: for aspect-oriented programming with Spring AOP and AspectJ
spring-boot-starter-data-jpa: for using Spring Data JPA with Hibernate
spring-boot-starter-security: for using Spring Security
spring-boot-starter-test: for testing Spring Boot applications
spring-boot-starter-web: for building web, including RESTful, applications using Spring MVC
spring-boot-starter-parent - The spring-boot-starter-parent project is a special 
    starter project that provides default configurations for our application and a 
    complete dependency tree to quickly build our Spring Boot project. 
    It also provides default configurations for Maven plugins,

**Common Annotations in Spring Boot**
--------------------------------------

**@SpringBootApplication** - The @SpringBootApplication annotation is equivalent to using 
                         @Configuration, @EnableAutoConfiguration, and @ComponentScan
Spring Boot enables the developer to use a single annotation instead of using multiple. 

**@ComponentScan**
Spring Boot application scans all the beans and package declarations when the application initializes. 
You need to add the 
@ComponentScan annotation for your class file to scan your components added to your project.

**What is the difference between @RestController and @Controller in Spring Boot?**

* @Controller is used to mark classes as Spring MVC Controller where as @RestController annotation is a special controller used in 
  RESTful Web services, and it’s the combination of @Controller and @ResponseBody annotation.

* In @Controller, we need to use @ResponseBody on every handler method and In @RestController, 
  we don’t need to use @ResponseBody on every handler method.
* in MAE we have used @RestController and have also given @GetMapping , @ResponseStatus


**What is an IOC container?**

Spring IoC Container is the core of Spring Framework.It creates the objects, configures and assembles their 
dependencies, manages their entire life cycle. The Container uses Dependency Injection(DI) to manage the components that make 
up the application. It gets the information about the objects from a configuration file(XML) or Java Code or Java 
Annotations and Java POJO class. These objects are called Beans. Since the Controlling of Java objects and their 
lifecycle is not done by the developers, hence the name Inversion Of Control.

**what is dependency injection in spring**
Dependency Injection is a design pattern that allows the spring container to ‘inject’ objects into other objects or dependencies

**Features of spring boot framework**

IoC container
Data Access Framework
Spring MVC
Transaction Management
Spring Web Services
JDBC abstraction layer
Spring TestContext framework

**Containers in Spring**

    BeanFactory Container

BeanFactory represents a basic IoC container which is a parent interface of ApplicationContext. BeanFactory uses Beans and their dependencies metadata to create and configure them at run-time. BeanFactory loads the bean 
definitions and dependency amongst the beans based on a configuration file (XML) or the beans can be directly returned when required using Java Configuration.

    Sample code for using Bean-Factory

    @SpringBootApplication
    // Main class
    public class DemoApplication
    {
    // Main driver method
    public static void main(String[] args)
    {
    // Creating object in a spring container (Beans)
    BeanFactory factory = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
    Student student = (Student) factory.getBean("student");
    
        System.out.println(student);
    }
    }

    ApplicationContext Container

This interface is designed on top of the BeanFactory interface. The ApplicationContext interface is the advanced container that enhances BeanFactory functionality in a more framework-oriented style. 
While the BeanFactory provides basic functionality for managing and manipulating beans, often in a programmatic way, the ApplicationContext provides extra functionality like MessageSource, 
Access to resources, Event propagation to beans, Loading of multiple (hierarchical) contexts etc. There are so many implementation classes that can be used such as ClassPathXmlApplicationContext, 
FileSystemXmlApplicationContext, AnnotationConfigWebApplicationContext etc.

**BeanFactory and Application Context Hierarchy**

![img.png](img.png)


**Difference between Bean Factory and Application Context**
    
**BeanFactory -** 
    Fundamental container providing basic functionality for managing beans.
    Suitable for building standalone applications.
    Supports only Singleton and Prototype bean scopes.
    Does not support annotations; requires configuration in XML files.
    Does not provide internationalization (i18n) functionality.


**ApplicationContext**
    Advanced container extending BeanFactory with additional features.
    Suitable for building web applications, integrating with AOP modules, ORM, and distributed applications.
    Supports all types of bean scopes, including Singleton, Prototype, Request, Session, etc.
    Supports annotation-based configuration for bean autowiring.
    Extends MessageSource interface to provide internationalization (i18n) functionality.

**What is the difference between RequestMapping and GetMapping?**

RequestMapping can be used with GET, POST, PUT, and many other request methods using the method 
attribute on the annotation. Whereas getMapping is only an extension of RequestMapping 
which helps you to get the value from DB/Service.

**What is dependency Injection?**
* Setter Injection: The IOC container will inject the dependent bean object into the target bean object by calling the setter method.
* Constructor Injection: The IOC container will inject the dependent bean object into the target bean object by calling the target bean constructor.
* Field Injection: The IOC container will inject the dependent bean object into the target bean object by Reflection API.
  Dependency injection promotes loose coupling and easier testing


Constructor dependency is preferred and recommended because it explicitly states all required dependencies
at object creation, making code more readable, maintainable, and testable, while also enforcing that all 
necessary dependencies are provided, preventing potential runtime errors due to missing dependencies

**Key benefits of constructor injection:**

Clear Dependencies
Immutability
Compile-time safety
Improved Testability
Reduced Circular Dependencies

**What are the types of dependency injections in spring boot available**
Setter Injection - Circular dependencies or partial dependencies result with Setter DI because 
                    object creation happens before the injections.
Example -

    public class GFG {
    
        // The object of the interface IGeek
        private IGeek geek;
    
        // Setter method for property geek with @Autowired annotation
        @Autowired
        public void setGeek(IGeek geek) {
            this.geek = geek;
        }
    }
Constructor Injection - No scope for circular or partial dependency because dependencies are 
                        resolved before object creation itself.

Example

    public class GFG {
    
        // The object of the interface IGeek
        private IGeek geek;
    
        // Constructor to set the CDI
        public GFG(IGeek geek) {
            this.geek = geek;
        }
    }

Field Injection - Just autowired annotation before the field

        @RestController
        public class TestController {
        @Autowired
        private  TestRepository testRepository;
        }
        
        @Repository
        class TestRepository{
        
        }