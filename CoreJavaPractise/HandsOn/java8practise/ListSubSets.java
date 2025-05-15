package CoreJavaPractise.HandsOn.java8practise;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ListSubSets {

    public static void main(String[] args){
        List<String> list = Arrays.asList("1","2","3","4","5");
        ExecutorService executor = Executors.newFixedThreadPool(3);

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            for(String str: list){
                System.out.println(str);
            }
            return "Hello, Future!";
        }, executor);

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            //sleep(500);
            for(int i=0;i<list.size();i++){
                for(int j=i+1;j<list.size();j++){
                    System.out.println(list.get(i)+list.get(j));
                }
            }
            return "Hello, Future1!";
        }, executor);

        CompletableFuture<String> combinedFuture = future1
                .thenCombine(future2, String::concat);

    }
}
