package cn.tk.polymiorphism.override;

/**
 * Created by xiedan11 on 2016/10/11.
 * 1.����Ҫ������б���ͬ����g()�����и�����������α��붼����Object,�����β�һ�������Ǹ��ǣ��ǵ�������·�����
 * 2.�������еĸ��Ƿ�������Ҫ�ͻ����еı����ǵķ�������ͬ�ĺ������Ͳ�����
 * 3.�������еĸ��Ƿ����ķ���ֵ����ͻ����еķ���ֵһ�������ǻ��෵��ֵ����Object���������෵��ֵ�������������ͣ������඼�Ǽ̳���Object������g()������
 * 4.�������еĸ��Ƿ��������׳����쳣����ͻ������׳����쳣һ����
 *
 */
class Super {
    public int f() { return 2;}
    public Object g(Object string) {
        System.out.println ("Super g()!");
        return 3;
    }
}
public class SubClass extends Super {
    //!public float f() {return 2f;}   ����ʱ�ᱨ����Ϊ������һ������ֵΪint��f()���������������Ƿ���ֵΪfloat��f()������������ֵ����ȷ��
    @Override
    public Integer g(Object string) {   //IntegerҲ��һ��Object��
        System.out.println ("SubClass g()!");
        return 34;
    }
    public static void main(String[] args) {
        Super x = new SubClass ();
        Object y = x.g ("2");
        System.out.println ("the value of y :" + y);
    }
}
