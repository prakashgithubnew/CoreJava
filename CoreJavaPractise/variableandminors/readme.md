Class Variables or Static Variable within class
----------------------------------------------
Need not to initialize during declaration
Since there are static variable which means specific to class and hence for all instances value will be 
shared same
Example
Class A{
static int g=10;
A a = new A();
a.g=20;/// now this will be the final value everywhere all instances because due to static
 



}

Instance Variables - within class but non-static
------------------------------------------------
Need not initialize during declaration
the values are specific to each instances




Local Variable - within method, constructor or block
-----------------------------------------------------
local variable need to be initialized , won't take default values.
declaring local variable int g; is fine but when we use it will give error not initialized


**Final Variables**
-------------------
Final Variable has to be initialized else error
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
non static methods are called depending on the class object.
static and non static variables can be accessed in the child class also 


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
---------------------------------------------------------------------------------------
stack


**Static cannot be used for constructor. is this true?**
---------------------------------------------------------
Constructor can be private,protected or public but not static


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
            obj.fun();
        }  
    }

this will give compile time error as fun method cannot be accessed by subclass object


**can weaker access be given to overrided method in subclass?**
--------------------------------------------------------------
No never

