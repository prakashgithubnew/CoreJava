package CoreJavaPractise.java8practise.MultipleFilters;

import java.util.Objects;

public class Employee {

    private String name;

    private String age;

    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Employee(String name, String age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
}
