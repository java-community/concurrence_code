package forkJoinPool.test13;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/11/21
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "我是返回值";
    }
}
