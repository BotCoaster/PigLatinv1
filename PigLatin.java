package sPoudel_project07;
//Sujan Poudel
//10/21/22
//Period 1 ADSA
//Pig Latin Lab (v1)
//Purpose: Utilize methods, boolean expressions, and string methods 
// in order to create a pig latin converter. 

class PigLatin {
	public static String[] vowels = {"a", "e", "i", "o", "u"};
	
	// Parameters: s, Type: String, represents a character of a string
	// Return type: boolean
	// Description: Returns whether or not String s is a vowel (a,e,i,o,u)
	public static boolean isVowel(String s) {
	 for (int i = 0; i < vowels.length; i++) {
	   if (s.toLowerCase().equals(vowels[i])) {
	     return true;
	   }
	 }
	 return false;
	}
	
	// Parameters: word, Type: String, represents an arbitrary word
	// Return type: int
	// Description: Returns the index of the first vowel (a,e,i,o,u) in a word 
	public static int findFirstVowelChar(String word){
	 int vowelCharacter = 0;
	 for (int i = 0; i < word.length(); i++) {
	   if (isVowel(word.substring(i, i + 1))) {
	     vowelCharacter = i;
	     break;
	   }
	 }
	 return vowelCharacter;
	}
	
	// Parameters: word, Type: String, represents an arbitrary word
	// Return type: String
	// Description: Converts the given word into its pig word equivalent
	public static String wordToPigLatin(String word){
	 if (word == "no") {
	   return "ixnay";
	 }
	 else if (isVowel(word.substring(0, 1))) {
	   return word + "way";
	 }
	 else {
	   int vowelCharacter = findFirstVowelChar(word);
	   return word.substring(vowelCharacter, word.length()) + word.substring(0, vowelCharacter) + "ay";  
	 }
	}
	
	// Parameters: plWord, Type: String, represents an arbitrary pig latin word
	// Return type: String
	// Description: Converts the given pig latin word into its English equivalent (English equivalent must 
	// start with vowel)
	public static String pigLatinToEnglishWordStartingWithVowel(String pLWord) {
	 return pLWord.substring(0, pLWord.length() - 3);
	}
	
	// Paramters: args, Type: String[], stores command-line arguments in Java
	// Return type: void
	// Description: main method to do simple test for two cases (SEPARATE to the real test case file) 
	public static void main(String[] args) {
	 System.out.println(wordToPigLatin("System"));
	 System.out.println(pigLatinToEnglishWordStartingWithVowel("areway"));
	}
}
