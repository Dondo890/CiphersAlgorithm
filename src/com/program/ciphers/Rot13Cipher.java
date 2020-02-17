package com.program.ciphers;

public class Rot13Cipher {
	
	public String rot13Encode(String phrase) {
		
		char[]wordArray = phrase.toCharArray();
		
		for(int i=0; i<wordArray.length; i++) {
			
			if(wordArray[i] > 64 && wordArray[i] < 91) {
				
				if(wordArray[i] > 64 && wordArray[i] < 78) {
					
					wordArray[i] = (char)(wordArray[i] + 13);
					
				}else {
					
					wordArray[i] = (char)(wordArray[i] - 13);
					
				}
			}else if(wordArray[i] > 96 && wordArray[i] < 123) {
				
				if(wordArray[i] > 96 && wordArray[i] < 110) {
					
					wordArray[i] = (char)(wordArray[i] + 13);
					
				}else {
					
					wordArray[i] = (char)(wordArray[i] - 13);
					
				}
			}else {
				
				continue;
				
			}
		}
		
		return new String(wordArray);
	}
	
	public String rot13Decode(String phrase) {
		
		char[]wordArray = phrase.toCharArray();
		
		for(int i=0; i<wordArray.length; i++) {
			
			if(wordArray[i] > 64 && wordArray[i] < 91) {
				
				if(wordArray[i] > 64 && wordArray[i] < 78) {
					
					wordArray[i] = (char)(wordArray[i] + 13);
					
				}else {
					
					wordArray[i] = (char)(wordArray[i] - 13);
					
				}
			}else if(wordArray[i] > 96 && wordArray[i] < 123) {
				
				if(wordArray[i] > 96 && wordArray[i] < 110) {
					
					wordArray[i] = (char)(wordArray[i] + 13);
					
				}else {
					
					wordArray[i] = (char)(wordArray[i] - 13);
					
				}
			}else {
				
				continue;
				
			}
		}
		
		return new String(wordArray);
	}
	
}
