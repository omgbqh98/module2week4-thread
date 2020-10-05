package dongBoLuongLacDanh;

public class main {
    public static void main(String[] args) {
        Table table1 = new Table();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                table1.table(5);
            }
        });
        Thread thread1 =new Thread(() -> table1.table(100));
       thread.start();
       thread1.start();

    }
}
