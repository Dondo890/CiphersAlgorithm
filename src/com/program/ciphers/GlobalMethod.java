package com.program.ciphers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GlobalMethod {
	
	public static final String polybiusAlphabet = "abcdefghiklmnopqrstuvwxyz";
	public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
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
