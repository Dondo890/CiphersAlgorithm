package com.program.ciphers.foursquare;

import com.program.ciphers.CipherException;

public interface IFourSquareCipher {
	
	public String fourSquareEncode(String phrase, String firstKey, String secondKey, char characterPad) throws CipherException;
	
	public String fourSquareDecode(String phrase, String firstKey, String secondKey, char characterPad) throws CipherException;
	
}
