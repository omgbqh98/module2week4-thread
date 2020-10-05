package noi2LuongVoiNhau;

public class Main {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread thread2 = new Thread(new Thread1(thread1));
        for (int i = 0; i < 30; i++) {
            System.out.println("t2 " + i);
        }
        thread1.start();
        thread2.start();
    }

}
