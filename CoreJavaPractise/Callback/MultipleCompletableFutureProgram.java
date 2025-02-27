package CoreJavaPractise.Callback;


import java.io.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * This program illustrates the async programming in java where by using CompletableFuture class
 * we can add task whcih will be independant and will be returned after its completed.
 */
public class MultipleCompletableFutureProgram {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, future1!";
        });


        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, future2!";
        });

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, future3!";
        });
        CompletableFuture.allOf(future1,future2,future3).join();
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        future1.thenAccept(result -> System.out.println("The Result: " + result));
        try {
            Thread.sleep(330);
            System.out.println("Nearly completion with out dependency");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}