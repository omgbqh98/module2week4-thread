public class Thread1 {

    public Thread1(NumberGenerator numberGenerator) {
    }
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread thread = new Thread(numberGenerator);
        Thread thread1 = new Thread(numberGenerator);

        thread.start();
        thread1.start();


    }


}
