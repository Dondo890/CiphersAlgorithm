
package com.program;

import com.program.ciphers.CipherException;
import com.program.ciphers.GlobalMethod;
import com.program.ciphers.atbash.AtbashCipherImpl;
import com.program.ciphers.atbash.IAtbashCipher;
import com.program.ciphers.caesar.CaesarCipherImpl;
import com.program.ciphers.caesar.ICaesarCipher;
import com.program.ciphers.columnartransposition.ColumnarTranspositionCipherImpl;
import com.program.ciphers.columnartransposition.IColumnarTranspositionCipher;
import com.program.ciphers.polybiussquare.IPolybiusSquareCipher;
import com.program.ciphers.polybiussquare.PolybiusSquareCipherImpl;
import com.program.ciphers.railfence.IRailfenceCipher;
import com.program.ciphers.railfence.RailfenceCipherImpl;
import com.program.ciphers.rot13.IRot13Cipher;
import com.program.ciphers.rot13.Rot13CipherImpl;
import com.program.ciphers.simplesubstitution.ISimpleSubstitutionCipher;
import com.program.ciphers.simplesubstitution.SimpleSubstitutionCipherImpl;

public class ComputeTotalTime {
	
	public static void main(String[]args) throws CipherException{
		
		IAtbashCipher atbash = new AtbashCipherImpl();
		IRot13Cipher rot13 = new Rot13CipherImpl();
		ICaesarCipher caesar = new CaesarCipherImpl();
		IRailfenceCipher railfence = new RailfenceCipherImpl();
		IPolybiusSquareCipher polybiusSquare = new PolybiusSquareCipherImpl();
		ISimpleSubstitutionCipher simpleSubstitution = new SimpleSubstitutionCipherImpl();
		IColumnarTranspositionCipher columnarTransposition = new ColumnarTranspositionCipherImpl();
		
	
		//Atbash----------------------------------------------------------
		System.out.println("-----------------Atbash-----------------------");
		System.out.println(atbash.atbashEncode("Hello World!"));
		System.out.println(atbash.atbashDecode("Svool Dliow!"));
		
		//Rot13------------------------------------------------------------
		System.out.println("-----------------Rot13------------------------");
		System.out.println(rot13.rot13Encode("Hello World!"));
		System.out.println(rot13.rot13Decode("Uryyb Jbeyq!"));
		
		//Caesar------------------------------------------------------------
		System.out.println("-----------------Caesar------------------------");
		System.out.println(caesar.caesarEncode("Hello World!", 3));
		System.out.println(caesar.caesarDecode("Khoor Zruog!", 3));
		
		//Railfence---------------------------------------------------------
		System.out.println("-----------------Railfence------------------------");
		System.out.println(railfence.railfenceEncode("Hello World!", 3));
		System.out.println(railfence.railfenceDecode("Horel ol!lWd", 3));
		
		//Railfence---------------------------------------------------------
		System.out.println("--------------Polybius Square---------------------");
		String key = GlobalMethod.randomizeAlphabet(GlobalMethod.polybiusAlphabet);
		System.out.println(polybiusSquare.polybiusSquareEncode("Hello World!", key, "ABCDE"));
		System.out.println(polybiusSquare.polybiusSquareDecode(polybiusSquare.polybiusSquareEncode("Hello World!", key, "ABCDE"), key, "ABCDE"));
		
		//Railfence---------------------------------------------------------
		System.out.println("--------------Simple Substitution---------------------");
		key = GlobalMethod.randomizeAlphabet(GlobalMethod.alphabet);
		System.out.println(simpleSubstitution.simpleSubstitutionEncode("Hello World!", key));
		System.out.println(simpleSubstitution.simpleSubstitutionDecode(simpleSubstitution.simpleSubstitutionEncode("Hello World!", key), key));
		
		//Railfence---------------------------------------------------------
		System.out.println("-----------------Columnar transposition------------------------");
		System.out.println(columnarTransposition.columnarTranspositionEncode("HelloWorld", "german", 'x'));
		System.out.println(columnarTransposition.columnarTranspositionDecode("oxerholdwxll", "german", 'x'));
		
	}
	
	
	
}
