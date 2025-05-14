package CommonHandsOn;

public class TestStudentEmployee {

    public static void main(String[] args){
        Employee employee = new Employee("test");
        Student student = new Student("test");
        System.out.println(employee.hashCode());
        System.out.println(student.hashCode());

    }
}
