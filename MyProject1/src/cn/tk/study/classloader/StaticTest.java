/**
 * 
 */
package cn.tk.study.classloader;

/**

 * @ClassName: StaticTest

 * @Description: TODO ���Լ���˳��
 * ������������ǣ�����->��֤->׼��->����->��ʼ��->ʹ��->ж�أ�ֻ����׼���׶κͳ�ʼ���׶βŻ��漰������ĳ�ʼ���͸�ֵ��
 * 
 * 
 * ���׼���׶���Ҫ����Ϊ���������static���εı����������ڴ沢����Ĭ��ֵ����������stΪnull��cΪ0��
 * ��Ҫע���������������final������ʱjavac����Ϊvalue����ConstantValue���ԣ���׼���׶�������ͻ����ConstantValue�����ý���������Ϊָ����ֵ��
 * ���磺static final int b=112,��׼���׶�b��ֵ����112�� 
 * 
 * 
 * ��ĳ�ʼ���׶���Ҫ����ִ���๹�������๹�����Ǳ������ռ����о�̬�����������ĸ�ֵ��䰴�����Դ���е�˳��ϲ������๹������
 * ����Ĺ��췽����<init>()����Ĺ��췽����<clinit>()�������ڶ�ջ��Ϣ�п�������
 * �����ִ�е�һ����̬�����ĸ�ֵ��伴st = new StaticTest ()����ʱ����ж���ĳ�ʼ��������ĳ�ʼ�����ȳ�ʼ����Ա������ִ�й��췽��
 * 
 * ˳��Ϊ������aΪ110->��ӡ2->ִ�й��췽��(��ӡ3,��ʱa�Ѿ���ֵΪ110������cֻ��������Ĭ��ֵ0����δ��ɸ�ֵ������b��Ĭ��ֵ112��)
 * 
 * ���ǳ����ˡ�ʵ����ʼ����Ȼ�����ھ�̬��ʼ��֮ǰ��
 * 
 * 
 * 
 * 
 * 
 * �ܽ����£�����
 * 1.������ִ�д˶δ���ʱ��������main�����ĵ��ô�����̬��ʼ����
 * 2.�ڳ�ʼ��TestA ��ľ�̬����ʱ������st�����Ա��
 * 3.����������������õ��Ǳ����ʵ����
 * 4.��ʵ����st����ʱ��ʵ�����ǰ�ʵ����ʼ��Ƕ�뵽�˾�̬��ʼ�������У�����Ƕ�뵽�˾�̬��ʼ������ʼλ�á�
 * ��͵�����ʵ����ʼ����ȫ���ھ�̬��ʼ��֮ǰ����Ҳ�ǵ���a��ֵcûֵ��ԭ��

 * @author xiedan11

 * @date 2016��6��2�� ����2:18:21

 *


 */
public class StaticTest {

	static String i = "14";
	String j = "30";
	public static void main(String[] args)
    {
        staticFunction();
    }

    static StaticTest st = new StaticTest();

    static
    {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    StaticTest()
    {
        System.out.println("3");
        System.out.println("a="+a+",b="+b+",c="+c);
    }

    public static void staticFunction(){
        System.out.println("4");
    }
    int a=110;
    static final int b =112;
    static int c =115;
}
