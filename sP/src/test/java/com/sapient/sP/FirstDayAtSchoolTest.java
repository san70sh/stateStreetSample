package com.sapient.sP;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class FirstDayAtSchoolTest {

	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag1 = {"Books", "Notebooks", "Pens" };
	String[] bag2 = {"Books", "Notebooks", "Pens", "Pencils", "Rulers" };
	
	
	@Test
	public void testPrepareMyBag() {
		System.out.print("Inside testPrepareMyBag()");
		assertArrayEquals(bag1, school.prepareMyBag());
	}
	
	@Test
	public void testAddPencils() {
		System.out.println("Inside testAddPencils()");
		assertArrayEquals(bag2,school.addPencils());
	}

}
