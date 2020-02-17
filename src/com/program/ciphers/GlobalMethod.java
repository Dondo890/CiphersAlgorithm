package com.program.ciphers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GlobalMethod {
	
	public static final String polybiusAlphabet = "abcdefghiklmnopqrstuvwxyz";
	public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	public static char[][] lowerCaseTableau(){
		char[][]tableau = new char[26][26];
		
		//Create 26x26 table
		int minChar = 97;
		int charCounter = 97;
		for(int i=0; i<26; i++) {
			for (int j=0; j<26; j++) {
				
				if(charCounter > 122) {
					charCounter = 97;
				}
				
				tableau[i][j] = (char) charCounter++;
			}
			minChar++;
			charCounter = minChar;
		}
		
		return tableau;
	}
	
	public static char[][] upperCaseTableau(){
		
		char[][]tableau = new char[26][26];
		
		//Create 26x26 table
		int minChar = 65;
		int charCounter = 65;
		for(int i=0; i<26; i++) {
			for (int j=0; j<26; j++) {
				
				if(charCounter > 90) {
					charCounter = 65;
				}
				
				tableau[i][j] = (char) charCounter++;
			}
			minChar++;
			charCounter = minChar;
		}
		
		return tableau;
	}
	
	public static String randomizeAlphabet(String alphabet){
		
		List<Character>tempListHolder = new ArrayList<Character>();
		
		for(int i=0; i<alphabet.length(); i++) {
			tempListHolder.add(alphabet.charAt(i));
		}
		
		Collections.shuffle(tempListHolder);
		
		char[]characterArray = new char[alphabet.length()];
		
		for(int i=0; i<characterArray.length; i++) {
			characterArray[i] = tempListHolder.get(i);
		}
		
		return new String(characterArray);
		
	}
	
	public static boolean checkForUpperCase(char character) {
		
		boolean checkFlag = false;
		
		if(character > 64 && character < 91) {
			checkFlag = true;
		}
		
		return checkFlag;
		
	}
	
	public static boolean checkForLowerCase(char character) {
		
		boolean checkFlag = false;
		
		if(character > 96 && character < 123) {
			checkFlag = true;
		}
		
		return checkFlag;
	}

}
