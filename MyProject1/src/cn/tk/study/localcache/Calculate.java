package cn.tk.study.localcache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by xiedan11 on 2016/11/9.
 * java8��java7�ı��ػ���ʵ��   �ظ�������Ҫ�ӱ��ػ�����������ܡ�
 */
@SuppressWarnings("all")    //�������еľ�����Ϣ
public class Calculate {
    static Map<Integer, Integer> cache1 = new ConcurrentHashMap<>();
    static Map<Integer, Integer> cache2 = new ConcurrentHashMap<>();
    static Map<Integer, Integer> cache3 = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        System.out.println("normal method:");
        for (int i = 0; i < 45; i++) {
            //System.out.println("f(" + i + ") = " + fibonacci(i));
            fibonacci(i);
        }
        System.out.println("running time: " + (System.currentTimeMillis() - startTime1) + "ms");
        long startTime2 = System.currentTimeMillis();
        System.out.println("java7 synchronization method:");
        for (int i = 0; i < 45; i++) {
            //System.out.println("f(" + i + ") = " + fibonacciJava7(i));
            fibonacciJava7(i);
        }
        System.out.println("running time: " + (System.currentTimeMillis() - startTime2) + "ms");
        long startTime3 = System.currentTimeMillis();
        System.out.println("java8 computeIfAbsent method:");
        for (int i = 0; i < 45; i++) {
            //System.out.println("f(" + i + ") = " + fibonacciJava8(i));
            fibonacciJava8(i);
        }
        System.out.println("running time: " + (System.currentTimeMillis() - startTime3) + "ms");
        long startTime4 = System.currentTimeMillis();
        System.out.println("java7 method");
        for (int i = 0; i < 45; i++) {
            //System.out.println("f(" + i + ") = " + fibonacciJava7I(i));
            fibonacciJava7I(i);
        }
        System.out.println("running time: " + (System.currentTimeMillis() - startTime4) + "ms");

    }


    /**
     * ��ͨ��ʵ�ַ�ʽ
     * @param i
     * @return  �������ս��
     */
    private static int fibonacci(int i) {
        if (i == 0 || i == 1)
            return i;
        //System.out.println("calculating Fibonacci(" + i + ")");
        return fibonacci(i - 2) + fibonacci(i - 1);
    }

    /**
     *java8��computeIfAbsent����������key����Ӧ��valueֵ�����ڵ�����£�����һ���µ�valueֵ��
     * @param i
     * @return    �������ս��
     */
    private static int fibonacciJava8(int i) {
        if (i == 0 || i == 1)
            return i;
        return cache2.computeIfAbsent(i, (key) -> fibonacciJava8(i - 2) + fibonacciJava8(i - 1));
    }

    /**
     * java7 ͨ��synchronized�����߳�ͬ������黺���Ƿ����key��Ӧ��ֵ����������ڲŽ�����Ӧ�ļ��㡣
     * @param i
     * @return   �������ս��
     */
    private static int fibonacciJava7(int i) {
        if (i == 0 || i == 1)
            return i;
        Integer result = cache1.get(i);
        if (result == null) {
            synchronized (cache1) {
                result = cache1.get(i);
                if (result == null) {
                    result = fibonacciJava7(i - 2) + fibonacciJava7(i - 1);
                    cache1.put(i, result);
                }
            }
        }
        return result;
    }

    /**
     * java7 ��黺���Ƿ����key��Ӧ��ֵ����������ڲŽ�����Ӧ�ļ��� ��������ͬ�����ƣ�
     * @param i
     * @return   �������ս��
     */
    private static int fibonacciJava7I(int i) {
        if (i == 0 || i == 1)
            return i;
        Integer result = cache3.get(i);
        if (result == null) {
            result = fibonacciJava7(i - 2) + fibonacciJava7(i - 1);
            cache3.put(i, result);
        }
        return result;
    }
}
