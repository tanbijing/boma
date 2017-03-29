package boma.tool;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 implements Encrypt{

	@Override
	public String encrypt(String text) {
		//根据MD5算法生成MessageDigest对象
		String salt = "sadf651dfg5sGH】对方开广播女模【"+ "排水口【0个【spdmgs'dfgl-]esorkgps'dmfb是否更不能跑步服你von0dier0t433938r7304532084-qeo[qrpwAC";
        try {
        	MessageDigest md5;
			md5 = MessageDigest.getInstance("MD5");
			byte[] srcBytes = (text+salt).getBytes("utf-8");
	        //使用srcBytes更新摘要  
	        md5.update(srcBytes);
	        //完成哈希计算，得到result  
	        byte[] resultBytes = md5.digest();
	        //转换成16进制数
	        return new BigInteger(1, resultBytes).toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}  
		return null;
	}

}
