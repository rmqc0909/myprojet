package cn.tk.inner_class.local_inner_class;

import cn.tk.inner_class.member_inner_class.Destination;

/**
 * Created by xiedan11 on 2016/10/14.
 * 1.�ֲ��ڲ��ࣺ�����ڷ���������ࡣ
 * 2.PDestination����destination()������һ���֣�������Parcel5��һ���֡���destination()֮�ⲻ�ܷ���PDestination��
 * 3.�ֲ��಻����public��private����˵�������������������������޶�����������ֲ���Ŀ��С�
 * 4.�ֲ���ķ���ֻ�������ö���Ϊfinal�ľֲ�������
 */
public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination {
            private String label;
            private PDestination(String label) {
                this.label = label;
                System.out.println ("Destination method's inner class: " + label);
            }
            @Override
            public String readLabel() {
                return label;
            }
        }
        Destination destination1 = new PDestination("dd test!!!");      //��destination�����п���ֱ��new�������PDestination��
        return new PDestination (s);
    }
    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5 ();
        Destination destination = parcel5.destination ("Tasmania");
        //!Destination destination1 = parcel5.new PDestination("dd");
    }
}
