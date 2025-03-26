**ArrayList**
-------------
Duplicates allowed
items would be stored same as added
Implementation of List Interface
if you provide capacity with 1 in arraylist still you can add more than 2 elements

List.of()//creates Immutable list
List.asList//creates Mutable list
List list = Array.asList//will create immutable lost on which modification not allowed

****HashMap****
---------------
Duplicate keys not allowed
one Null key and many null value can be stored
Internally uses Hashing (similar to Hashtable in Java).
Not Synchronized (unlike Hashtable in Java) and hence faster for most of the cases.
HashMap allows for efficient key-based retrieval, insertion, and removal with average O(1) time complexity.
HashMaps are not ordered, which means that the order in which elements are added to the map is not preserved.
HashMaps are not thread-safe, which means that if multiple threads access the same hashmap simultaneously, 
    it can lead to data inconsistencies. If thread safety is required, ConcurrentHashMap can be used.

**Difference between collections and collection**
---------------------------------------------------

Collection is interface which contains list,set and queue

Collections is utility class in java which provides methods like sorting , searching.

**Hashtable** 
-------------

Synchronized hence very slow

**Stack**
---------
LIFO

**Queue**
---------
FIFO

**SET**
-------
UnOrdered collection of storing objects where duplicates cannot be stored

**TreeSet**
-----------
Ordering is maintained but duplicates are not allowed

**Vector**
----------
Thread Safe
Allows Nulls: Can store null elements.
