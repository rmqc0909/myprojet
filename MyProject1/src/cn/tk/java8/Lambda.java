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
     * Lambda表达式之前，要新建一个线程，需要这样写
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
     * 有了lambda表达式之后的写法
     */
    private static void afterLambda() {
        new Thread(() -> System.out.println("Thread is running!")).start();
    }

    /**
     * lambda表达式的几种写法
     */
    private static void waysOfLambda() {
        Runnable runnable = () -> System.out.println("Hello World!");   //写法1
        Runnable mutilline = () -> {
            System.out.println("Hello");
            System.out.println("World");
        };  //写法2
        ActionListener listener = event -> System.out.println("button clicked");    //写法3
        BinaryOperator<Long> add = (Long x, Long y) -> x + y;   //写法4
        BinaryOperator<Long> addImplicit = (x, y) -> x + y;     //写法5
    }
}
