**Optimize Memory Usage**
-------------------------

* Use local variables and method parameters whenever possible, as they are allocated on the 
  stack and have minimal impact on memory management.
 
* Minimize object creation, especially in loops or frequently executed code paths, to reduce garbage 
  collection overhead.

* Use the String.intern() method to share instances of equal string literals, reducing memory footprint.

* Use StringBuilder for String Concatenation
    In Java, strings are immutable. When you concatenate strings using the ‘+’ operator, a new String 
    object is created, 
    which can impact performance. Instead, use StringBuilder to concatenate strings more efficiently

**BAD Example**
----------------

    String result = "";
    for (int i = 0; i < 1000; i++) {
    result += "example";
    }


**GOOD Example**
-----------------
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 1000; i++) {
    sb.append("example");
    }
    String result = sb.toString();


**Take Advantage of Java Concurrency:**
---------------------------------------
Java offers robust support for concurrency, allowing you to execute tasks in parallel to improve the 
performance of your applications. Use the java.util.concurrent package to implement thread-safe data 
structures, thread pools, and other concurrency utilities.

**Use Lazy Initialization**
----------------------------
Lazy initialization is a technique in which an object is created only when it’s needed. 
This can be useful in situations where creating an object is expensive, and it’s not always needed. 
Be cautious when using lazy initialization in multi-threaded environments, as you may need to handle 
synchronization issues.

example 1-

One good example is to not create a database connection up front, but only just before you need to get 
data from the database.

example 2-

java.util.function.Supplier is a functional interface which is perfect example of Lazy Intializer 
it's not called when u define but you call get function of it then it creates an object.

**Avoid Using BigDecimal Class**
---------------------------------
We know that BigDecimal class provides accurate precision for the decimal values. 
Over usage of this object hampers the performance drastically specifically when the same is used 
to calculate certain values in a loop. BigDecimal uses a lot of memory over long or double to 
perform calculations. If precision is not the constraint or if we are sure the range of the calculated 
value will not exceed long or double we can avoid using BigDecimal and use long or double with proper 
casting instead.

**Use Stored Procedures Instead of Queries**
--------------------------------------------
It is better to write stored procedures instead of complex and long queries and call them while processing. 
Stored procedures are stored as objects in the database and pre-compiled. 
The execution time of the stored procedure is less compared to the query with the same business logic 
as a query is compiled and executed every time wherever it is called through the application. 
Also, the stored procedure has an advantage in data transfer and network traffic since we are not 
transferring the complex query for execution every time to the database server.

**Use of Unnecessary Log Statements and Incorrect Log Levels**
---------------------------------------------------------------
The logging level should be kept to higher levels like DEBUG, ERROR, and not INFO.

**Avoid Selecting all columns**
--------------------------------

Select Required Columns in a Query not all columns.Sometimes selecting all columns may result in delay 
if Huge DB records are there.

**Fetch the Data Using Joins**
------------------------------


