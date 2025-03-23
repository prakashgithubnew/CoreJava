package CoreJavaPractise.java8practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample{
    public static void main(String args[]) throws Exception{
        //Creating a Student object
        Student std = new Student("Vani", 27,2099);
        //Serializing the object
        FileOutputStream fos = new FileOutputStream("c:\\student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(std);
        oos.close();
        fos.close();
        //Printing the data before de-serialization
        /*System.out.println("Values before de-serialization");
        std.display();
        //Changing the static variable value
        std.setYear(2345);
        //Changing the instance variable value
        std.setName("Varada");
        //Changing the transient variable value
        std.setAge(19);*/
        System.out.println("Object serialized.......");
        //De-serializing the object
        FileInputStream fis = new FileInputStream("c:\\student.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student deSerializedStd = (Student) ois.readObject();
        System.out.println("Object de-serialized.......");
        ois.close();
        fis.close();
        System.out.println("Values after de-serialization");
        deSerializedStd.display();
    }
}