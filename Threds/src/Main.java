
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //method 1: to run in multi thread, create object of the class

//        MultiThredingWithThread thread1 = new MultiThredingWithThread();
//        MultiThredingWithThread thread2 = new MultiThredingWithThread();
//        //thread1.run();//if use run() method, it will run in main thread but not multi thread
//        //thread2.run();//if use run() method, it will run in main thread but not multi thread
//        //first it will run thread1.run() and then thread2.run()
//
//        //to run in multi thread, use start() method
//        thread1.start();
//        thread2.start();
//        //this will run thread 1 and 2 at the same time


        //method 2: to run in multi thread, create object of the class
//        for(int j = 0; j < 10; j++){
//            MultiThredingWithThread thread = new MultiThredingWithThread();
//            thread.start();
//        }
//        //this will run 10 threads at same time


        //assigning number to thread
//        for (int i = 0; i < 10; i++) {
//            MultiThredingWithThread thread = new MultiThredingWithThread(i);
//            thread.start();
//        }


        //MultiThreadingWithRunnable

//        MultiThreadingWithRunnable runnable1 = new MultiThreadingWithRunnable(1);
//        MultiThreadingWithRunnable runnable2 = new MultiThreadingWithRunnable(2);
//        Thread thread1 = new Thread(runnable1);
//        Thread thread2 = new Thread(runnable2);
//
//        thread1.start();
//        thread2.start();

        //this will run thread 1 and 2 at the same time

        //or

        for(int j = 0; j < 10; j++){
            MultiThreadingWithRunnable runnable = new MultiThreadingWithRunnable(j);
            Thread thread = new Thread(runnable);
            thread.start();
        }


    }
}