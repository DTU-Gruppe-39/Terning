package diceGame;

import static org.junit.Assert.*;  

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceTest1_6 {

	Dice DiceTest;
	
	@Before
	public void setUp() throws Exception {
		DiceTest = new Dice();
	}

	@After
	public void tearDown() throws Exception {
	}

	// Her tester vi om terningen har en værdi mellem 1 til 6
	@Test
	public void testGetRoll() {
		boolean expected = true ;
		int result = DiceTest.roll();
		boolean actual = result <= 6 && result >= 1;
		assertEquals (expected, actual);
	}
}
// Vi forventer at det giver os positiv respons