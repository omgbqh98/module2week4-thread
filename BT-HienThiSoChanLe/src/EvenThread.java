public class EvenThread extends Thread {
    OddThread oddThread;

    public EvenThread() {
    }

    public EvenThread(OddThread oddThread) {
        this.oddThread = oddThread;
    }

    @Override
    public void run() {
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("chan " + i);
        }
        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
