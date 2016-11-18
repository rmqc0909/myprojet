package cn.tk.java8;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * Created by xiedan11 on 2016/11/18.
 */
public class Lambda {
    public static void main(String[] args) {
        beforeLambda();
    }

    /**
     * Lambda���ʽ֮ǰ��Ҫ�½�һ���̣߳���Ҫ����д
     */
    private static void beforeLambda() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running!");
            }
        }).start();
    }

    /**
     * ����lambda���ʽ֮���д��
     */
    private static void afterLambda() {
        new Thread(() -> System.out.println("Thread is running!")).start();
    }

    /**
     * lambda���ʽ�ļ���д��
     */
    private static void waysOfLambda() {
        Runnable runnable = () -> System.out.println("Hello World!");   //д��1
        Runnable mutilline = () -> {
            System.out.println("Hello");
            System.out.println("World");
        };  //д��2
        ActionListener listener = event -> System.out.println("button clicked");    //д��3
        BinaryOperator<Long> add = (Long x, Long y) -> x + y;   //д��4
        BinaryOperator<Long> addImplicit = (x, y) -> x + y;     //д��5
    }
}
