package CoreJavaPractise.HandsOn.MultiThreading;

public class ThreadLocalExample {
    private static ThreadLocal<String> threadLocalString = new ThreadLocal<>() {
        @Override
        protected String initialValue() {
            return "Default Value";
        }
    };

    private static volatile int num = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            num++;
            System.out.println("Thread 1: " + num);
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2: " + num);
        });

        thread1.start();
        thread2.start();
    }
}