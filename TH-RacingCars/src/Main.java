public class Main {
    public static final int DISTANCE = 100;
    public static int step = 2;

        public static void main(String[] args) {
            RaceCar carA = new RaceCar("A");
            RaceCar carB = new RaceCar("B");
            RaceCar carC = new RaceCar("C");

            Thread thread1 = new Thread(carA);
            Thread thread2 = new Thread(carB);
            Thread thread3 = new Thread(carC);

            System.out.println("Distance: 100KM");
            thread1.start();
            thread2.start();
            thread3.start();
        }
    }
