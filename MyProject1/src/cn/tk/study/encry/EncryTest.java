/**
 * 
 */
package cn.tk.study.encry;

import java.security.MessageDigest;


/**

 * @ClassName: EncryTest

 * @Description: TODO md5算法学习

 * @author xiedan11

 * @date 2016年7月8日 上午10:54:26

 * 学习补充：
	1.byte是8位，最高位是符号位，-50的补码：11001101
	2.A对应的ASCII为65，1对应的ASCII49

 */
public class EncryTest {

	private static String key = "AAAABBBBCCCC";
	public static void main(String[] args) {
		char[] hexDigits =
		{ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		String func = "1";
		String content = "17710369610";
		StringBuffer bf = new StringBuffer();
		bf.append(func);
		bf.append(key);
		bf.append(content);
		String s = bf.toString();
		try 
		{
			byte[] strTemp = s.getBytes();
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char[] str = new char[j * 2];
			int k = 0;
			for(int i = 0;i<j;++i)
			{
				byte byte0 = md[i];
				str[(k++)] = hexDigits[(byte0 >>> 4 & 0xF)];	//保留byte0高四位
				str[(k++)] = hexDigits[(byte0 & 0xF)];			//保留低四位
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
