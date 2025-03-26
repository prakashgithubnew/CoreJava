package CoreJavaPractise.Threading;

import java.util.concurrent.CompletableFuture;

/**
 * This program illustrates the async programming in java where by using CompletableFuture class
 * we can add task whcih will be independant and will be returned after its completed.
 */
public class CompletableFutureProgram {

    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, CompletableFuture!";
        });
        future.thenAccept(result -> System.out.println("The Result: " + result));
        try {
            Thread.sleep(330);
            System.out.println("Nearly completion with out dependency");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}