package Phaser.test7;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/18
 */
public class ThreadA extends Thread {
    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "A1 begin=" + System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName() + "A1 end=" + System.currentTimeMillis());
    }
}
