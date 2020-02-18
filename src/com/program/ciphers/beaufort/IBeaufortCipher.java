package com.program.ciphers.beaufort;

import com.program.ciphers.CipherException;

public interface IBeaufortCipher {
	
	public String beaufortEncode(String phrase, String key) throws CipherException;
	
	public String beaufortDecode(String phrase, String key) throws CipherException;

}
