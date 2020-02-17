package com.program.ciphers.atbash;

import com.program.ciphers.CipherException;

public interface IAtbashCipher {

	public String atbashEncode(String phrase) throws CipherException;
	
	public String atbashDecode(String phrase) throws CipherException;
	
}
