
package com.program;

import com.program.ciphers.CipherException;
import com.program.ciphers.GlobalMethod;
import com.program.ciphers.atbash.AtbashCipherImpl;
import com.program.ciphers.atbash.IAtbashCipher;
import com.program.ciphers.autokey.AutokeyCipherImpl;
import com.program.ciphers.autokey.IAutokeyCipher;
import com.program.ciphers.beaufort.BeaufortCipherImpl;
import com.program.ciphers.beaufort.IBeaufortCipher;
import com.program.ciphers.caesar.CaesarCipherImpl;
import com.program.ciphers.caesar.ICaesarCipher;
import com.program.ciphers.columnartransposition.ColumnarTranspositionCipherImpl;
import com.program.ciphers.columnartransposition.IColumnarTranspositionCipher;
import com.program.ciphers.foursquare.FourSquareCipherImpl;
import com.program.ciphers.foursquare.IFourSquareCipher;
import com.program.ciphers.polybiussquare.IPolybiusSquareCipher;
import com.program.ciphers.polybiussquare.PolybiusSquareCipherImpl;
import com.program.ciphers.railfence.IRailfenceCipher;
import com.program.ciphers.railfence.RailfenceCipherImpl;
import com.program.ciphers.rot13.IRot13Cipher;
import com.program.ciphers.rot13.Rot13CipherImpl;
import com.program.ciphers.runningkey.IRunningKeyCipher;
import com.program.ciphers.runningkey.RunningKeyCipherImpl;
import com.program.ciphers.simplesubstitution.ISimpleSubstitutionCipher;
import com.program.ciphers.simplesubstitution.SimpleSubstitutionCipherImpl;
import com.program.ciphers.vigenere.IVigenereCipher;
import com.program.ciphers.vigenere.VigenereCipherImpl;

public class ComputeTotalTime {
	
	public static void main(String[]args) throws CipherException{
		
		IAtbashCipher atbash = new AtbashCipherImpl();
		IRot13Cipher rot13 = new Rot13CipherImpl();
		ICaesarCipher caesar = new CaesarCipherImpl();
		IRailfenceCipher railfence = new RailfenceCipherImpl();
		IPolybiusSquareCipher polybiusSquare = new PolybiusSquareCipherImpl();
		ISimpleSubstitutionCipher simpleSubstitution = new SimpleSubstitutionCipherImpl();
		IColumnarTranspositionCipher columnarTransposition = new ColumnarTranspositionCipherImpl();
		IAutokeyCipher autokey = new AutokeyCipherImpl();
		IBeaufortCipher beaufort = new BeaufortCipherImpl();
		IRunningKeyCipher runningKey = new RunningKeyCipherImpl();
		IVigenereCipher vigenere = new VigenereCipherImpl();
		IFourSquareCipher fourSquare = new FourSquareCipherImpl();
		
	
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
		
		//Polybius square---------------------------------------------------------
		System.out.println("--------------Polybius Square---------------------");
		String key = GlobalMethod.randomizeAlphabet(GlobalMethod.polybiusAlphabet);
		System.out.println(polybiusSquare.polybiusSquareEncode("Hello World!", key, "ABCDE"));
		System.out.println(polybiusSquare.polybiusSquareDecode(polybiusSquare.polybiusSquareEncode("Hello World!", key, "ABCDE"), key, "ABCDE"));
		
		//Simple Substitution---------------------------------------------------------
		System.out.println("--------------Simple Substitution---------------------");
		key = GlobalMethod.randomizeAlphabet(GlobalMethod.alphabet);
		System.out.println(simpleSubstitution.simpleSubstitutionEncode("Hello World!", key));
		System.out.println(simpleSubstitution.simpleSubstitutionDecode(simpleSubstitution.simpleSubstitutionEncode("Hello World!", key), key));
		
		//Columnar Transposition---------------------------------------------------------
		System.out.println("-----------------Columnar transposition------------------------");
		System.out.println(columnarTransposition.columnarTranspositionEncode("Hello World", "german", 'x'));
		System.out.println(columnarTransposition.columnarTranspositionDecode("odeohwll xlr", "german", 'x'));
		
		//Autokey---------------------------------------------------------
		System.out.println("------------------------Autokey------------------------");
		System.out.println(autokey.autokeyEncode("Hello World!", "sample"));
		System.out.println(autokey.autokeyDecode("Zexaz Avvwo!", "sample"));
		
		//Beaufort---------------------------------------------------------
		System.out.println("------------------------Beaufort------------------------");
		System.out.println(beaufort.beaufortEncode("Hello World!", "sam"));
		System.out.println(beaufort.beaufortDecode("Lwbhm Qejbp!", "sam"));
		
		//Running key---------------------------------------------------------
		System.out.println("---------------------Running key------------------------");
		System.out.println(runningKey.runningKeyEncode("Hello World!", "Sample Key for Hello World"));
		System.out.println(runningKey.runningKeyDecode("Zexaz Ayvji!", "Sample Key for Hello World"));
		
		//Vigenere---------------------------------------------------------
		System.out.println("-----------------------Vigenere------------------------");
		System.out.println(vigenere.vigenereEncode("Hello World!", "troll"));
		System.out.println(vigenere.vigenereDecode("Avzwz Pffwo!", "troll"));
		
		//Four Square---------------------------------------------------------
		System.out.println("--------------------Four Square------------------------");
		String firstKey = GlobalMethod.randomizeAlphabet(GlobalMethod.polybiusAlphabet);
		String secondKey = GlobalMethod.randomizeAlphabet(GlobalMethod.polybiusAlphabet);
		System.out.println(firstKey);
		System.out.println(secondKey);
		System.out.println(fourSquare.fourSquareEncode("Hello Worlds", "tusaroldbpfewichynzmvgqxk", "ofmzvbwhlautkecrngxspqiyd", 'x'));
		System.out.println(fourSquare.fourSquareDecode("pmfueyexioni", "tusaroldbpfewichynzmvgqxk", "ofmzvbwhlautkecrngxspqiyd", 'x'));
	}
	
	
	
}
