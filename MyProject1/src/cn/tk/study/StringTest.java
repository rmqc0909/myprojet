/**
 * 
 */
package cn.tk.study;


/**

 * @ClassName: stringobject

 * @Description: TODO

 * @author xiedan11

 * @date 2016年7月15日 上午11:14:23

 *


 */


public class StringTest {
	
private String init = "哈哈哈哈哈";
private String init1;
public StringTest(String init) {
	this.init1 = init;
	}

/**
 * 
 */
public StringTest() {
	// TODO Auto-generated constructor stub
}

public static void main(String[] args) {
	StringTest stringTest = new StringTest("嘿嘿嘿");
	System.out.println("哈哈哈哈::" + stringTest.init); 
	System.out.println("哈哈哈哈::" + stringTest.init1); 
}

}
