package jdice;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Vector;
import org.junit.jupiter.api.Test;

class DiceParserTest {

	private DiceParser createTestSubject() {
		return new DiceParser();
	}
	
	@Test
	public void testMain() throws Exception {
		String[] args = new String[] {""};
		
		//default test
		DiceParser.main(args);
	}
	
	@Test
	public void testParserRoll() throws Exception {
		String s = "";
		Vector<DieRoll> result;
		
		//default test
		result = DiceParser.parseRoll(s);
	}

}
