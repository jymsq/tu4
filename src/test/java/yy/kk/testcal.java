package yy.kk;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class testcal {
Calc cal=new Calc(); 
	@Test
	void test() {
		assertTrue(cal.add(5, 4)==9);
		assertTrue(cal.sub(1, 3)==10);
	}
}
