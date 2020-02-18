package com.program.ciphers.autokey;

import com.program.ciphers.CipherException;

public interface IAutokeyCipher {

	public String autokeyEncode(String phrase, String key) throws CipherException;
	
	public String autokeyDecode(String phrase, String key) throws CipherException;
	
}
