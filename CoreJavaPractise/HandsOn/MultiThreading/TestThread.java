package CoreJavaPractise.HandsOn.MultiThreading;


public class TestThread {
    public static void main(String[] args) {
        InterThreadCommunicationClass m = new InterThreadCommunicationClass();
        new T1(m);
        new T2(m);
    }

    static class InterThreadCommunicationClass {
        boolean flag = false;

        public synchronized void Question(String msg) {
            if (flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(msg);
            flag = true;
            notify();
        }

        public synchronized void Answer(String msg) {
            if (!flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(msg);
            flag = false;
            notify();
        }
    }

    static class T2 implements Runnable {
        InterThreadCommunicationClass m;
        String[] s2 = { "Hi", "I am good, what about you?", "Great!" };

        public T2(InterThreadCommunicationClass m2) {
            this.m = m2;
            new Thread(this, "Answer").start();
        }

        public void run() {
            for (int i = 0; i < s2.length; i++) {
                m.Answer(s2[i]);
            }
        }
    }

    static class T1 implements Runnable {
        InterThreadCommunicationClass m;
        String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };

        public T1(InterThreadCommunicationClass m1) {
            this.m = m1;
            new Thread(this, "Question").start();
        }

        public void run() {
            for (int i = 0; i < s1.length; i++) {
                m.Question(s1[i]);
            }
        }
    }
}

