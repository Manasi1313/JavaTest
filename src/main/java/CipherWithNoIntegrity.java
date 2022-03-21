package javacodechecker;

public class CipherWithNoIntegrity {
	public void md () {
		// EMB-ISSUE: CodeIssueNames.CIPHER_WITH_NO_INTEGRITY
    Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
	c.init(Cipher.ENCRYPT_MODE, k, iv);
	byte[] cipherText = c.doFinal(plainText);
	}
	public void mds () {
		// EMB-ISSUE: CodeIssueNames.CIPHER_WITH_NO_INTEGRITY/no-detect
		Cipher c = Cipher.getInstance("AES/GCM/NoPadding");
		c.init(Cipher.ENCRYPT_MODE, k, iv);
		byte[] cipherText = c.doFinal(plainText);
		}
}
