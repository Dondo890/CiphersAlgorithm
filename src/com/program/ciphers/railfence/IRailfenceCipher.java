package com.program.ciphers.railfence;

import com.program.ciphers.CipherException;

public interface IRailfenceCipher {
	
	public String railfenceEncode(String phrase, int key) throws CipherException;
	
	public String railfenceDecode(String phrase, int key) throws CipherException;
	
}
