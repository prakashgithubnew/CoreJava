Linked List - Linked List
-------------
    Time Complexity
Insertion and deletion takes constant time - O(1)
Search - O(n) - it need to search till the nodes it reaches the element

    Space Complexity
Linked List stores two things - value and pointer , hence space increases as number of elements
O(n)

ArrayList - Uses Array as data structure
----------
Search by Index - O(1)
Search without Index - O(n) -worst complexity since it will traverse all elements of arraylist 
hence linked list is preferred for multiple inserts

Add  - O(n)

Remove by index  -O(1)
Remove - O(n)


SET - Hashtable as data structure
----

Time

Insert , remove and search  - O(1)

Tree Set - Tree Structure
---------
Time Complexity - o(log (n))


Hashmap
--------
Time Complexity - O(1) but in collision condition O(n)
Space Complexity - O(n) since keys and values are also stored


**How Time and Space Complexities are evaluated**
-------------------------------------------------
Time Complexity for some sample programs

Program 1
----------
class GFG {
public static void main(String[] args)
{
System.out.print("Hello World");
}
}

TC- O(1)

Program 2
---------
    class GFG {
    
        public static void main(String[] args)
        {
            int i, n = 8;
            for (i = 1; i <= n; i++) {
                System.out.printf("Hello World !!!\n");
            }
        }
    }

TS - O(n)

Program 3
---------
    class GFG {
    
        public static void main(String[] args)
        {
            int i, n = 8;
            for (i = 1; i <= n; i=i*2) {
                System.out.println("Hello World !!!");
            }
        }
    }
TC - O(log₂(n))


How to evaluate the time complexity
-----------------------------------

    public class ListSum {
        // Function to calculate the sum of elements in an array
        static int listSum(int[] A, int n) {
            int sum = 0; // Cost = 1, executed 1 time
            for (int i = 0; i < n; i++) { // Cost = 2, executed n+1 times (+1 for
                                          // the end false condition)
                sum = sum + A[i]; // Cost = 2, executed n times
            }
            return sum; // Cost = 1, executed 1 time
        }
    
        // Main method for testing
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int length = array.length;
            int result = listSum(array, length);
            System.out.println("Sum: " + result);
        }
    }

Tsum=1 + 2 * (n+1) + 2 * n + 1 = 4n + 4 =C1 * n + C2 = O(n)
Therefore, the time complexity of the above code is O(n)










**Time Complexity**
-------------------