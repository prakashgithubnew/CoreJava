package CoreJavaPractise.java8practise;

import java.io.Serializable;

class Student implements Serializable {
    private String name;
    private transient int age;
    private static int year = 2021;
    public Student(){
        System.out.println("This is a constructor");
        //this.name = "Krishna";
        //this.age = 25;
    }
    public Student(String name, int age, int year){
        this.name = name;
        this.age = age;
        this.year=year;
    }
    public void display() {
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Year: "+Student.year);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setYear(int year) {
        Student.year = year;
    }
}