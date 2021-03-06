package ThreadPoolExecutor.test9;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/9/26
 */
public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 runnable1 = new MyRunnable1();
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 99999, 9999L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(runnable1);
        executor.execute(runnable1);
        executor.execute(runnable1);
        executor.execute(runnable1);
        Thread.sleep(1000);
        executor.shutdown();
        executor.execute(runnable1);
        System.out.println("end!");

    }
}
