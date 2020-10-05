package noi2LuongVoiNhau;

class Thread1 extends Thread{
    Thread1 t1;

    public Thread1() {
    }

    public Thread1(Thread1 t1) {
        this.t1 = t1;
    }


    @Override
    public void run() {
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 30; i++) {
            System.out.println("t1 " +i);
        }
    }
}
