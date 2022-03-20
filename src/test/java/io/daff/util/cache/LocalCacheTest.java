package io.daff.util.cache;

import io.daff.cache.Computable;
import io.daff.cache.LocalCache;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * LocalCache测试类
 *
 * @author daff
 * @since 2022/3/20
 */
public class LocalCacheTest {

    private static final LocalCache<String, Integer> cache = new LocalCache<>(new ConvertNum());

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(1000);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            executorService.submit(() -> {
                Integer integer = null;
                try {
                    integer = cache.get("111");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "获取的结果为：" + integer);
            });
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {}
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");

        System.out.println(cache.get("222", 4000));
        System.out.println(cache.get("222"));
        TimeUnit.SECONDS.sleep(3);
        System.out.println(cache.get("222"));

    }

    static class ConvertNum implements Computable<String, Integer> {
        @Override
        public Integer compute(String params) throws Exception {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread().getName() + "执行计算任务");
            return Integer.valueOf(params);
        }
    }
}
