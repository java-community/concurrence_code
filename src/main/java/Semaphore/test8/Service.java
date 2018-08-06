package Semaphore.test8;

import java.util.concurrent.Semaphore;

/**
 * created by zhangalong on 2018/8/6
 */
public class Service {
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        if (semaphore.tryAcquire()) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "首选进入！");
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
            }
            semaphore.release();
        } else {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "未成功进入！");
        }
    }
}
