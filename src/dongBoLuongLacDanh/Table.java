package dongBoLuongLacDanh;

public class Table {
    synchronized void table(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
    }
}
