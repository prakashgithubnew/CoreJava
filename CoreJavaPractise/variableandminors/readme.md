Class Variables or Static Variable within class
----------------------------------------------
Need not to initialize during declaration.They will take default values.
Since there are static variable which means specific to class and hence for all instances value will
be shared same

    Example

    Class A {
        static int g=10;
        A a = new A();
        a.g=20;/// now this will be the final value everywhere all instances because due to static
    }

Instance Variables - within class but non-static
------------------------------------------------
Need not initialize during declaration.They will take default values.
the values are specific to each instances

Local Variable - within method, constructor or block
-----------------------------------------------------
local variable also need not to be initialized but when its used anywhere it will ask to initialize first , won't take default values.
declaring local variable int g; is fine but when we use it will give error if not initialized

**Final Variables**
-------------------
Final Variable has to be initialized else error everywhere.

Non static field cannot be accessed in static context, either you define it static or access by creating
an object of the class

Method Overloading
-------------------

* Methods can be overloaded and overrided
* Static Methods can be overloaded by same name but different signature
* We cannot overload static and non static methods together as compiler cannot identify 
    which method to call.

**Method Overriding**
---------------------
Non static methods can be overrided  
static method also can be overrided 
static method cannot be overrided by non static methods - compile time error
non static methods cannot be overrided by static methods - Compile time error

static methods are called depending on the class reference
non-static methods are called depending on the class object.
static and non-static variables can be accessed in the child class also 


**When is the object created with new keyword?**
-------------------------------------------------
runtime

**can we use this or super in the static method/context?**
------------------------------------------------------------
NO

**How many Objects are created below**
--------------------------------------
String a = new String(“Interviewbit”);
String b = new String(“Interviewbit”);
String c = “Interviewbit”;
String d = “Interviewbit”;

3

**Where does the system stores parameters and local variables whenever a method is invoked?**
---------------------------------------------------------------------------------------------
stack

**Static cannot be used for constructor. is this true?**
---------------------------------------------------------
Constructor can be private,protected or public but not static
Constructors cannot be final or static

**What is the implicit return type of constructor?**
-----------------------------------------------------
Implicit return type of constructor is the class object in which it is defined.

**When is the finalize() method called?**
-------------------------------------------
Before Garbage collection

**Can private method be overrided?**
--------------------------------------
Yes but private method defined in super class cannot be accessed in the subclass

**Consider below program**
--------------------------

    class Base {
        private void fun() {
            System.out.println("Base fun");     
        }
    }
    
    class Derived extends Base {
        private void fun() {
            System.out.println("Derived fun");     
        }
        public static void main(String[] args) {
            Base obj = new Derived();
            obj.fun(); //fun method is of type Base whose private method cannot be accessed outside
        }  
    }

this will give compile time error as fun method cannot be accessed by subclass object

**can weaker access be given to overrided method in subclass?**
--------------------------------------------------------------
No never

**Can a private method in super class be overrided in child class by public method.**
-------------------------------------------------------------------------------------
yes but super class method will not be visible in child class due to its private.

**Difference between static and volatile**
-------------------------------------------
Static are more towards class level where any change will be reflected to every object/instance of that class.

Volatile is itself reflected for multithreading where all threads will share the latest value of variable
as the variable resides at main memory.


=====================================================

**Abstract Class**
-------------------

1. Abstract class cannot be instantiated. if Demo is abstract class then below will be compile time errro
Demo demo = new Demo();

2. if you have created 2 abstract classes and you have created a class whcih extends both 
abstract class then that class need to implement both the abstract method.

================================================================

Class1 {
    void show(){}
}

Class2 extends Class1 {
void show(){}
}

if you put methods as above or mark as static it will work.


=================================

**Constructor Calling Hierarchy**
---------------------------------
    Base1 {
        Base1(){
        }
        Base1(int b){
        }
    }

    Base2 extends Base1 {
        Base2(){
        }
        Base2(int b){
        }
    }

    Base3 extends Base2 {
        Base3(){
        }
    
        Base3(int h){
        }

        PSVM(){
        Base3 base3  =  new Base3(10);//it will call Base1 and Base2 default contructor and Base3 argument contructor
        }
    }

================================


**Data Types in Java and their ranges**
----------------------------------------
Primitive data types

    byte - -128 to 127 1 byte
    short - 2 byte
    int - 4 byte
    long - 8 byte
    float - 4 byte
    double - 8 byte
    char - 2 bytes, 0 to 65536
    boolean - 0 or 1 - 1 byte or 2 byte

Non primitive data types 

String
Array
Interfaces
ENUM

==============

String has method length for size
Array has length









