package cn.tk.reuse_clazz;

/**
 * Created by xiedan11 on 2016/10/13.
 * 1.������û���ṩ�޲����Ĺ��캯��ʱ������Ĺ��캯��������ʽ�ص��ø���Ĺ��캯����
 * 2.�������ṩ���޲����Ĺ��캯��ʱ����ʱ����Ĺ��캯���Ϳ��Բ���ʽ���ø���Ĺ��캯��������������±�������Ĭ�ϵ��ø����ṩ���޲����Ĺ��캯����
 * ����в����Ĺ��캯���ڲ���ʽ�ĵ��ø��๹�캯��ʱĬ�ϵ��õ����޲����Ĺ��캯����
 *
 */
class Base2 {
    private int i;
    private int j;

    public Base2(int i, int j) {
        System.out.println ("Base2 i, j constructor");
        this.i = i;
        this.j = j;
    }

    public Base2() {
        System.out.println ("Base2 constructor");
    }

    public Base2(int i) {
        System.out.println ("Base2 i constructor");
        this.i = i;
    }
}
public class Constructors extends Base2{
    public Constructors() {
    }

    public Constructors(int i, int j) {
        //super (i, j);
    }

    public Constructors(int i) {
        super (i);
    }
    public static void main(String[] args) {
        new Constructors ();
        new Constructors (2);
        new Constructors (2, 3);
    }
}
