package sPoudel_project07;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigLatinTesting {

	@Test
	public void testsWordToPigLatin1() {
		String d = "pig";
		String result = PigLatin.wordToPigLatin(d);
		assertEquals(result, "igpay");
	}
	
	@Test
	public void testsWordToPigLatin2() {
		String d = "friends";
		String result = PigLatin.wordToPigLatin(d);
		assertEquals(result, "iendsfray");
	}
	
	@Test
	public void testsPigLatinToEnglishWordStartingWithVowel1() {
		String d = "eatway";
		String result = PigLatin.pigLatinToEnglishWordStartingWithVowel(d);
		assertEquals(result, "eat");
	}
	
	@Test
	public void testsPigLatinToEnglishWordStartingWithVowel2() {
		String d = "endsway";
		String result = PigLatin.pigLatinToEnglishWordStartingWithVowel(d);
		assertEquals(result, "ends");
	}
}