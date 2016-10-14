package cn.tk.inner_class;


/**
 * Created by xiedan11 on 2016/10/13.
 * 1.��ӵ���ⲿ�����֮ǰ�ǲ����ܴ����ڲ������
 */
public class Parcel3 {
    class Contents {
        private int i = 11;
        public int value() { return i; }
    }
    class Destination {
        private String label;

        public Destination(String label) {
            this.label = label;
            System.out.println ("Destination label : " + label);
        }
        String readLabel() { return label; }
    }
    public static void main(String[] args) {
        Parcel3 p = new Parcel3 ();                 //�ȴ����ⲿ��
        Parcel3.Contents c = p.new Contents ();     //�����ڲ���
        Parcel3.Destination d = p.new Destination ("Tasmania");
    }
}
