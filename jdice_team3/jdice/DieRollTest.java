package jdice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DieRollTest {

	private DieRoll createTestSubject() {
		return new DieRoll(0, 0, 0);
	}
	
	@Test
	public void testMakeRoll() throws Exception {
		DieRoll testDieRoll;
		RollResult result;
		
		//default test
		testDieRoll = createTestSubject();
		result = testDieRoll.makeRoll();
	}
	
	@Test
	public void testToString() throws Exception {
		DieRoll testDieRoll;
		String result;
		
		//default
		testDieRoll = createTestSubject();
		result = testDieRoll.toString();
	}

}
