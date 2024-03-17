public class MultiThredingWithThread extends Thread{

    int threadNumber;
    public MultiThredingWithThread(int number){
        this.threadNumber = number;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" from thread "+threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
