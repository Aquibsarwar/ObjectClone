package com.clonejava.Test;

import CloneMethod.CloneMethod.Porshe;

import static org.junit.Assert.*;

import org.junit.Test;

public class PorsheTest {

	@Test
	public void shouldClonePorsche() {
		 Porshe porshe = new Porshe("Aquib");
		 Porshe ayshaporshe = porshe.clone() ; 
		 assertNotSame(porshe, ayshaporshe);
		 assertEquals("Porshe of Aquib", porshe.asString());
		 //assertEquals("Porshe of Aysha", ayshaporshe.asString());
		 ayshaporshe.sellto("Aysha");
		 assertEquals("Porshe of Aysha", ayshaporshe.asString());
		 System.out.print(porshe);
		 
	}

}
