package boma.tool;

import org.junit.Test;

public class MD5Test {

	@Test
	public void testEncrypt() {
		String msg = "dfgafgsfg[]sgf[] slg[opskdofg";  
        MD5 md5 = new MD5();  
        String md5msg = md5.encrypt(msg);
        System.out.println("�����ǣ�" + md5msg);  
        System.out.println("�����ǣ�" + msg); 
	}
}
