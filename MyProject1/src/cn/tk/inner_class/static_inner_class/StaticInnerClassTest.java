package cn.tk.inner_class.static_inner_class;

/**
 * Created by xiedan11 on 2016/10/19.
 * 1.���ڲ��಻��Ҫ������Χ�����ʱ��Ӧ��ʹ�þ�̬�ڲ��ࡣ����ͨ���ڲ��������ʽ�ر�����һ�����ã�ָ�򴴽�������Χ�����
 * 2.ֻ���ڲ����������Ϊstatic����̬�ڲ���Ķ������û������������Χ������������Ȩ�⣬�����������ڲ�����ȫһ����
 * 3.���ڲ���������ھ�̬�����й���ģ������ʹ�þ�̬�ڲ��ࡣ
 *
 * 4.Ƕ���ࣨ��̬�ࣩ��ζ�ţ�
 * 1��Ҫ����Ƕ����Ķ��󣬲�����Ҫ����Χ��Ķ���
 * 2�����ܴ�Ƕ����Ķ����з��ʷǾ�̬����Χ�����
 *
 * 5.��ͨ�ڲ�����ֶκͷ�����ֻ�ܷ�������ⲿ����ϣ��ʶ���ͨ���ڲ��಻����static���ݺ�static�ֶΣ�Ҳ���ܰ���Ƕ���ࡣ����Ƕ������԰�����Щ������
 *
 */
class ArrayAlg {
    public static class Pair {
        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }
    public static Pair minmax(double[] values) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double x : values
             ) {
            if (min > x) min = x;
            if (max < x) max = x;
        }
        return new Pair (min, max);
    }
}
public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] doubles = new double[20];
        for (int i = 0; i < doubles.length; i++)
            doubles[i] = Math.random ();
        ArrayAlg.Pair pair = ArrayAlg.minmax (doubles);
        System.out.println ("min: " + pair.getFirst ());
        System.out.println ("max: " + pair.getSecond ());
    }
}
