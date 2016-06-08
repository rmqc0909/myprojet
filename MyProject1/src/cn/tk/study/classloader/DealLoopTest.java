/**
 * 
 */
package cn.tk.study.classloader;

import java.util.concurrent.TimeUnit;

/**

 * @ClassName: DealLoopTest

 * @Description: 虚拟机会保证一个类的<clinit>()方法在多线程环境中被正确的加锁、同步，如果多个线程同时去初始化一个类，
 * 那么只会有一个线程去执行这个类的<clinit>()方法，其他线程都需要阻塞等待，直到活动线程执行<clinit>()方法完毕。
 * 如果在一个类的<clinit>()方法中有耗时很长的操作，就可能造成多个线程阻塞，在实际应用中这种阻塞往往是隐藏的

 * @author xiedan11

 * @date 2016年6月2日 下午1:43:41

 *


 */
public class DealLoopTest {
	static class DeadLoopClass
    {
		/**
		 * 1.即一条线程在死循环以模拟长时间操作，另一条线程在阻塞等待
		 */
//        static
//        {
//            if(true)
//            {
//                System.out.println(Thread.currentThread()+"init DeadLoopClass");
//                while(true)
//                {
//                }
//            }
//        }
        /**
         * 2.需要注意的是，其他线程虽然会被阻塞，但如果执行<clinit>()方法的那条线程退出<clinit>()方法后，
         * 其他线程唤醒之后不会再次进入<clinit>()方法。同一个类加载器下，一个类型只会初始化一次。
         * 静态块只会在类加载到内存中的时候执行一次。
         */
        static
        {
            System.out.println(Thread.currentThread() + "init DeadLoopClass");	//只初始化了一次；
            try
            {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
	
	public static void main(String[] args)
    {
        Runnable script = new Runnable(){
            public void run()
            {
                System.out.println(Thread.currentThread()+" start");
                DeadLoopClass dlc = new DeadLoopClass();
                System.out.println(Thread.currentThread()+" run over");
            }
        };

        Thread thread1 = new Thread(script);
        Thread thread2 = new Thread(script);
        thread1.start();
        thread2.start();
    }
}
