package cn.tk.generic;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by xiedan11 on 2016/11/16.
 * 1.���е�Collection��������foreach�﷨������
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> collection = new HashSet<>();
        for (int i = 0; i < 10; i++)
            collection.add(i);
        for (Integer x:
             collection)
            System.out.print(x + " ");
    }
}
