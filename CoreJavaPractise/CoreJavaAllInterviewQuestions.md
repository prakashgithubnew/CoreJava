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

This is shallow cloning as default implementation will not let change the value in nested object value.

            ****** Deep Cloning******

we would require to provide clone implementation inside Department class also and chnage clone implementation in Eemployee class
So for a deep copy, we need to ensure all the member classes also implement the Cloneable interface and override the clone() method of the object class.
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

    Shallow copies are sufficient for simple structures or when shared references are desired. 
    Deep copies are necessary when you need independent copies or when working with mutable data structures

**Arrays**

    Java arrays are passed by reference always means any change will reflect in the values also.

**Instance, Local Variables**

    Instance variable can be defined in class where as Local can be defined in method , blocks or constructors
    Instance varaibles need not to define, they take default values.
    Local variable need to be defined , they wont take default values.
    All final variable need to be initialized.

**static,Non static** 

    we cannot call non static method/variable from static context
    we can call static method from non static method/context

**What is the use of constructors in java**

    Initialize the variable or any object.


