**Difference between String , String buffer and String builder**
----------------------------------------------------------------
1. String is immutable whereas String buffer and string builder is mutable class.
2. String is not synchronized(no synchronized methods available) , String buffer is synchronized(all methods synchronized)
, string builder is not synchronized.(no synchronized methods available)
3. String is thread safe , String buffer is thread safe but string builder is not thread safe.
4. Performance is significant good for string and string builder as both are not synchronized.

**Usages -** 
------------
String -This is used when we want immutability.
String Builder - This is used when Thread safety is not required.
String buffer -This is used when Thread safety is required.

**Problem with String**
-----------------------
Inefficient for frequent string manipulation, as it creates new objects with each modification, 
leading to performance overhead.

**Problem with String Builder**
-----------------------
Not thread-safe. If used in a multi-threaded environment, additional synchronization is required 
(use StringBuffer for thread safety).

**Problems with String Buffer**
-------------------------------
Slightly less efficient than StringBuilder due to thread safety overhead. It's generally recommended for 
multi-threaded scenarios.

**String Operations**
---------------------
1. When any String Object is created using new Operator , it-
        Create an Object in Java Heap Memory
2. When any string Literal is created using String str=""; then the object is created in String Pool Area.
    if you do 

    String str1 = new String("Prakash");
    String str2 = "Prakash";
    str1==str2----> return false as first line creates an object in Heap and second line in string pool 
    which has different references and return false
3. if you create two string with new operator have same content then str1==str2 will return false as both 
are having different references

**String Intern Operations**
----------------------------
    "string".intern();

Intern create/add the string in String pool and return reference of it.

String string8 = new String("Vikas");
String string9 = "Vikas";
System.out.println("Euality Check via equals intern operator===="+(string8==string9));//prints false

String string8 = new String("Vikas").intern();
String string9 = "Vikas";
System.out.println("Euality Check via equals intern operator===="+(string8==string9));//prints true 
as same string is returned from pool


