package CoreJavaPractise.java8practise.MultipleFilters;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class FilterMainClass {

    FilterManagement filterManagement;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Option");

        for (Employee employee : Objects.requireNonNull(new FilterMainClass().returnFilteredList(scanner.nextLine()))) {

            System.out.println(employee.getName());
        }

    }

    private List<Employee> returnFilteredList(String arg) {
        List<String> value = Arrays.asList("56","44");
        return switch (arg) {
            case "Designation" -> {
                filterManagement = new EmployeeDesignationFilterImpl();
                yield filterManagement.doFilter(value);
            }
            case "Age" -> {
                filterManagement = new EmployeeAgeFilterImpl();
                yield filterManagement.doFilter(value);
            }
            default -> null;
        };
    }
}
