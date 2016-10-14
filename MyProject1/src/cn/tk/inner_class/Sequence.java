package cn.tk.inner_class;

/**
 * Created by xiedan11 on 2016/10/13.
 * �������������ģʽ����
 * 1.��static���ڲ��࣬���ⲿ����ص�ʱ�򣬲���������������������治���о�̬�������߾�̬������
 * 2.�ڲ�����Է�������Χ��ķ������ֶΡ��ڲ����Զ�ӵ�ж�����Χ�����г�Ա�ķ���Ȩ��
 */
interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    /**
     * �ڲ���
     */
    private class SequenceSelector implements Selector {
        int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length)
                i++;
        }
    }
    public Selector selector() {
        return new SequenceSelector ();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence (10);
        for (int i = 0; i < 10; i++)
            sequence.add (Integer.toString (i));
        Selector selector = sequence.selector ();
        while (!selector.end()) {
            System.out.print (selector.current () + "  ");
            selector.next ();
        }
    }
}
