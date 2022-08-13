import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	//Yuhan
	private Parents ps1;
	private Parents ps2;
	private Parents ps3;
	private ArrayList<Parents> parentList = new ArrayList<Parents>();
	
	//Danish
	private Cca cca1;
	private Cca cca2;
	private Cca cca3;
	private Cca cca4;
	private Cca cca5;
	private ArrayList<Cca> ccaList = new ArrayList<Cca>();
	
	//Done By Jia Xin
		// student
		private Student s1;
		private Student s2;
		private Student s3;

		//Categories
		private Categories c1;
		private Categories c2;
	
		//student
		private ArrayList<Student> studentList = new ArrayList<Student>();
		
	public C206_CaseStudyTest() {
		super();
	}
	
public void setUp() throws Exception {
	//student
	s1 = new Student("21024611", "Jia Xin" , "E66K", "Year 2", "Amran", 91234567);
	
	ps1 = new Parents ("21007466","yuhan","P3","Mr.lim","zhiyuan");
	ps2=  new Parents ("21007564","hanhy","P3","Mr.lim","zhyyuan");
	ps3=  new Parents ("21507564","hanhdsay","P3","Mr.lim","zhyyudaan");
	 
	cca1 = new Cca("little league soccer","Mini soccer competition!","30","Tuesday","3pm-4pm","Field","Mr Akmal");
	cca2 = new Cca("LEGO expert","Build to satisfaction!","40","Wednesday","3:30pm-4:30pm","Activity Rooms","Mr Andy");
	cca3 = new Cca("dig the ground","Finding Diamonds","20","Wednesday","2pm-3pm","Garden","Mr YX");
	cca4 = new Cca("dig the ground","Finding Diamonds","20","Wednesday","2pm-3pm","Garden","Mr YX");
	cca5 = new Cca("jewellery making","Create something fancy!","20","Tuesday","2:30pm-3:30pm","Library","Ms Stanley");
	
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
	
	 //Yuhan
	 @Test
	 public void testAddParents() {
	  // Item list is not null, so that can add a new item
	  assertNotNull("Test if there is valid Parents arraylist to add to", parentList);
	  
	  //Given an empty list, after adding 1 item, the size of the list is 1
	  C206_CaseStudy.addParents( parentList, ps1);  
	  assertEquals("Test if that Parents arraylist size is 1?", 1,parentList.size());
	  
	  //The item just added is as same as the first item of the list
	  assertSame("Test that Parents is added same as 1st item of the list?", ps1, parentList.get(0));
	  
	
	 }
	 @Test
		public void testDeleteParents() {
			// Item list is not null, so that we can delete a new item
		 assertNotNull("Test if there is valid Parents arraylist to add to", parentList);
			// After adding 1 item, test if the size of the list is 1
			C206_CaseStudy.addParents(parentList, ps1);
			assertEquals("Test if that Parents arraylist size is 1?", 1, parentList.size());

			// Delete the item, and test if the size of the list is 0
			C206_CaseStudy.deleteParent(parentList, null); // Requires user input in console
			assertEquals("Test if that Bike arraylist size is 0?", 0, parentList.size());
		}
	 @Test
		public void testRetrieveParent() {
			// Item list is not null, so that we can add a new item
			assertNotNull("Test if there is a Parents arraylist to add to", parentList);

			// Test if the list from the Parent is empty
			String allParent= C206_CaseStudy.retrieveParent( parentList);
			String testOutput = "";
			assertEquals("Check that RetrieveParent", testOutput, allParent);

			//Given an empty list, after adding 2 items, test if the size of the list is 2
			C206_CaseStudy.addParents(parentList, ps1);
			C206_CaseStudy.addParents(parentList, ps2);
			assertEquals("Test if that Parent arraylist size is 2?", 2, parentList.size());
			allParent= C206_CaseStudy.retrieveParent( parentList);

			testOutput = String.format("%-10s %-30s %-10s %-10s %-20d\n","21007466","yuhan","P3","Mr.lim","zhiyuan");
			testOutput += String.format("%-10s %-30s %-10s %-10s %-20d\n","21007564","hanhy","P3","Mr.lim","zhyyuan");
		
			assertEquals("Check that RetrieveParent", testOutput, allParent);
		}

	 @Test
	 //Danish
	 	public void testAddCCA() {
			//Check list is not null so that adding of cca is possible
			assertNotNull("Check if there is an arraylist to add cca to", ccaList);
			
			//normal
			//From an empty list, after adding 1 cca, the size of the list 1 should be 1
			C206_CaseStudy.addCca(ccaList, cca1);
			assertEquals("Check that CCA arraylist size is 1 after adding", 1, ccaList.size());
			assertSame("Check that CCA is added", cca1, ccaList.get(0));
			
			//normal
			//From the list above after adding 1, add 1 more item, the size of the list should be 2
			C206_CaseStudy.addCca(ccaList, cca2);
			assertEquals("Check that CCA arraylist size is 2 after adding", 2, ccaList.size());
			assertSame("Check that CCA is added", cca2, ccaList.get(1));
			
			//normal
			//From the list above after adding 2, add 1 more item, the size of the list should be 3
			C206_CaseStudy.addCca(ccaList, cca3);
			assertEquals("Check that CCA arraylist size is 3 after adding", 3, ccaList.size());		
			assertSame("Check that CCA is added", cca3, ccaList.get(2));
			
			//error
			//From the list above after adding 3, adding 1 more item with same title, the size of the list should still be 3
			C206_CaseStudy.addCca(ccaList, cca4);
			assertEquals("Check that CCA arraylist size is 3 after adding", 3, ccaList.size());
			
		}
	 
	 @Test
	 //Danish
		public void testRetrieveAllCCA() {
			//test to ensure the list is not null but empty
			assertNotNull("Test if there is valid ccaList arraylist to retrieve cca", ccaList);
		
			//normal
			//if given an empty list, after adding 3 users, test if the size of the list is 3
			C206_CaseStudy.addCca(ccaList, cca1);
			C206_CaseStudy.addCca(ccaList, cca2);
			C206_CaseStudy.addCca(ccaList, cca3);
			assertEquals("Test that CCA arraylist size is 3 after adding", 3, ccaList.size());
			
			//error
			//test if the CCA list retrieved is empty
			String empty = C206_CaseStudy.viewAllCca(ccaList);
			String Output = "No CCA";
			assertEquals("Check that ViewCCAList is", Output, empty);
			
			//normal
			//test if the expected output string is the same as the list of CCA retrieved from C206_CaseStudy
			String allCCA = C206_CaseStudy.viewAllCca(ccaList);
			
			Output =  String.format("%-30s %-40s %-20s %-20s %-20s %-20s %-20s\n", "Title", "Description","Class Size", "Day","Time","Venue","Teacher-In-Charge");
			Output += String.format("%-30s %-40s %-20s %-20s %-20s %-20s %-20s\n", "little league soccer","Mini soccer competition!","30","Tuesday","3pm-4pm","Field","Mr Akmal");
			Output += String.format("%-30s %-40s %-20s %-20s %-20s %-20s %-20s\n", "LEGO expert","Build to satisfaction!","40","Wednesday","3:30pm-4:30pm","Activity Rooms","Mr Andy");
			Output += String.format("%-30s %-40s %-20s %-20s %-20s %-20s %-20s\n", "dig the ground","Finding Diamonds","20","Wednesday","2pm-3pm","Garden","Mr YX");
			assertEquals("Test that viewAllCCA is", Output, allCCA);
		}
	 
	 @Test
	 //Danish
		public void testDeleteCCA() {
			//test to ensure the list is not null but empty
			assertNotNull("Test if there is a valid CCA arraylist to delete item", ccaList);
			
			//normal
			//test if the size of the list is 0 after adding 1 and deleting 1
			C206_CaseStudy.addCca(ccaList, cca1);
			C206_CaseStudy.deleteCCA(ccaList, "little league soccer");
			assertEquals("Test that CCA arraylist size is 0 after adding and deleting", 0, ccaList.size());
			
			//normal
			//test if the size of the list is 1 after adding 2 and deleting 1
			C206_CaseStudy.addCca(ccaList, cca1);
			C206_CaseStudy.addCca(ccaList, cca2);
			C206_CaseStudy.deleteCCA(ccaList, "LEGO expert");
			assertEquals("Test that user arraylist size is 1 after deleting", 1, ccaList.size());
			
			//error
			//test if non-existed cca can delete
			C206_CaseStudy.deleteCCA(ccaList, "soccer");
			assertEquals("Test that user arraylist size is 1 after deleting", 1, ccaList.size());
		}
	 
	 @After
	 public void tearDown() throws Exception {
	 
	 ps1 = null;
	 ps2 = null;
	 ps3= null;
	 
	 cca1 = null;
	 cca2 = null;
	 cca3 = null;
	 cca4 = null;
	 cca5 = null;
	 
	 s1 = null;
	 studentList = null;
	 }
 
}