package CompletionService.Test4;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by zhangalong on 2018/10/18
 */
public class Run1 {
    public static void main(String[] args) {
        MyCallableA a = new MyCallableA();
        MyCallableB b = new MyCallableB();
        ExecutorService pool = Executors.newCachedThreadPool();
        CompletionService service = new ExecutorCompletionService(pool);
        service.submit(a);
        service.submit(b);
        for (int i = 0; i < 2; i++) {
            System.out.println("zzzzz" + " " + service.poll());
        }
        System.out.println("main end");
    }
}
