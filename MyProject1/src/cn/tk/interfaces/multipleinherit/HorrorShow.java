package cn.tk.interfaces.multipleinherit;

/**
 * Created by xiedan11 on 2016/10/12.
 * ͨ���̳�����չ�ӿڣ�
 * 1.��Vmpire��ʹ�õ��﷨�������ڽӿڼ̳С�һ������£�ֻ���Խ�extends���ڵ�һ�࣬���ǿ������ö������ӿڡ�ֻ���ö��Ž��ӿ���һһ�ָ������ɡ�
 * 2.�ӿڿ���һ�μ̳ж���ӿڣ�������Ϊ�ӿڶ�û�з���ʵ�֣�������ڶ�̳����⡣
 *
 */
interface Monster {
    void menace();
}
interface DangerousMonster extends Monster {
    void destroy();
}
class DragonZilla implements DangerousMonster {
    @Override
    public void destroy() {
        System.out.println ("DragonZilla destroy()");
    }

    @Override
    public void menace() {
        System.out.println ("DragonZilla menace()");
    }
}
interface Lethal {
    void kill();
}
interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}
class VeryBadVampire implements Vampire {
    @Override
    public void drinkBlood() {
        System.out.println ("VeryBadVampire drinkBlood()");
    }

    @Override
    public void destroy() {
        System.out.println ("VeryBadVampire destroy()");
    }

    @Override
    public void kill() {
        System.out.println ("VeryBadVampire kill()");
    }

    @Override
    public void menace() {
        System.out.println ("VeryBadVampre menace()");
    }
}
public class HorrorShow {
    static void u(Monster monster) {
        monster.menace ();
    }
    static void v(DangerousMonster dangerousMonster) {
        dangerousMonster.menace ();
        dangerousMonster.destroy ();
    }
    static void w(Lethal lethal) {
        lethal.kill ();
    }
    static void x(Vampire vampire) {
        vampire.destroy ();
        vampire.kill ();
        vampire.menace ();
        vampire.drinkBlood ();
    }
    public static void main(String[] args) {
        DangerousMonster dangerousMonster = new DragonZilla ();
        u (dangerousMonster);
        v (dangerousMonster);
        Vampire vampire = new VeryBadVampire ();
        w (vampire);
        x (vampire);
    }
}
