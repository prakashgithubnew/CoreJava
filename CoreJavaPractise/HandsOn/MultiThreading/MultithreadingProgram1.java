package CoreJavaPractise.HandsOn.MultiThreading;

public class MultithreadingProgram1 {
    public static void main(String[] args) throws InterruptedException {
        // Create instances of MyRunnable with different thread names
        MyRunnable task1 = new MyRunnable("Thread 1");
        MyRunnable task2 = new MyRunnable("Thread 2");
        MyRunnable task3 = new MyRunnable("Thread 3");

        // Create thread objects with the MyRunnable tasks
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        // Start the threads
        thread1.start();
        //thread1.join();
        thread2.start();
        //thread2.join();
        thread3.start();
        //thread3.join();

        // Wait for all threads to finish execution
        /*try {
            thread1.join();


        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }*/

        System.out.println("All threads have finished execution.");
    }

    static class MyRunnable implements Runnable {
        private String threadName;

        // Constructor to assign thread name
        public MyRunnable(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            // This is the code that each thread will execute
            synchronized (this) {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(threadName + " is executing iteration " + i);
                    try {
                        // Sleep for a random time to simulate work
                        Thread.sleep((int) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        System.out.println(threadName + " was interrupted.");
                    }
                }
            }
        }
    }

}