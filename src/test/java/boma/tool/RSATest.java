package boma.tool;

import org.junit.Test;

public class RSATest {

	@Test
	public void testEncrypt() {
		String msg = "retrtr";  
		RSA rsa = new RSA();  
        String md5msg = rsa.encrypt(msg);
        System.out.println("�����ǣ�" + md5msg);
        String md5msg2 = rsa.decrypt(md5msg);
        System.out.println("�����ǣ�" + md5msg2);
	}

}
