package cyclicBarrier.test5;

/**
 * created by zhangalong on 2018/8/20
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
