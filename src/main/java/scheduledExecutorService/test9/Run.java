package scheduledExecutorService.test9;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by zhangalong on 2018/11/16
 */
public class Run {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
        MyRunnable runnable = new MyRunnable("A");
        final ScheduledFuture<?> future = executor.schedule(runnable, 1, TimeUnit.SECONDS);
        System.out.println(future.cancel(true));
        System.out.println("");
        final BlockingQueue<Runnable> queue = executor.getQueue();
        final Iterator<Runnable> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Runnable runnable1 = iterator.next();
            System.out.println("队列中的：" + runnable1);
        }
        System.out.println("main end");
    }
}
