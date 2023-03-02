/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer 
 * Due: 03/02/2023
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Harlene Kaur
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTest {
	Gradebook grade1, grade2;

	@BeforeEach
	void setUp() throws Exception {
		grade1 = new Gradebook(5);
		grade2 = new Gradebook(5);
		
		grade1.addScore(48.0);
		grade1.addScore(75.5);
		
		grade2.addScore(98.0);
		grade2.addScore(95.5);
	}

	@AfterEach
	void tearDown() throws Exception {
		grade1 = null;
		grade2 = null;
	}

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	public void testAddScore() {
		//fail("Not yet implemented");
		
		assertEquals(2.0, grade1.getScoreSize(), 0.01);
        assertEquals(2.0, grade2.getScoreSize(), 0.01);
		
		assertTrue(grade1.toString().equals("48.0 75.5 "));  
        assertTrue(grade2.toString().equals("98.0 95.5 "));
	}

	public void testSum() {
		//fail("Not yet implemented");
		
		assertEquals(123.5, grade1.sum(), 0.0001);
		assertEquals(193.5, grade2.sum(), 0.0001);
	}

	public void testMinimum() {
		//fail("Not yet implemented");

		assertEquals(48, grade1.minimum(), 0.001);
		assertEquals(95.5, grade2.minimum(), 0.001);
	}

	public void testFinalScore() {
		//fail("Not yet implemented");
		
		assertEquals(75.5, grade1.finalScore(), 0.0);
		assertEquals(98.0, grade2.finalScore(), 0.0);
	}

}
