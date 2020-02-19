package com.program.ciphers.foursquare;

import com.program.ciphers.CipherException;
import com.program.ciphers.GlobalMethod;

public class FourSquareCipherImpl implements IFourSquareCipher{

	@Override
	public String fourSquareEncode(String phrase, String firstKey, String secondKey) throws CipherException {

		// Check if key contains special characters or numbers
		if(firstKey.matches("[\\d\\W_]") || secondKey.matches("[\\d\\W_]")) {
			throw new CipherException(CipherException.INVALID_KEY, new Throwable("Key should not contain numbers and special characters!"));
		}
		
		//Check if first key characters is unique
		for(int i=0; i<firstKey.length(); i++) {
			for(int j=0; j<firstKey.length(); j++) {
				if(j != i && firstKey.charAt(i) == firstKey.charAt(j)) {
					throw new CipherException(CipherException.INVALID_KEY, new Throwable("First key must consist of unique characters"));
				}
			}
		}
		
		//Check if second key characters is unique
		for(int i=0; i<secondKey.length(); i++) {
			for(int j=0; j<secondKey.length(); j++) {
				if(j != i && secondKey.charAt(i) == secondKey.charAt(j)) {
					throw new CipherException(CipherException.INVALID_KEY, new Throwable("Second key must consist of unique characters"));
				}
			}
		}
		
		//Check length of keys
		if(firstKey.length() > 25 || secondKey.length() > 25) {
			throw new CipherException(CipherException.INVALID_KEY, new Throwable("Key should consist of unique alphabet letters without \"J\"! "));
		}
		
		// Instantiate Alphabet, First and second key table
		char[][]alphabetTable = new char[5][5];
		char[][]firstKeyTable = new char[5][5];
		char[][]secondKeyTable = new char[5][5];
		
		// Get randomized alphabet Strings
		String polybiusAlphabet = GlobalMethod.polybiusAlphabet;
		
		//Plot values to the table
		int tableIndexCounter = 0;
		for(int i=0; i<alphabetTable.length; i++) {
			for(int j=0; j<alphabetTable.length; j++) {
				
				alphabetTable[i][j] = polybiusAlphabet.charAt(tableIndexCounter);
				firstKeyTable[i][j] = firstKey.charAt(tableIndexCounter);
				secondKeyTable[i][j] = secondKey.charAt(tableIndexCounter++);
				System.out.print(alphabetTable[i][j]);
			}
			System.out.println();
		}
		
		
		return null;
	}

	@Override
	public String fourSquareDecode(String phrase, String firstKey, String secondKey) throws CipherException {
		// TODO Auto-generated method stub
		return null;
	}

}
