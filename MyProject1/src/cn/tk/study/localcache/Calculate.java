package cn.tk.study.localcache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by xiedan11 on 2016/11/9.
 * java8��java7�ı��ػ���ʵ��   �ظ�������Ҫ�ӱ��ػ�����������ܡ�
 */
public class Calculate {
    static Map<Integer, Integer> cache = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 40; i++) {
            System.out.println("f(" + i + ") = " + fibonacci(i));
            //System.out.println("f(" + i + ") = " + fibonacciJava7(i));
            //System.out.println("f(" + i + ") = " + fibonacciJava8(i));
            //System.out.println("f(" + i + ") = " + fibonacciJava7I(i));
       }
       System.out.println("running time: " + (System.currentTimeMillis() - startTime) + "ms");
    }


    /**
     * ��ͨ��ʵ�ַ�ʽ
     * @param i
     * @return
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
     * @return
     */
    private static int fibonacciJava8(int i) {
        if (i == 0 || i == 1)
            return i;
        return cache.computeIfAbsent(i, (key) -> fibonacciJava8(i - 2) + fibonacciJava8(i - 1));
    }

    /**
     * java7 ͨ��synchronized�����߳�ͬ������黺���Ƿ����key��Ӧ��ֵ����������ڲŽ�����Ӧ�ļ��㡣
     * @param i
     * @return
     */
    private static int fibonacciJava7(int i) {
        if (i == 0 || i == 1)
            return i;
        Integer result = cache.get(i);
        if (result == null) {
            synchronized (cache) {
                result = cache.get(i);
                if (result == null) {
                    result = fibonacciJava7(i - 2) + fibonacciJava7(i - 1);
                    cache.put(i, result);
                }
            }
        }
        return result;
    }

    /**
     * java7 ��黺���Ƿ����key��Ӧ��ֵ����������ڲŽ�����Ӧ�ļ��� ��������ͬ�����ƣ�
     * @param i
     * @return
     */
    private static int fibonacciJava7I(int i) {
        if (i == 0 || i == 1)
            return i;
        Integer result = cache.get(i);
        if (result == null) {
            result = fibonacciJava7(i - 2) + fibonacciJava7(i - 1);
            cache.put(i, result);
        }
        return result;
    }
}
