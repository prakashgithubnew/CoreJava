package CoreJavaPractise.Collection.ArrayListHandsOn;

import CoreJavaPractise.Collection.Employee;
import CoreJavaPractise.Collection.PredicateConstants;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "a", "a");
        //Iterating the elements using java 8 and method reference

        list.forEach(System.out::println);


        //Filter "a" values from list and count their occurrences
        System.out.println(list.stream().filter(x -> x.equals("a")).toList().size());

        //Check how many even numbers are there in the list
        List<Integer> listEvenOdd = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        //Count Even Numbers
        System.out.println("Even Numbers in the list are=>" + listEvenOdd.stream().filter(x -> x % 2 == 0).toList().size());

        //Count Odd Numbers
        System.out.println("Odd Numbers in the list are=>" + listEvenOdd.stream().filter(x -> x % 2 != 0).toList().size());

        //Check how many numbers are greater than 6
        System.out.println("Numbers greater than 6 in the list are=>" + listEvenOdd.stream().filter(x -> x > 6).toList().size());

        //Check how many strings length is more than 5
        List<String> listString = Arrays.asList("prakash", "selva", "kapil", "Anshaj", "prashant");
        System.out.println("Strings with length having more than 5 are=>" + listString.stream().filter(x -> x.length() > 5).toList().size());
        //Prints those strings whose length is more than 5
        List<String> list1 = listString.stream().filter(x -> x.length() > 5).toList();
        System.out.println("Strings having length more than 5 are=>" + list1);

        //Predicate example for arraylist

        List<Integer> list2 = listEvenOdd.stream().filter(new PredicateConstants().greaterThanTen).toList();
        System.out.println("List items which fulfil the predicates are==>" + list2);

        //Searching the arraylist
        if (!listString.stream().filter(x -> x.equals("prakash")).toList().isEmpty()) {
            System.out.println("String found in the list");
        } else {
            System.out.println("String not found in the list");
        }

        //Default Sorting the list
        List<String> sortedAlphabets = list.stream().sorted().toList();
        System.out.println("Sorting in natural Order");
        sortedAlphabets.forEach(System.out::println);

        //Default Sorting the list-
        List<String> sortedReverseAlphabets = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Sorting in reverse Order");
        sortedReverseAlphabets.forEach(System.out::println);

        //Filter and then sort
        List<String> list3 = Arrays.asList("akash", "prakash", "abhinav", "akshaj", "aman", "kapil");

        System.out.println("Filter and Sorting" + list3.stream().filter(x -> x.startsWith("a")).sorted().toList());


        //Grouping By Designation
        List<Employee> employees = Arrays.asList(
                new Employee("prakash", 45, "Manager"),
                new Employee("akash", 43, "Manager"),
                new Employee("pramesh", 45, "Senior Manager"),
                new Employee("premal", 45, "Consultant"),
                new Employee("kapil", 45, "Consultant"),
                new Employee("mukut", 45, "Senior Manager"),
                new Employee("sameer", 45, "Consultant")
        );

        Map<String, List<Employee>> multipleFieldsMapList = employees.stream().collect(
                Collectors.groupingBy(Employee::getDesignation));
        //Results By grouping by designation
        multipleFieldsMapList.forEach((key, value) -> {
            System.out.println(key + "-" + value.toString());
        });

        /// sorting employees with their names
        System.out.println("Sorting Employees object by their name");
        employees.sort(Comparator.comparing(Employee::getName));
        employees.forEach(System.out::println);

    }

}
