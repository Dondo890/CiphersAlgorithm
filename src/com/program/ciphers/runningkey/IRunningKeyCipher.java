package com.program.ciphers.runningkey;

import com.program.ciphers.CipherException;

public interface IRunningKeyCipher {

	public String runningKeyEncode(String phrase, String key) throws CipherException;
	
	public String runningKeyDecode(String phrase, String key) throws CipherException;
	
}
