package cn.tk.string;

import java.util.Random;

/**
 * Created by xiedan11 on 2016/10/10.
 * 1.��Ϊһ�����дtoString()����ʱ������ַ��������Ƚϼ򵥣������������������������������յ��ַ��������
 * ���Ҫ��toString()������ʹ��ѭ������ô����Լ�����һ��StringBuilder�������Թ������յĽ�������£�
 * 2.StringBuffer���̰߳�ȫ�ģ���˿���Ҳ���Щ��
 */
public class UsingStringBuilder {
    private static Random random = new Random (47);

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder ("[");
        for (int i = 0; i < 25; i++) {
            result.append (random.nextInt (100));
            result.append (", ");
        }
        result.delete (result.length () - 2, result.length ());
        result.append ("]");
        return result.toString ();
    }
    public static void main(String[] args){
        UsingStringBuilder usb = new UsingStringBuilder ();
        System.out.println (usb);
    }
}
