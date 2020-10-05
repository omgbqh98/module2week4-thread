package KhoiDongBo;

public class Table {
    void printTable(int n) {
        synchronized (this) {// Khoi dong bo (synchronized block)
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }// Ket thuc phuong thuc
}
