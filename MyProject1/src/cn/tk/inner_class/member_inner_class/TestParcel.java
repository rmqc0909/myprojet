package cn.tk.inner_class.member_inner_class;

/**
 * Created by xiedan11 on 2016/10/13.
 * ��Ա�ڲ���:
 * 1.�ڲ�����Կ������ⲿ���һ����Ա����������Ժͷ������ƣ���
 * ��PDestination��PContents���Կ�����Parcel4��һ����Ա��
 * 2.PContents��private�����Գ���Parcel4�������������Է���PContents
 * PDestination��protected��ֻ��Parcel4�������࣬������Parcel4ͬһ�����е����ܷ���PDestination,�����඼���ܷ���PDestination.
 * 3. �ⲿ����Է������ڲ����privateԪ�ء�
 * 4.ֻ���ڲ��������˽���࣬��������ֻ���Ծ��а��ɼ��ԣ����пɼ��ԡ�
 *
 */
class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    protected class PDestination implements Destination {
        private String label;
        private PDestination(String label) {
            this.label = label;
            System.out.println ("PDestination constructors " + label);
        }
        @Override
        public String readLabel() {
            return label;
        }
    }
    public Destination destination(String s) {
        return new PDestination (s);
    }
    public Contents contents() {
        return new PContents ();
    }
    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4 ();
        PContents pContents = parcel4.new PContents ();
        System.out.println ("Outer class can access inner class's private element: " + (pContents.i == 11));

    }
}
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4 ();
        Contents contents = parcel4.contents ();
        Destination destination = parcel4.destination ("Tasmania");
        //!Parcel4.PDestination pDestination = parcel4.new PDestination ("test");   PDestination ���캯����private��������new����������
        //!Parcel4.PContents pContents = parcel4.new PContents();   ���ܷ��� private class.
    }
}
