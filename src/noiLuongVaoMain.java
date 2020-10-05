public class noiLuongVaoMain {
    public static void main(String[] args) throws InterruptedException {
        //join 2 luồng vào luồng main

        System.out.println("stast main");
        Thread thread =new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("t1 " +i);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread.join();

        Thread thread1 =new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("t2 " +i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread1.join();


        System.out.println("end");
    }

}
