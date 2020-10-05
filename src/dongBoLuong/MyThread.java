package dongBoLuong;

public class MyThread extends Thread {
    Table t;

    public MyThread(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}
