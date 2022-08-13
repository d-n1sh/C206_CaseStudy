import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	//Done By Jia Xin
	// student
	private Student s1;
	private Student s2;
	private Student s3;

	//student
	private ArrayList<Student> studentList;
	
	@Before
	public void setUp() throws Exception {
	//student
	s1 = new Student("21024611", "Jia Xin" , "E66K", "Year 2", "Amran", 91234567);
	
	 studentList = new ArrayList<Student>();
	
	}
	
	//Done by Jia Xin
	@Test
	  public void testAddStudent() {
	    // Student list is not null, so that can add a new student
	    assertNotNull("Test if there is valid student arraylist to add to", studentList);

	    // Given an empty list, after adding 1 item, the size of the list is 1
	    C206_CaseStudy.addStudent(studentList, s1);
	    assertEquals("Test if that student arraylist size is 1?", 1, studentList.size());

	    // The student just added is as same as the first student of the list
	    assertSame("Test that student is added same as 1st item of the list?", s1, studentList.get(0));

	  }
	
	//Done by Jia Xin
	@Test
	  public void testRetrieveAllStudent() {
	    assertNotNull("Test if there is a valid student array to add to", studentList);
	    String allStudents = C206_CaseStudy.retrieveAllStudent(studentList);
	    String test = "";
	    assertEquals("Check that ViewAllSudentlist", test, allStudents);

	    // Given an empty list, after adding 1 item, test if the size of the list is 1
	    C206_CaseStudy.addStudent(studentList, s1);
	    assertEquals("Test if that student arraylist size is 1?", 1, studentList.size());

	    // test if the expected output string same as the list of students
	    // retrieved
	    allStudents = C206_CaseStudy.retrieveAllStudent(studentList);

	    test = String.format("%-15s %-15s %-15s %-15s %-15s %-15s\n", "student ID", "student Name", "student Class", "student Grade", "class Teacher", "contact Number");
	  }
	
	//Done by Jia Xin
	@Test
	  public void testDoReturnStudent() {
	    // boundary
	    assertNotNull("Test if there is valid Student arraylist to add to", studentList);
	    C206_CaseStudy.addStudent(studentList, s1);
	    // error
	    Boolean isReturned = C206_CaseStudy.deleteStudent(studentList, "s1");
	    assertFalse("Test if available Student s1 is returned -false?", isReturned);
	    // error
	    isReturned = C206_CaseStudy.deleteStudent(studentList, "S1");
	    assertFalse("Test if non-existing Student s1 is returned - false?", isReturned);

	  }


	@After
	public void tearDown() throws Exception {
		
	//Done By Jia Xin
	//student
	s1 = null;
	studentList = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
		
		
	}

}
