package com.program.ciphers.vigenere;

import com.program.ciphers.CipherException;

public interface IVigenereCipher {

	public String vigenereEncode(String phrase, String key) throws CipherException;
	
	public String vigenereDecode(String phrase, String key) throws CipherException;
	
}
