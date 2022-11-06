package intcomppart2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CountATest {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		int output=test.count("alphabet");
		assertEquals(2, output);
	}
}
