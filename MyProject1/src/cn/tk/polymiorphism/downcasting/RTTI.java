package cn.tk.polymiorphism.downcasting;

/**
 * Created by xiedan11 on 2016/10/10.
 */
class Useful {
    public void f() {}
    public void g() {}
}
class MoreUseful extends Useful {
    @Override
    public void f() {
    }
    @Override
    public void g() {
    }

    public void u() {

    }
    public void v() {

    }
}

/**
 * 1. ������������������Userful�࣬�ʶ����Ե���f()��g()����������������ͼ����u()��������ֻ������MoreUseful�����ͻ��ڱ���ʱ����
 * 2. ��Ҫ����MoreUseful�������չ�ӿڣ��Ϳ��Գ�������ת�ͣ������ת��������ȷ�����ͣ���ת�ͳɹ������򣬷���ClassCastException�쳣��
 */
public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful (),
                new MoreUseful ()
        };
        x[0].f ();
        x[1].g ();
        // !x[1].u();
        ((MoreUseful)x[1]).u ();     //Downcast/RTTI
        ((MoreUseful)x[0]).u ();     //Exception thrown
    }
}
