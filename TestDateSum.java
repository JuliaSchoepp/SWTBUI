package datesum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDateSum {

	@Test
	void testBasic() {
		int sum = DateSum.dateSum("09-06-2022");
		assertEquals(2037, sum);
	}
	
	@Test
	void testWring() {
		int sum = DateSum.dateSum("Hallo");
		assertEquals(0, sum);
	}

}
