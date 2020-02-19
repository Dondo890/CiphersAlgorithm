package com.program.ciphers.adfgx;

import com.program.ciphers.CipherException;

public interface IAdfgxCipher {

	public String adfgxEncode(String phrase, String key, String alphabetTable) throws CipherException;
	
	public String adfgxDecode(String phrase, String key, String alphabetTable) throws CipherException;
	
}
