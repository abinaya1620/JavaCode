package com.alaTestProgram;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculateCheapCallTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateCheapcall1() {
		System.out.println("testCalculateCheapcall");
		CalculateCheapCall call=new CalculateCheapCall();
     call.calculateCheapcall("5555555555");
   
	}
	@Test
	public void testCalculateCheapcall2() {
		System.out.println("testCalculateCheapcall2");

		CalculateCheapCall call=new CalculateCheapCall();
     call.calculateCheapcall("467324444");
   
	
	}
	@Test
	public void testCalculateCheapcall3() {
		System.out.println("testCalculateCheapcall3");

		CalculateCheapCall call=new CalculateCheapCall();
     call.calculateCheapcall("485555555");
   
	
	}
	@Test
	public void testCalculateCheapcall4() {
		System.out.println("testCalculateCheapcall4");

		CalculateCheapCall call=new CalculateCheapCall();
     call.calculateCheapcall("2681111");
   
	
	}
	@Test
	public void testCalculateCheapcall5() {
		System.out.println("testCalculateCheapcall5");
		CalculateCheapCall call=new CalculateCheapCall();
     call.calculateCheapcall("68123456789");
   
	
	}

}
