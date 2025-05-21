package CoreJavaPractise.Collection.HashMapHandsOn;

public class DynamicInstantiationHashMap {
    public static void main(String[] args) {
        try {
            // Dynamically load the class
            Class<?> cls = Class.forName("CoreJavaPractise.Collection.HashMapHandsOn.SampleHashMap");
            // Create an instance of the loaded class
            Object instance = cls.getDeclaredConstructor().newInstance();

            //instance.show();

            System.out.println("Instance created: " + instance.getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
