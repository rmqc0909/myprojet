package cn.tk.interfaces;

/**
 * Created by xiedan11 on 2016/10/10.
 * 1.�������󷽷�������������ࡣ���һ�������һ���������󷽷���������뱻�޶�Ϊ����ġ�
 * 2.�����һ��������̳У����봴��������Ķ��������Ϊ�����е����г��󷽷��ṩ�������塣
 * ���������������Բ���ô�������򵼳���Ҳ�ǳ����࣬�ұ�����ǿ��Ҫ��ʹ��abstract�ؼ������޶�����ࡣ
 */
abstract class Base {
    abstract void g();
    abstract void k();
}

class More extends Base {
    public void f() {
        System.out.println ("More f()");
    }

    @Override
    void g() {
        System.out.println ("More g()");
    }

    @Override
    void k() {

    }
}
public class AbstractTest {
    public static void main(String[] args) {
        Base x = new More ();
        x.g ();
        ((More)x).f ();
    }
}
