package CoreJavaPractise.Threading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Prints even and odd numbers asynchronously with 2 threads
 */
public class ExecutorServiceProgram2 {
    public static void main(String[] args) {
        final int LIMIT = 10;

        CompletableFuture<Void> evenTask = CompletableFuture.runAsync(() -> {
            for (int i = 0; i <= LIMIT; i += 2) {
                System.out.println("Even Thread: " + i);
                try {
                    Thread.sleep(500); // Simulating work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        CompletableFuture<Void> oddTask = evenTask.thenRunAsync(() -> {
            for (int i = 1; i < LIMIT; i += 2) {
                System.out.println("Odd Thread: " + i);
                try {
                    Thread.sleep(500); // Simulating work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // Combine all futures and wait for completion
        try {
            oddTask.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Both even and odd number tasks executed alternately.");
    }
}