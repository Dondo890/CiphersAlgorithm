package com.program.ciphers.autokey;

import com.program.ciphers.GlobalMethod;

public class AutokeyCipherImpl implements IAutokeyCipher{

	@Override
	public String autokeyEncode(String phrase, String key) {
		
		//Converty phrase to char array
		char[]wordArray = phrase.toCharArray();
		
		// Remove whitespaces from phrase
		String trimmedPhrase = phrase.replace(" ", "").toLowerCase();
		
		//Append key and trimmed phrase
		String keyPhrase = (key.toLowerCase() + trimmedPhrase); 
		keyPhrase = keyPhrase.substring(0, phrase.length());
		
		//Instantiate tableau
		char[][]tableau;
		
		// Encode phrase
		int keyPhraseCounter = 0;
		for(int i=0; i<wordArray.length; i++) {
			
			if(GlobalMethod.checkForUpperCase(phrase.charAt(i))) {
				
				tableau = GlobalMethod.upperCaseTableau();
				String alphabet = GlobalMethod.alphabet.toUpperCase();
				
				int row = alphabet.indexOf(wordArray[i]);
				int column = alphabet.indexOf(keyPhrase.toUpperCase().charAt(keyPhraseCounter++));
				
				wordArray[i] = tableau[row][column];
				
				
			}else if(GlobalMethod.checkForLowerCase(phrase.charAt(i))) {
				
				tableau = GlobalMethod.lowerCaseTableau();
				String alphabet = GlobalMethod.alphabet.toLowerCase();
				
				int row = alphabet.indexOf(wordArray[i]);
				int column = alphabet.indexOf(keyPhrase.charAt(keyPhraseCounter++));
				
				wordArray[i] = tableau[row][column];
				
			}else {
				continue;
			}
			
		}
		
		return new String(wordArray);
	}

	@Override
	public String autokeyDecode(String phrase, String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
