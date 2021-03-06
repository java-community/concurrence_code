package ThreadPoolExecutor.test12;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/9/28
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 runnable1 = new MyRunnable1();
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(2, 99999, 9999L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        executor.execute(runnable1);
        executor.shutdown();
        System.out.println("main begin!" + System.currentTimeMillis());
        System.out.println(executor.awaitTermination(10, TimeUnit.SECONDS));
        System.out.println("main end!" + System.currentTimeMillis());
    }
}
