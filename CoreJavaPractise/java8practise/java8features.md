                            **java 8 comes with below features**
                            ------------------------------------
The objective of java 8 comes with more or less on -
1. Provide more readability
2. Maintainability of code
3. Avoid any boilerplate code
4. Avoid using any big anonymous codes.


**Lambda Expressions: Concise functional code**
-----------------------------------------------

**Functional Interfaces: Single-method interfaces**
---------------------------------------------------

       Only one abstract method but multiple default and static methods.
       Example are Runnable,ActionListener, Comparator, Callable

       **Types of Functional Interface**

       Consumer - The Consumer functional interface in Java 8 is used to represent an operation that 
                    accepts a single input argument and returns no result. It is often used when you 
                    want to perform an action or side-effect on an object without needing to return a value.
                    it has only one method - void accept(T t);
                    Consumer<String> printMessage = message -> System.out.println(message);
                    // Use the Consumer
                    printMessage.accept("Hello, Consumer!");
       Predicate - Put multiple conditions in one predicate and use this predicate anywhere you want to use.

       Supplier - it usually takes no argument but generates a result
                    it is used for lazy initialization , when you needed then only you can get value.
                    it has get method.
                Example-
                    Supplier<Double> randomValueSupplier = () -> Math.random();
                    System.out.println(randomValueSupplier.get()); 

       **Benefits of Functional Interface**
       The major benefit of java 8 functional interfaces is that we can use lambda expressions 
       to instantiate them and avoid using bulky anonymous class implementation.


**Introduced and Improved APIs**
--------------------------------
Use and Introduction of new Stream APIs.


**Optional Class**
------------------

It helps to avoid NullPointerException by providing methods to handle the presence or absence of 
values more gracefully.

Eliminates the need for explicit null checks.
Few Examples of Optional

1. Optional.ofNullable("user@example.com");
   optionalEmail.ifPresent(email -> System.out.println("User email: " + email));
    Checks if value present then do the action

2.  Optional<String> optionalEmail = Optional.ofNullable(getEmail());
    String email = optionalEmail.orElse("default@example.com");
    checks if the value is null then set any default value

3. Optional<String> optionalName = Optional.of("John Doe");

4. Optional<String> optionalEmail = Optional.ofNullable(null);
   // Throw an exception if email is missing
   String email = optionalEmail.orElseThrow(() -> new RuntimeException("Email not found"));

**forEach() enhanced for loop**
-------------------------------


**Method References**
----------------------
Method references reduce the amount of boilerplate code required, making the code shorter and easier 
to maintain.


**ParallelStream for Big List of Data**
---------------------------------------




