package cn.tk.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiedan11 on 2016/11/16.
 * 1.�������߼��Ͽ��Կ��ɶ�����ͣ�ʵ���϶�����ͬ�Ļ������͡�
 * 2.ͨ��ʹ�÷��ͣ������ڱ����ڷ�ֹ���������͵Ķ�����õ������С�
 */
class Apple{}

class Orange{}

public class Test {
    public static void main(String[] args) {
        List<Apple> list1 = new ArrayList<Apple>();
        list1.add(new Apple());
        //list1.add(new Orange());  prevent from adding an Orange to apples
        List<Orange> list2 = new ArrayList<Orange>();
        System.out.println(list1.getClass() == list2.getClass());
    }
}
