package epam.task.tdd_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove_A_First2CharsTest {
	
	/*TODO list for my feature
	 * 1. First char: ABCD => BCD 
	 * 2. First 2 chars: AACD => CD
	 * 3. Second char: BACD => BCD
	 * 4. 'A' not at first 2 chars: BBAA => BBAA
	 * 5. 'A' at first 2 chars as well as remaining chars: AABAA => BAA 
	 * 6. Empty char : "" => ""
	 * 7. Single char : A => ""
	 */

	Remove_A_First2Chars removeAFirst2Chars;
	
	@BeforeEach
	void setUp() {
		removeAFirst2Chars = new Remove_A_First2Chars();
	}
	@Test
	public void testFirstChar() {
		assertEquals("BCD",removeAFirst2Chars.removeA("ABCD"));
	}
    @Test
	public void testFirst2Chars() {
		assertEquals("CD",removeAFirst2Chars.removeA("AACD"));
	}
    @Test
	public void testSecondChar() {
		assertEquals("BCD",removeAFirst2Chars.removeA("BACD"));
	}
    @Test
	public void testNoAatFirst2Chars() {
		assertEquals("BBAA",removeAFirst2Chars.removeA("BBAA"));
	}
    @Test
	public void testAatDifferentPositions() {
		assertEquals("BAA",removeAFirst2Chars.removeA("AABAA"));
	}
    @Test
	public void testEmptyChar() {
		assertEquals("",removeAFirst2Chars.removeA(""));
	}
    @Test
	public void testSingleChar1() {
		assertEquals("B",removeAFirst2Chars.removeA("B"));
	}
    @Test
	public void testSingleChar2() {
		assertEquals("",removeAFirst2Chars.removeA("A"));
	}
}
