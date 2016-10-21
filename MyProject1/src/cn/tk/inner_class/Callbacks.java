package cn.tk.inner_class;

/**
 * Created by xiedan11 on 2016/10/20.
 * 1.Callee1�Ǽ򵥵�ʵ��һ���ӿڡ�
 * 2.Callee2�̳�MyIncrement������Callee2��Χ����д��increment()������Callee2�ڲ���Closureʵ����Incrementable�ӿڵ�increment()����������Closure��increment()������������Χ���increment()����
 */
interface Incrementable {
    void increment();
}
class Callee1 implements Incrementable {
    private int i = 0;
    @Override
    public void increment() {
        i++;
        System.out.println (i);
    }
}
class MyIncrement {
    public void increment() {
        System.out.println ("Other operation");
    }
    static void f(MyIncrement myIncrement) {
        myIncrement.increment ();
    }
}

class Callee2 extends MyIncrement {
    private int i = 0;
    @Override
    public void increment() {
        super.increment ();
        i++;
        System.out.println (i);
    }
    private class Closure implements Incrementable {
        @Override
        public void increment() {
            Callee2.this.increment ();  //ͨ���ڲ���ȥ������Χ���increment()����
        }
    }
    Incrementable getCallbackReference() {
        return new Closure ();
    }
}

class Caller {
    private Incrementable callbackReference;

    public Caller(Incrementable callbackReference) {
        this.callbackReference = callbackReference;
    }
    void go() {
        callbackReference.increment ();
    }
}
public class Callbacks {
    public static void main(String[] args) {
        Callee1 callee1 = new Callee1 ();
        Callee2 callee2 = new Callee2 ();
        MyIncrement.f (callee2);
        Caller caller1 = new Caller (callee1);
        Caller caller2 = new Caller (callee2.getCallbackReference ());
        caller1.go ();
        caller1.go ();
        caller2.go ();      //�����ڲ��ࣨClosure����increment()�����������ڲ����increment()�������õ�������Χ���increment()������
        caller2.go ();
    }
}
