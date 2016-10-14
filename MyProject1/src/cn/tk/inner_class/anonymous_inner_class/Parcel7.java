package cn.tk.inner_class.anonymous_inner_class;

import cn.tk.inner_class.member_inner_class.Contents;

/**
 * Created by xiedan11 on 2016/10/14.
 * 匿名内部类:
 * 1.contents方法将返回值的生成与表示这个返回值的类的定义结合在一起。
 * 2.在该内部类中，使用了默认的构造器来生成Contents。
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents (){
            private int i = 11;
            public int value() { return i; }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7 ();
        parcel7.contents ();
    }
}
