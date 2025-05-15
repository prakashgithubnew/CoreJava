package CoreJavaPractise.HandsOn.java8practise;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddNumberMultithreading {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(list.stream().filter(x->x%2==0).toList());
            return "Hello, Future!";
        }, executor);

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            //sleep(500);
            System.out.println(list.stream().filter(x->x%2!=0).toList());
            return "Hello, Future1!";
        }, executor);

        CompletableFuture<String> combinedFuture = future1
                .thenCombine(future2, String::concat);

    }
}
