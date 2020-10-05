package khaibaothread;

import khaibaothread.KhaiBaoThread;

public class Main {
    public static void main(String[] args) {
        //cách 1:
        KhaiBaoThread khaiBaoThread = new KhaiBaoThread();
        khaiBaoThread.start();

        //cách 2:
        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(3990);
                        System.out.println("t1 " +i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //code
            }
        });
        thread.start();

        //cách 3:
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();


        //cách 4:
        Thread thread1 =new Thread(() -> {

        });
        thread1.start();

    }
}
