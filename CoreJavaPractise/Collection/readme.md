**ArrayList**
-------------
Duplicates allowed
items would be stored same as added
Implementation of List Interface
uses dynamic array
if you provide capacity with 1 in arraylist still you can add more than 2 elements

List.of()//creates Immutable list
List.asList//creates Mutable list
List list = Array.asList//will create immutable lost on which modification not allowed
ArrayList takes more memory as it stores the elements directly

****HashMap****
---------------
Duplicate keys not allowed
one Null key and many null value can be stored
Internally uses Hashing (similar to Hashtable in Java).
Not Synchronized (unlike Hashtable in Java) and hence faster for most of the cases.
HashMap allows for efficient key-based retrieval, insertion, and removal with average O(1) time complexity.
HashMaps are not ordered, which means that the order in which elements are added to the map is not preserved.
HashMaps are not thread-safe, which means that if multiple threads access the same hashmap 
simultaneously, it can lead to data inconsistencies. 
If thread safety is required, ConcurrentHashMap can be used.
hashmap is initialized with 16 bucket size 0-15 in heap memory.

**How hashmap works internally**
--------------------------------
1. To put any item first hashmap uses hashcode to determine the index of the bucket.
2. When hashcode is fetched index is calculated for the same.

PFB image for the same-

![img.png](img.png)

Since the index is same for both the keys hence both the elements are put 
in the same index but to different buckets.

when the same index is retrieved hashmap calls equals method to see if both the keys are same or different

if same keys then replace the keys with latest value
if different keys then add the element as image above.

**Fetch the element**
---------------------
1. Find the element as the key and generate the hashcode and index.
2. Find the index and get the key and compare with the key passed.
3. if key matches then fetch the value.
4. if key does not match then retrieve the next element and so on...

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

**TreeMap**
-----------
Treemap keeps the elements in sorted order(increasing order) and also maintains the 
unique elements


**LinkedList()**
----------------
ArrayList and LinkedList both are List implementation only.
LinkedList uses double linked list for managing the elements
Linkedlist does not take more memory as it stores objects references.
