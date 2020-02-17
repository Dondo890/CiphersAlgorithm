package com.program.ciphers.autokey;

public interface IAutokeyCipher {

	public String autokeyEncode(String phrase, String key);
	
	public String autokeyDecode(String phrase, String key);
	
}
