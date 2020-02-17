package com.program.ciphers.caesar;

import com.program.ciphers.CipherException;

public interface ICaesarCipher {

	public String caesarEncode(String phrase, int shift) throws CipherException;
	
	public String caesarDecode(String phrase, int shift) throws CipherException;
	
}
