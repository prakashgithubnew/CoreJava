package CoreJavaPractise.Threading;

public class EvenOddPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread oddThread = new OddThread(printer);
        Thread evenThread = new EvenThread(printer);
        oddThread.start();
        evenThread.start();
    }

    static class Printer {
        private boolean isOdd = false;  // Start with even numbers (i.e., false)
        // Synchronized method to print even numbers
        public synchronized void printEven(int number) {
            while (!isOdd) {
                try {
                    wait(); // Wait until it's time to print even number
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Even: " + number);
            isOdd = false; // After printing an even number, allow odd to print next
            notify(); // Notify the other thread to proceed
        }

        // Synchronized method to print odd numbers
        public synchronized void printOdd(int number) {
            while (isOdd) {
                try {
                    wait(); // Wait until it's time to print odd number
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Odd: " + number);
            isOdd = true; // After printing an odd number, allow even to print next
            notify(); // Notify the other thread to proceed
        }
    }

    static class OddThread extends Thread {
        private final Printer printer;

        public OddThread(Printer printer) {
            this.printer = printer;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 9; i += 2) {
                printer.printOdd(i);
            }
        }
    }
    static class EvenThread extends Thread {
        private final Printer printer;

        public EvenThread(Printer printer) {
            this.printer = printer;
        }

        @Override
        public void run() {
            for (int i = 2; i <= 10; i += 2) {
                printer.printEven(i);
            }
        }
    }

}
