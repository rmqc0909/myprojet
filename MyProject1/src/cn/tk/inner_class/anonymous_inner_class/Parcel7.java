package cn.tk.inner_class.anonymous_inner_class;

import cn.tk.inner_class.member_inner_class.Contents;

/**
 * Created by xiedan11 on 2016/10/14.
 * �����ڲ���:
 * 1.contents����������ֵ���������ʾ�������ֵ����Ķ�������һ��
 * 2.�ڸ��ڲ����У�ʹ����Ĭ�ϵĹ�����������Contents��
 * 3.���ֲ��ڲ����ʹ��������һ��������ֻ���������һ�����󣬾Ͳ���������������ͱ���Ϊ�����ڲ��ࡣ
 * 4.���ڹ����������ֱ�����������ͬ����������û�����������ԣ������಻���й�������
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents (){
            private int i = 11;
            public int value() { return i; }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7 ();
        parcel7.contents ();
    }
}
