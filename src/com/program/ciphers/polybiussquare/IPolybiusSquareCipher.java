package com.program.ciphers.polybiussquare;

import com.program.ciphers.CipherException;

public interface IPolybiusSquareCipher {
	
	public String polybiusSquareEncode(String phrase, String key, String cipherCharacter) throws CipherException;
	
	public String polybiusSquareDecode(String phrase, String key, String cipherCharacter) throws CipherException;

}
