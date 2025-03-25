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

Wrapping data (variables) and methods into a single unit (class) and restricting direct access to data.
e.g, use private to hide data from outside and use getter and setter to give access.

                Abstraction

Achieved using abstract classes and interfaces.Focus on what an object does rather than how it does.

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










