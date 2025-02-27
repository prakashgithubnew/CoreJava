package CoreJavaPractise.Callback;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceProgram {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, Future!";
        });
        try {
            String result = future.get();
            System.out.println("The Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
