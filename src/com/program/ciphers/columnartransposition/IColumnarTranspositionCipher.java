package com.program.ciphers.columnartransposition;

import com.program.ciphers.CipherException;

public interface IColumnarTranspositionCipher {
	
	public String columnarTranspositionEncode(String phrase, String key, char characterPad) throws CipherException;
	
	public String columnarTranspositionDecode(String phrase, String key, char characterPad) throws CipherException;

}
