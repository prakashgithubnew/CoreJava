package CoreJavaPractise.HandsOn.java8practise;

import CoreJavaPractise.HandsOn.Employee;

import java.util.ArrayList;
import java.util.List;

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
