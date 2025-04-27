package CoreJavaPractise.MultiThreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorServiceProgram {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(1);

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Inside future starts");
            //sleep(500);
            System.out.println("Inside future end");
            return "Hello, Future!";
        }, executor);

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Inside future1 starts");
            //sleep(500);
            System.out.println("Inside future1 end");
            return "Hello, Future1!";
        }, executor);

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Inside future2 starts");
            //sleep(500);
            System.out.println("Inside future2 ends");
            return "Hello, Future2!";
        }, executor);

        // Combine all futures and wait for completion
        CompletableFuture<String> combinedFuture = future
                .thenCombine(future1, String::concat)
                .thenCombine(future2, String::concat);

        //System.out.println("The Result: " + combinedFuture.join());

        executor.shutdown();
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}