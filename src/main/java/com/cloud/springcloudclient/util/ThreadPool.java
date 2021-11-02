package com.cloud.springcloudclient.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author hanyuhao
 * @PackageName com.cloud.springcloudclient.util
 * @Class ThreadPool
 * @Date 2021/8/4 13:49
 */
public class ThreadPool {
    public static void main(String[] args) {
        /**
         * 有A,B,C三个线程，线程A输出A，线程B输出B，线程C输出C，现要求按ABC的顺序输出十次
         * */
        //方法一：线程池

         ExecutorService pool = Executors.newSingleThreadExecutor();
         for (int i = 0; i < 10; i++){
         pool.submit(()-> System.out.println("A"));
         pool.submit(()-> System.out.println("B"));
         pool.submit(()-> System.out.println("C"));
         }

         pool.shutdown();
    }
}
