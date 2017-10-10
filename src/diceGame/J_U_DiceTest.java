package diceGame;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class J_U_DiceTest {
	TestDice td;
	@Before
	public void setUp() throws Exception {
		td = new TestDice();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[]c= td.roll_and_count();
		int numbrolls=60000;
		int expect =numbrolls/6;
		for(int i=0;i<6;i++) {
			int diff = c[i] - expect;
			boolean expected = true;
			boolean actual = (Math.abs(diff)<400);
			assertEquals(expected, actual);
		}
	}

}
