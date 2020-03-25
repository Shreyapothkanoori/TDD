package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tstcases {

	@Test
	public void test() {
		Testcases_Demo  t=new Testcases_Demo ();
		String out=t.valid_string("ABCD");
		assertEquals("BCD",out);
	}
	@Test
	public void test1() {
		Testcases_Demo  t=new Testcases_Demo ();
		String out=t.valid_string("AACD");
		assertEquals("CD",out);
	}
	@Test
	public void test2() {
		Testcases_Demo  t=new Testcases_Demo ();
		String out=t.valid_string("BACD");
		assertEquals("BCD",out);
	}
	@Test
	public void test4() {
		Testcases_Demo  t=new Testcases_Demo ();
		String out=t.valid_string("BBAA");
		assertEquals("BBAA",out);
	}
	@Test
	public void test5() {
		Testcases_Demo  t=new Testcases_Demo ();
		String out=t.valid_string("AAAAAAAAAAA");
		assertEquals("AAAAAAAAA",out);
	}
	@Test
	public void test6() {
		Testcases_Demo  t=new Testcases_Demo ();
		String out=t.valid_string("AABAA");
		assertEquals("BAA",out);
	}

}
