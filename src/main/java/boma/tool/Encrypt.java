package boma.tool;

public interface Encrypt {
	public String encrypt(String text);
	public default String decrypt(String text){
		return "";
	}
}
