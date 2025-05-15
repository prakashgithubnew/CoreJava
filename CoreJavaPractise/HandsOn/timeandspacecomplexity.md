======================== Time Complexity===============================

ArrayList:

    **Time Complexity**
    -------------------
    Removal
    1. At random index - O(n) - Shift and adjustment needed
    2. At the start - O(n) - shift and adjustment needed
    3. At the end - O(1) - No shift or adjustment needed
    
    Add
    1. At random index - O(n) - Shift and adjustment needed
    2. At the start - O(n) - shift and adjustment needed
    3. At the end - O(1) - No shift or adjustment needed
    
    Search
    1. Random index - O(1) - An ArrayList is implemented with an array, which offers random access.
    2. Front or end - O(1) - An ArrayList is implemented with an array, which offers random access.

HashMap:

    **Time Complexity**
    --------------------
    
    Add/Remove/Search
    
    Since Hashmap is build on array of Linked List hence average time complexity for add/remove and search is 
    O(1)
    
    In Case of Collision
    O(n)
    
Linked List:

    **Time Complexity**
    -------------------
    Adding First ,last,Mid  - O(1) - Because Linked List uses pointers


========================Space Complexity=============================

Example 1:

    List<Employee> employees = new ArrayList<>(10);
    The space complexity initially for this initilization is 10 but when objects are added
    TC changes as per added elements

Example 2:

    Space Complexity for below program is O(n) as more objects are added more space increases

        public class ListExamples {
    
        public static void main(String[] args){
            List<Employee> employees = new ArrayList<>();
            employees.add(
                    new Employee("mukut", 45, "Senior Manager"));
            employees.add(
                    new Employee("sameer", 45, "Consultant"));
    
            System.out.println("Second element"+employees.get(0));
    
        }
    }
