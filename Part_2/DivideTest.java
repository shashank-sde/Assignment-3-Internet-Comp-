package intcomppart2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DivideTest {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		double output=test.divide(10, 2);
		assertEquals(5, output);
		JunitTesting test2=new JunitTesting();
		double output2=test2.divide(10, 0);
		assertEquals(0, output2);
		
	}
	
}