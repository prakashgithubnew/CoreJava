**How JVM Works (Execution Flow)**
----------------------------------

Compilation: Java code (.java) is compiled to bytecode (.class file) by the Java Compiler.

Class Loading: The Class Loader loads the .class file into the Method Area.

Memory Allocation: Objects and variables are created in the Heap and Stack.

Execution: The Execution Engine interprets or compiles the bytecode.

Garbage Collection: JVM cleans up unreferenced objects from the Heap.

**java access modifiers**
--------------------------

public -accessible everywhere

protected - same package and in its subclass(if outside package)

private - accessible in the same class

default - accessible in same package but not other package


**OOPS Concept in java**
-------------------------

Inheritence
Polymorphism
Abstraction
Encapsulation


                ENCAPSULATION

Wrapping data (variables) and methods into a single unit (class) and restricting direct access
to data.
e.g, use private to hide data from outside and use getter only to give access.

                Abstraction

Achieved using abstract classes and interfaces.Focus on what an object does rather than how it
does.

                Inheritence
Reusability of methods, variable from parent class.Implements and extends.
We cannot achieve multiple inheritence in classes , only with interface can be achieved.

                            Polymorphism
        Compile time Polymorphism             Runtime polymorphism

Compile time Polymorphism(Static)- Method Overloading - Based on the Reference

Run time Polymorphism(Dynamic) - Method Overriding - Based on the Object

**Access Modifiers in below**
-----------------------------

                    Class                       Variable                                   Method
Public              Yes                             Yes                                        Yes

Private             No                              Yes                                        Yes

Protected           No                              Yes but Only Instance Variable             Yes

Static        only static inner class               yes only instance variable                  Yes

Final              Yes                              yes                                        yes

Final and static are the keywords in java
Local variable cannot be static as it will give compile time error.
=========================================================================================
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
    it loads the class in to memory during run time dynamically. Dynamically loading class gives 
    benefits in terms of memory usage and reducing startups e.g.
    Example: Loading a JDBC driver dynamically instead of hardcoding it.

    Types of classloader 
        extension
        bootstrap
        system - Class.forName

**Can an ArrayList be made Thread-safe?**

    List<String> list = Collections.synchronizedList(new ArrayList<>());
    Wraps the list with synchronized methods.

    But iteration still needs external synchronization:
    
    
    synchronized (list) {
        for (String item : list) {
        // Safe iteration
        }
    }


**What part of memory - Stack or Heap - is cleaned in garbage collection process?**

    Heap

**What are shallow copy and deep copy in java?**

    Let's understand shallow copy with below example

    // Employee class

    public class Employee implements Cloneable {
    
        private int empoyeeId;
        private String employeeName;
        private Department department;
    
        public Employee(int id, String name, Department dept)
        {
            this.empoyeeId = id;
            this.employeeName = name;
            this.department = dept;
        }
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    
        //Getters and Setters
    }


    // Department Class

    public class Department
    {
    private int id;
    private String name;
    
        public Department(int id, String name)
        {
            this.id = id;
            this.name = name;
        }
    
        //Getters and Setters
    }

    // Test class
    public class TestCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Department hr = new Department(1, "Human Resource");

		Employee original = new Employee(1, "Admin", hr);
		Employee cloned = (Employee) original.clone();

		//Let change the department name in cloned object and we will verify in original object
		cloned.getDepartment().setName("Finance");

		System.out.println(original.getDepartment().getName());
		System.out.println(cloned.getDepartment().getName());
	}
}

Output - both will print
Finance
Finance

This is shallow cloning as default implementation will change the value in nested object value.

            ******Deep Cloning******

we would require to provide clone implementation inside Department class also and change clone
implementation in Employee class so for a deep copy, we need to ensure all the member classes
also implement the Cloneable interface and override the clone() method of the object class.


    Clone Implementation in Employee

        @Override
        protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee)super.clone();
        cloned.setDepartment((Department)cloned.getDepartment().clone());
        return cloned;
        }

    Clone Implementation in Department
        @Override
        protected Object clone() throws CloneNotSupportedException {
        return super.clone();
        }

    //Testing class

    public class TestCloning
    {
    public static void main(String[] args) throws CloneNotSupportedException
    {
    Department hr = new Department(1, "Human Resource");
    
            Employee original = new Employee(1, "Admin", hr);
            Employee cloned = (Employee) original.clone();
    
            //Let change the department name in cloned object and we will verify in original object
            cloned.getDepartment().setName("Finance");
    
            System.out.println(original.getDepartment().getName());
            System.out.println(cloned.getDepartment().getName());
        }
    }


output

Human Resource
Finance


**Use cases for Java Cloning**

    when creating objects are too much expensive or costly, game server application where creating object is 
    too much heavy and costly.

**Arrays**

    Java arrays are passed by reference always means any change will reflect in the values also.
**Instance, Local Variables**

    Instance variable can be defined in class where as Local can be defined in method , blocks or constructors
    Instance or class(static) varaibles need not to define, they take default values.
    Local variable need to be defined , they wont take default values.
    All final variable need to be initialized.

**static,Non static**

    we cannot call non static method/variable from static context
    we can call static method from non static method/context

**What is the use of constructors in java**

    Initialize the variable or any object.


**What is transient keyword or variable in java**

    The transient keyword in Java is used to indicate that a particular field of a class should 
    not be serialized.These variables are always ignored.
    
    E.G.
    transient int k=20;
    after seriralization
    k becomes=0, value ignored

    You can use password as transient because its sensitive data 



**Can we serialize static variables in java**

    Static Variable are not serialized in java hence the same value is gets printed after desrialization.
    Because they belong to class not the instance and in serialization process objects state is 
    maintained in network transfer

**what happen if we don't serialize in java**

    In serialization process objects are converted in to Bytestream which need to be written in a file.
    if we dont serialize then at the other end it will show java.io.NotSerializableException error
    if we are using cahcing then it also serializes before it is saved to cache.


**what is the use of serialversion id in serialization process**

    If a class has changed after serialization (e.g., fields are added/removed), the serialVersionUID 
    ensures that deserialization is only successful if the class version matches.

**Can transient static data can be serialized?**

    No making static data as transient will not make any difference

**what is volatile keyword in java**

    The volatile keyword in Java is used to mark a Java variable as 
    “being stored in the main memory.”

    Every thread that accesses a volatile variable will read it from the main memory 
    and not from the CPU cache.
**Given a large collection of Employee objects, write the most efficient stream operations to find employees whose salary is above a threshold.**
-------------------------------------------------------------------------------------------------------------------------------------------------

    list.parallelStream - enables to work parallel for high list of data.
    It divides the workload into multiple threads, utilizing multi-core processors efficiently.

**Java is passed by reference or pass by value?**
-------------------------------------------------

    Primitive data types are passed by Value.
    
    Object are passed as copy as reference
    
    Strings are immutable hence passed by value.
    
    All objects are passed by reference and will change the value except String.

**which variable will you define as static or volatile in java**
-----------------------------------------------------------------

    Static variable are related to Class and its value is shared to all objects but if 2 threads
    are accessing the static variable then if value is changed by 1 thread then the updated value is not reflected
    in 2nd thread due to static.
    
    Volatile are stored in RAM and its value is shared by all thread of every object.
    so if any object is accessible by 2 threads and if any thread chnages the value then it will be
    reflcted in 2nd thread also whcih was not the case for static.



    Real use case of static -

    When creating a Singleton pattern.

    For utility/helper methods that do not depend on instance variables.

    Real use case of volatile

    When multiple threads read and write a shared variable.

**Why we need immutable class in java and what is the use of this?**
--------------------------------------------------------------------

    Immutable class object does not change the state and its state is reserved so no other thread can
    use and change the state else it will be inconsistent behaviour.
    
    Hashcode for Immutable class is constant and cannot be changed.
    Java’s String class is immutable to prevent security vulnerabilities like unauthorized
    modifications in URLs or database queries.
    
    Hash-based collections (HashMap, HashSet) rely on an object's hashCode. If an object’s state changes after being
    added to a collection, it can lead to inconsistent behavior.

**How to make the Immutable class in java?**
-------------------------------------------
    Declare the class final → Prevents subclassing.
    Make fields private and final → Prevents direct modification.
    Do not provide setters or methods that modify state.
    Use defensive copies for mutable fields.
    Return new objects instead of modifying existing ones.
    
    String, Integer, Double, BigDecimal, LocalDateTime are all final and Immutable class.


**what is diamond problem in OOPS**
------------------------------------
        Class A has a method foo().
        Class B and Class C both extend A and override foo().
        Class D extends both B and C.
        The problem arises when calling foo() from an object of Class D, because the JVM doesn't 
        know whether to call the method from B or C, since both have their own implementations of foo().

        To solve this, Java requires the implementing class to override the conflicting method and 
        resolve the ambiguity.

**what is memory leak in java and how it can be prevented?**
------------------------------------------------------------
    Memory leak can happen in case when objects are created and now no longer needed but still referenced
    by variable method or class , it exist still in memory and lead to memory leak.

**How to avoid memory leak in java**
------------------------------------

    1. close the connections immediate after use.
       2. Storing objects in caches without having a proper eviction strategy or timeout mechanism 
          can cause memory leaks, especially if the cache grows over time.
       3. consider using WeakReferences or SoftReferences.

**what is weakreference and how it can help Garbage Collection**
-----------------------------------------------------------------

    A WeakReference in Java is a reference that does not prevent its referent (the object it points to) 
    from being garbage collected. If an object is only weakly reachable (i.e., it is referenced only 
    by weak references), then it can be collected by the Garbage Collector (GC), even if there are no 
    other strong references to the object.

