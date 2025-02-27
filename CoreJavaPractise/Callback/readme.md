**Asynchronous programming**
--------------------------------------------------
Async call can be made in java using Completable Future class or ExecutorService as below
In this an Async call is added to queue and will be returned after its completed

Refer full program in [CompletableFutureProgram.java]()

    CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    try {
    Thread.sleep(200);
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    return "Hello, CompletableFuture!";
    });
or ExecutorServiceProgram.java

Async in Spring Boot
---------------------
In spring boot same can be achieved by using
@Async annotation

