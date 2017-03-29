package boma.tool;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 implements Encrypt{

	@Override
	public String encrypt(String text) {
		//����MD5�㷨����MessageDigest����
		String salt = "sadf651dfg5sGH���Է����㲥Ůģ��"+ "��ˮ�ڡ�0����spdmgs'dfgl-]esorkgps'dmfb�Ƿ�������ܲ�����von0dier0t433938r7304532084-qeo[qrpwAC";
        try {
        	MessageDigest md5;
			md5 = MessageDigest.getInstance("MD5");
			byte[] srcBytes = (text+salt).getBytes("utf-8");
	        //ʹ��srcBytes����ժҪ  
	        md5.update(srcBytes);
	        //��ɹ�ϣ���㣬�õ�result  
	        byte[] resultBytes = md5.digest();
	        //ת����16������
	        return new BigInteger(1, resultBytes).toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}  
		return null;
	}

}
