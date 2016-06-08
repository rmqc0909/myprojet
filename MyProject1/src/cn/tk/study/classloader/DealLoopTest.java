/**
 * 
 */
package cn.tk.study.classloader;

import java.util.concurrent.TimeUnit;

/**

 * @ClassName: DealLoopTest

 * @Description: ������ᱣ֤һ�����<clinit>()�����ڶ��̻߳����б���ȷ�ļ�����ͬ�����������߳�ͬʱȥ��ʼ��һ���࣬
 * ��ôֻ����һ���߳�ȥִ��������<clinit>()�����������̶߳���Ҫ�����ȴ���ֱ����߳�ִ��<clinit>()������ϡ�
 * �����һ�����<clinit>()�������к�ʱ�ܳ��Ĳ������Ϳ�����ɶ���߳���������ʵ��Ӧ���������������������ص�

 * @author xiedan11

 * @date 2016��6��2�� ����1:43:41

 *


 */
public class DealLoopTest {
	static class DeadLoopClass
    {
		/**
		 * 1.��һ���߳�����ѭ����ģ�ⳤʱ���������һ���߳��������ȴ�
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
         * 2.��Ҫע����ǣ������߳���Ȼ�ᱻ�����������ִ��<clinit>()�����������߳��˳�<clinit>()������
         * �����̻߳���֮�󲻻��ٴν���<clinit>()������ͬһ����������£�һ������ֻ���ʼ��һ�Ρ�
         * ��̬��ֻ��������ص��ڴ��е�ʱ��ִ��һ�Ρ�
         */
        static
        {
            System.out.println(Thread.currentThread() + "init DeadLoopClass");	//ֻ��ʼ����һ�Σ�
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
