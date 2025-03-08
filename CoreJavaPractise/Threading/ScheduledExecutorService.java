package CoreJavaPractise.Threading;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorService {

    public static void main(final String[] arguments) throws InterruptedException {
        final java.util.concurrent.ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        scheduler.scheduleAtFixedRate(new EvenNumber(), 2, 2, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(new OddNumber(), 2, 2, TimeUnit.SECONDS);

        scheduler.schedule(new Runnable() {

            @Override
            public void run() {
                System.out.println("=====Ending Run=====");
                scheduler.shutdown();
            }
        }, 2, TimeUnit.SECONDS);


    }

    static class OddNumber implements Runnable {

        public void run() {
            for(int i=1;i<10;i+=2) {
                System.out.println("Printing Odd Number-"+i);
            }
        }
    }

    static class EvenNumber implements Runnable {

        public void run() {
            for(int i=0;i<10;i+=2) {
                System.out.println("Printing Even Number-"+i);
            }
        }
    }


}