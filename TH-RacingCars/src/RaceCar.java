import sun.applet.Main;

import java.util.Random;

public class RaceCar extends Thread {
    private String name;

    public RaceCar(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // Khởi tạo điểm start(hay km ban đầu)
        int runDistance = 0;
        // Khởi tạo time bắt đầu cuộc đua
        long starTime = System.currentTimeMillis();
        // Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < 100) {
            try {
            // Random Speed KM/H
            int speed = (new Random().nextInt(20));
            // Tính quãng đường đã đi
            runDistance += speed;
            // Xây dựng đồ họa kết quả
            String log = "|";
            int percentTravel = (runDistance * 100) / 100;
            for (int i = 0; i < 100; i += 5) {
                if (percentTravel >= i + 5) {
                    log += "=";
                } else if (percentTravel >= i && percentTravel < i + 5) {
                    log += "o";
                } else {
                    log += "-";
                }
            }
            log += "|";
            System.out.println("Car" + this.name + ": " + log + " " + Math.min(100, runDistance) + "KM");

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }

        }

