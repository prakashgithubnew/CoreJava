package CoreJavaPractise.HandsOn.MultiThreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo
{
    public static void main(String args[])
            throws InterruptedException
    {
        // Let us create task that is going to
        // wait for four threads before it starts
        CountDownLatch latch = new CountDownLatch(4);

        // Let us create four worker
        // threads and start them.
        Worker first = new Worker(1000, latch,
                "WORKER-1");
        Worker second = new Worker(2000, latch,
                "WORKER-2");
        Worker third = new Worker(3000, latch,
                "WORKER-3");
        Worker fourth = new Worker(4000, latch,
                "WORKER-4");
        ThreadEx thread = new ThreadEx();
        first.start();
        second.start();
        third.start();

        fourth.start();
        latch.await();

        thread.start();

        // The main task waits for four threads


        // Main thread has started
        System.out.println(Thread.currentThread().getName() +
                " has finished");
    }

    static class Worker extends Thread
    {
        private int delay;
        private CountDownLatch latch;

        public Worker(int delay, CountDownLatch latch,
                      String name)
        {
            super(name);
            this.delay = delay;
            this.latch = latch;
        }

        @Override
        public void run()
        {
            try
            {
                Thread.sleep(delay);
                latch.countDown();
                System.out.println(Thread.currentThread().getName()
                        + " finished");
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }


    static class ThreadEx extends Thread{

        @Override
        public void run(){
            System.out.println("Thread is going to sleep");

        }
    }
}
