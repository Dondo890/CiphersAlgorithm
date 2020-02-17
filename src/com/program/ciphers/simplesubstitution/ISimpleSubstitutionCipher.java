package com.program.ciphers.simplesubstitution;

import com.program.ciphers.CipherException;

public interface ISimpleSubstitutionCipher {
	
	public String simpleSubstitutionEncode(String phrase, String key) throws CipherException;
	
	public String simpleSubstitutionDecode(String phrase, String key) throws CipherException;
	
}
