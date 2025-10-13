
class MyThread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("My thread is now running.");
            System.out.println("I'm Happy.");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("My thread 2 is now running.");
            System.out.println("But I'm sad.");
        }
    }
}

public class MultiThreading {
    /*
     * Multithreading and multiprocessing both are used to achieve multitasking.
     * 
     * 1. Threads use shared memory area
     * 2. THey have faster context switching
     * 3.Thread is light weight compared to preocess
     * 
     */
    public static void main(String[] args) {
        /*
         * We can create and use thread in java by:
         * a. extending thread class.
         * b. implementing Rumlble Interface.
         */

        // THis is the use case by extending thread class.
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}