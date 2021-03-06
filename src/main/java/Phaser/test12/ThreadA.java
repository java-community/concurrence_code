package Phaser.test12;

import java.util.concurrent.Phaser;

/**
 * created by zhangalong on 2018/9/19
 */
public class ThreadA extends Thread {
    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "A1 begin=" + System.currentTimeMillis());
        try {
            phaser.awaitAdvanceInterruptibly(0);
            System.out.println(Thread.currentThread().getName() + "A2 end=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
