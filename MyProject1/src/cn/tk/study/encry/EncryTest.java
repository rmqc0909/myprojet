/**
 * 
 */
package cn.tk.study.encry;

import java.security.MessageDigest;


/**

 * @ClassName: EncryTest

 * @Description: TODO md5�㷨ѧϰ

 * @author xiedan11

 * @date 2016��7��8�� ����10:54:26

 * ѧϰ���䣺
	1.byte��8λ�����λ�Ƿ���λ��-50�Ĳ��룺11001101
	2.A��Ӧ��ASCIIΪ65��1��Ӧ��ASCII49

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
				str[(k++)] = hexDigits[(byte0 >>> 4 & 0xF)];	//����byte0����λ
				str[(k++)] = hexDigits[(byte0 & 0xF)];			//��������λ
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
