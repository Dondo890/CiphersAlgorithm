package com.program.ciphers;

public class AtbashCipher {
	
	public String atbashEncode(String phrase) {
		
		char[]wordArray = phrase.toCharArray();
		
		for(int i=0; i<wordArray.length; i++) {
			
			if(wordArray[i] > 64 && wordArray[i] < 91) {
				
				int charCount = (char) (((char)wordArray[i] + 25) - 90);
				
				if(charCount > 1) {
					wordArray[i] = (char) ((char)90 - charCount);
				}else {
					wordArray[i] = 90;
				}
				
				
			}else if(wordArray[i] > 96 && wordArray[i] < 123) {
				
				int charCount = (char) (((char)wordArray[i] + 25) - 122);
				
				if(charCount > 1) {
					wordArray[i] = (char) ((char)122 - charCount);
				}else {
					wordArray[i] = 122;
				}
				
			}else {
				continue;
			}
			
		}
		
		return new String(wordArray);
		
		
	}
	
	public String atbashDecode(String phrase) {
		
		char[]wordArray = phrase.toCharArray();
		
		for(int i=0; i<wordArray.length; i++) {
			
			if(wordArray[i] > 64 && wordArray[i] < 91) {
				
				int charCount = (char) (((char)wordArray[i] + 25) - 90);
				
				if(charCount > 1) {
					wordArray[i] = (char) ((char)90 - charCount);
				}else {
					wordArray[i] = 90;
				}
				
				
			}else if(wordArray[i] > 96 && wordArray[i] < 123) {
				
				int charCount = (char) (((char)wordArray[i] + 25) - 122);
				
				if(charCount > 1) {
					wordArray[i] = (char) ((char)122 - charCount);
				}else {
					wordArray[i] = 122;
				}
				
			}else {
				continue;
			}
			
		}
		
		return new String(wordArray);
		
	}
	
}
