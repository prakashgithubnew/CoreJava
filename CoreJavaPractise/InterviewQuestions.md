**Java Utilizes this memory as -**

    * When we write a java program then all the variables, methods, etc are stored in the stack memory.
    * And when we create any object in the java program then that object was created in the heap memory. 
    * And it was referenced from the stack memory.

**Can the main method be Overloaded?**

    Yes, It is possible to overload the main method. We can create as many overloaded main methods we want. However, 
    JVM has a predefined calling method that JVM will only call the main method with the definition of -

**Is it possible that the ‘finally’ block will not be executed?**

    Yes. It is possible that the ‘finally’ block will not be executed. The cases are- 
    Suppose we use System.exit() in the above statement.
    If there are fatal errors like Stack overflow, Memory access error, etc.

**What is a ClassLoader?**

    Java Classloader is the program that belongs to JRE (Java Runtime Environment). 
    The task of ClassLoader is to load the required classes and interfaces to the JVM when required.
    Example- To get input from the console, we require the scanner class. And the Scanner class is loaded by the ClassLoader.


**What part of memory - Stack or Heap - is cleaned in garbage collection process?**

    Heap

**What are shallow copy and deep copy in java?**

    Consider the program below

    class Rectangle{
    int length = 5;
    int breadth = 3;
    }

