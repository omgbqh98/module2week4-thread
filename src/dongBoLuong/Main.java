package dongBoLuong;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();

        MyThread t1 = new MyThread(table);
        MyThread t3 = new MyThread(table);

        MyThread2 t2 = new MyThread2(table);

        t1.start();
        t2.start();
        t3.start();
    }
}
