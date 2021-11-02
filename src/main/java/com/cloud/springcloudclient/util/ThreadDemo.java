package com.cloud.springcloudclient.util;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @Author hanyuhao
 * @PackageName com.cloud.springcloudclient.util
 * @Class ThreadDemo
 * @Date 2021/8/4 14:37
 */
public  class ThreadDemo implements Runnable{
    public static void main(String[] args) throws InterruptedException {

        Thread threada = new Thread(new ThreadDemo());
        Thread threadb = new Thread(new ThreadDemo());
        Thread threadc = new Thread(new ThreadDemo());
        threada.start();
        threadb.start();
        threadc.start();
    }


    @Override
    public void run() {

        int count = 0;
        for(; count < 2; count++){
            System.out.println(Thread.currentThread().getName()+count);
        }

    }
}

