package future.Test4;

import java.util.concurrent.Callable;

/**
 * created by zhangalong on 2018/10/12
 */
public class NewCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        int i = 0;
        while (i == 0) {
//            if (Thread.currentThread().isInterrupted()){
//                throw new InterruptedException();
//            }
            System.out.println("正在运行中");
        }
        return "我的年龄是100";
    }
}
