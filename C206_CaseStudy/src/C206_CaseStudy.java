import java.util.ArrayList;

public class C206_CaseStudy {
	private static final int OPTION_STAFF = 1;
	private static final int OPTION_PARENT = 2;
	private static final int OPTION_STUDENT = 3;
	
	private static final int OPTION_VIEW = 1;
	private static final int OPTION_ADD = 2;
	private static final int OPTION_DELETE = 3;
	
	private static final int OPTION_QUIT = 5;

	
	public static void main(String[] args) {

		// Done by Danish
		ArrayList<Cca> ccaList = new ArrayList<Cca>();

		ccaList.add(new Cca("little league soccer","Mini soccer competition!","30","Tuesday","3pm-4pm","Field","Mr Akmal"));
		ccaList.add(new Cca("LEGO expert","Build to satisfaction!","40","Wednesday","3:30pm-4:30pm","Activity Rooms","Mr Andy"));
		ccaList.add(new Cca("dig the ground","Finding Diamonds","20","Wednesday","2pm-3pm","Garden","Mr YX"));
		ccaList.add(new Cca("bakery","Baking your dream cake!","30","Tuesday","4pm-5pm","F&B","Mr Tim"));
		ccaList.add(new Cca("jewellery making","Create something fancy!","20","Tuesday","2:30pm-3:30pm","Library","Ms Stanley"));
		
		
		// Done by Jia Xin
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("21024611", "Jia Xin" , "E66K", "Year 2", "Amran", 91234567));
		
		// Done by Yuhan
		ArrayList<Parents> parentList = new ArrayList<Parents>();
		
		parentList.add(new Parents("21007466","Yuhan","yuhan@gmail.com","89653212","2"));
		
		
		int option = 0;
		C206_CaseStudy.menu();
		option = Helper.readInt("Enter an option > ");

			// Done by Danish
			if (option == OPTION_STAFF) {
					String staffUsername = Helper.readString("Enter username > ");
					String staffPassword = Helper.readString("Enter password > ");
				
					// LOGIN PAGE TO BE DONE
					
						C206_CaseStudy.CCAmenu();
					
						int optionCCA = Helper.readInt("Enter option to either view/add/delete > ");
	
						while (optionCCA != OPTION_QUIT) {
							// View all cca
							if (optionCCA == OPTION_VIEW) {
								C206_CaseStudy.viewAllCca(ccaList);
								System.out.println("");
								C206_CaseStudy.CCAmenu();
								optionCCA = Helper.readInt("Enter option to either view/add/delete > ");
		
							// Add cca
							} else if (optionCCA == OPTION_ADD) {
								Cca add = inputCca();
								C206_CaseStudy.addCca(ccaList, add);
								System.out.println("CCA added\n");
								C206_CaseStudy.CCAmenu();
								optionCCA = Helper.readInt("Enter option to either view/add/delete > ");
								
							} else if (optionCCA == OPTION_DELETE) {
								String title = Helper.readString("Enter CCA title to delete > ");
								C206_CaseStudy.deleteCCA(ccaList, title);
								System.out.println("CCA deleted\n");
								C206_CaseStudy.CCAmenu();
								optionCCA = Helper.readInt("Enter option to either view/add/delete > ");
								
							} else {
								System.out.println("Invalid option\n");
								C206_CaseStudy.CCAmenu();
								optionCCA = Helper.readInt("Enter option to either view/add/delete > ");
							}
						
						}
						System.out.println("Bye " + staffUsername + "\n");
						C206_CaseStudy.menu();
						option = Helper.readInt("Enter an option > ");

			// Done By Yuhan
			} else if (option == OPTION_PARENT) {
					
				String parentUsername = Helper.readString("Enter username > ");
				String parentPassword = Helper.readString("Enter password > ");
			
				// LOGIN PAGE TO BE DONE

					C206_CaseStudy.Parentmenu();
					
					int optionParent = Helper.readInt("Enter option to either view/add/delete > ");
					
					while (optionParent != OPTION_QUIT) {					
					
						if (optionParent == OPTION_ADD) {
							// Add parent
							Parents parent = inputParents();
							C206_CaseStudy.addParents(parentList, parent);
							System.out.println("Parent account added\n");
							C206_CaseStudy.Parentmenu();
							optionParent = Helper.readInt("Enter option to either view/add/delete > ");
							
						} else if (optionParent == OPTION_VIEW) {
							// View Parent
							C206_CaseStudy.viewParent(parentList);
							System.out.println("");
							C206_CaseStudy.Parentmenu();
							optionParent = Helper.readInt("Enter option to either view/add/delete > ");
		
						} else if (optionParent == OPTION_DELETE) {
							// Delete Parent
							String id = Helper.readString("Enter student id to delete > ");
							C206_CaseStudy.deleteParent(parentList, id);
							System.out.println("Parent account deleted\n");
							C206_CaseStudy.Parentmenu();
							optionParent = Helper.readInt("Enter option to either view/add/delete > ");
							
						} else {
							System.out.println("Invalid option\n");
							C206_CaseStudy.Studentmenu();
							optionParent = Helper.readInt("Enter option to either view/add/delete > ");
						}
					
					}
					System.out.println("Bye " + parentUsername + "\n");
					C206_CaseStudy.menu();	
					option = Helper.readInt("Enter an option > ");
					
			// Done By Jia Xin
			} else if (option == OPTION_STUDENT) {
			
				String studentUsername = Helper.readString("Enter username > ");
				String studentPassword = Helper.readString("Enter password > ");
			
				// LOGIN PAGE TO BE DONE

					C206_CaseStudy.Studentmenu();
					
					int optionStudent = Helper.readInt("Enter option to either view/add/delete > ");
					
					while (optionStudent != OPTION_QUIT) {				
					
						if (optionStudent == OPTION_ADD) {
							// Add student
							Student student = inputStudent();
							C206_CaseStudy.addStudent(studentList, student);
							System.out.println("Student added\n");
							C206_CaseStudy.Studentmenu();
							optionStudent = Helper.readInt("Enter option to either view/add/delete > ");
							
						} else if (optionStudent == OPTION_VIEW) {
							// View all Student
							C206_CaseStudy.viewAllStudent(studentList);
							System.out.println("");
							C206_CaseStudy.Studentmenu();
							optionStudent = Helper.readInt("Enter option to either view/add/delete > ");
		
						} else if (optionStudent == OPTION_DELETE) {
							// Delete Student
							String name = Helper.readString("Enter student name to delete > ");
							C206_CaseStudy.deleteStudent(studentList, name);
							System.out.println("Student deleted\n");
							C206_CaseStudy.Studentmenu();
							optionStudent = Helper.readInt("Enter option to either view/add/delete > ");
														
						} else {
							System.out.println("Invalid option\n");
							C206_CaseStudy.Studentmenu();
							optionStudent = Helper.readInt("Enter option to either view/add/delete > ");
						}
						
					}
					System.out.println("Bye " + studentUsername + "\n");
					C206_CaseStudy.menu();
					option = Helper.readInt("Enter an option > ");
			}

		
		System.out.println("Bye!");
		
	}

	public static void menu() {
		C206_CaseStudy.setHeader("CCA REGISTRATION");				
		C206_CaseStudy.setHeader("OPTIONS");
		System.out.println("1. Staff");
		System.out.println("2. Parent");
		System.out.println("3. Student");
		System.out.println("5. Quit");
		Helper.line(80, "-");
	}
	
	public static void CCAmenu() {
		C206_CaseStudy.setHeader("CCA REGISTRATION");
		C206_CaseStudy.setHeader("STAFF");				
		C206_CaseStudy.setHeader("OPTIONS");
		System.out.println("1. View CCA");
		System.out.println("2. Add CCA");
		System.out.println("3. Delete CCA");
		System.out.println("5. Quit");
		Helper.line(80, "-");
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

// DONE BY DANISH
	//================================= Option 1 View CCA (CRUD- Read) =================================
	public static String retrieveAllCca(ArrayList<Cca> ccaList) {
		String output = "";

		for (int i = 0; i < ccaList.size(); i++) {

			output += String.format("%-30s %-40s %-20s %-20s %-20s %-20s %-20s\n",
					ccaList.get(i).getTitle(),
					ccaList.get(i).getDescription(),
					ccaList.get(i).getClassSize(),
					ccaList.get(i).getDay(),
					ccaList.get(i).getTime(),
					ccaList.get(i).getVenue(),
					ccaList.get(i).getName());
		}
		return output;
	}
	public static String viewAllCca(ArrayList<Cca> ccaList) {
		C206_CaseStudy.setHeader("CCA LIST");
		String output = String.format("%-30s %-40s %-20s %-20s %-20s %-20s %-20s\n",
				"Title", "Description",
				"Class Size", "Day","Time",
				"Venue","Teacher-In-Charge");
		 output += retrieveAllCca(ccaList);
		System.out.println(output);
	}

	//================================= Option 2 Add CCA (CRUD - Create) =================================
	public static Cca inputCca() {
		Cca add = null;
		
		String title = Helper.readString("Enter CCA title > ");
		String description = Helper.readString("Enter CCA description > ");
		String classSize = Helper.readString("Enter class size > ");
		String day = Helper.readString("Enter CCA day > ");
		String time = Helper.readString("Enter CCA time > ");
		String venue = Helper.readString("Enter CCA venue > ");
		String name = Helper.readString("Enter teacher-in-charge > ");
		
		add = new Cca(title, description, classSize, day, time, venue, name);
		return add;
		
	}
	public static void addCca(ArrayList<Cca> ccaList, Cca add) {
		
		ccaList.add(add);
		
	}
	
	//================================= Option 3 Delete CCA (CRUD - Update) =================================
	public static boolean deleteCCA(ArrayList<Cca> ccaList, String title) {
		
		boolean isDeleted = false;

		for (int i = 0; i < ccaList.size(); i++) {
			if (title.equalsIgnoreCase(ccaList.get(i).getTitle())) {
				
				ccaList.remove(i);
				
				isDeleted = true;
				
			}
		}
		return isDeleted;
	}
	
	
//DONE BY JIA XIN
	public static void Studentmenu() {
		C206_CaseStudy.setHeader("CCA REGISTRATION");
		C206_CaseStudy.setHeader("STUDENT");			
		C206_CaseStudy.setHeader("OPTIONS");
		System.out.println("1. View Student");
		System.out.println("2. Add Student");
		System.out.println("3. Delete Student");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}

	//================================= Option 1 View Student (CRUD - Create) =================================

	public static String retrieveAllStudent(ArrayList<Student> studentList) {
		String output = "";

		for (int i = 0; i < studentList.size(); i++) {

			output += String.format("%-15s %-15s %-15s %-15s %-15s %-10d\n", studentList.get(i).getStudentID(),
					studentList.get(i).getStudentName(), 
					studentList.get(i).getStudentClass(), 
					studentList.get(i).getStudentGrade(), 
					studentList.get(i).getClassTeacher(), 
					studentList.get(i).getContactNo());
		}
		return output;
	}
	
	public static void viewAllStudent(ArrayList<Student> studentList) {
		C206_CaseStudy.setHeader("STUDENT LIST");
		String output = String.format("%-15s %-15s %-15s %-15s %-15s %-15s\n", "student ID", "student Name", "student Class", "student Grade", "class Teacher", "contact Number");
		output += retrieveAllStudent(studentList);	
		System.out.println(output);
	}
	
	//================================= Option 2 Add Students (CRUD - Read) =================================
	
	public static Student inputStudent() {
		String studentID = Helper.readString("Enter your student ID > ");
		String studentName = Helper.readString("Enter student Name > ");
		String studentClass =  Helper.readString("Enter student class > ");
		String studentGrade = Helper.readString("Enter student grade > ");
		String classTeacher = Helper.readString("Enter classroom teacher > ");
		int contactNo = Helper.readInt("Enter your contact number > ");

		Student student = new Student(studentID, studentName, studentClass, studentGrade, classTeacher, contactNo);
		return student;
		
	}
	public static void addStudent(ArrayList<Student> studentList, Student student) {
		
		studentList.add(student);
		
	}
	
	//================================= Option 3 Delete Students (CRUD - Update) =================================
	public static boolean deleteStudent(ArrayList<Student> studentList, String student) {
		
		boolean isDeleted = false;
		
		for (int i = 0; i < studentList.size(); i++) {
			if (student.equalsIgnoreCase(studentList.get(i).getStudentName())) {
				
				studentList.remove(i);
				
				isDeleted = true;
				
			}
		}
		return isDeleted;
	
	}
	
//DONE BY YUHAN
	
	public static void Parentmenu() {
		C206_CaseStudy.setHeader("CCA REGISTRATION");
		C206_CaseStudy.setHeader("PARENTS");			
		C206_CaseStudy.setHeader("OPTIONS");
		System.out.println("1. View parent account");
		System.out.println("2. Add parent account");
		System.out.println("3. Delete parent account");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}
	
	//================================= Option 1 View Parents (CRUD - Create) =================================
	
	public static String retrieveParent(ArrayList<Parents> parentList) {
		String output = "";

		String studentid = Helper.readString("Enter student ID > ");
		String regid = Helper.readString("Enter registration ID > ");
		
		for (int i = 0; i < parentList.size(); i++) {

			if (studentid.equalsIgnoreCase(parentList.get(i).getStudentid()) &&
					regid.equalsIgnoreCase(parentList.get(i).getRegID())) {
			
			output += String.format("%-20s %-20s %-40s %-20s\n",
					parentList.get(i).getStudentid(),
					parentList.get(i).getParentsName(),
					parentList.get(i).getParentsEmail(),
					parentList.get(i).getParentsContact());
			}
		}
		return output;
	}
	public static void viewParent(ArrayList<Parents> parentList) {
		C206_CaseStudy.setHeader("PARENT DETAILS");
		String output = String.format("%-20s %-20s %-40s %-20s\n",
				"Student ID", "Parents Name",
				"Parents Email", "Parents Contact");
		 output += retrieveParent(parentList);
		System.out.println(output);
	}
	
	//================================= Option 2 Add Parents (CRUD - Create) =================================
	
	public static Parents inputParents() {
		String studentid = Helper.readString("Enter student ID > ");
		String parentName = Helper.readString("Enter parents name > ");
		String parentEmail =  Helper.readString("Enter parents email > ");
		String contactNo = Helper.readString("Enter parents contact number > ");
		String regID = Helper.readString("Enter registration ID > ");

		Parents parent = new Parents(studentid, parentName, parentEmail, contactNo, regID);
		return parent;
		
	}
	public static void addParents(ArrayList<Parents> parentList, Parents parent) {
		parentList.add(parent);
		
	}
	
	//================================= Option 3 Delete Parents (CRUD - Update) =================================
		public static boolean deleteParent(ArrayList<Parents> parentList, String studentid) {
			
			boolean isDeleted = false;
			
			for (int i = 0; i < parentList.size(); i++) {
				if (studentid == parentList.get(i).getStudentid()) {
					
					parentList.remove(i);
					
					isDeleted = true;
					
				}
			}
			return isDeleted;
		
		}
	
//Done by Akmal
 public static void studentCCAmenu() {
 	String studentID = Helper.readString("Enter student ID > ");
 	String regID = Helper.readString("Enter registration ID > ");
 	
 		
 		C206_CaseStudy.setHeader("CCA REGISTRATION");
 		C206_CaseStudy.setHeader("PARENTS");			
 		C206_CaseStudy.setHeader("OPTIONS");
 		System.out.println("1. Add student for CCA");
 		System.out.println("2. View students registered for a CCA");
 		Helper.line(80, "-");
 }
 		//option 1
 		public static RegisterCCA input() {
 			String studentID = Helper.readString("Enter your student ID > ");
 			String studentName = Helper.readString("Enter student Name > ");
 			String ccaName = Helper.readString("Enter CCA > ");

 			RegisterCCA ccaRegister = new RegisterCCA(studentID, studentName,ccaName);
 			return ccaRegister;
 			
 		}
 		public static void StudentCCA(ArrayList<RegisterCCA> studentCCAList, RegisterCCA ccaRegister) {
 			studentCCAList.add(ccaRegister);
 		}
 		//option 2
 		public static String retrieveStudentCCA(ArrayList<RegisterCCA> studentCCAList) {
 			String output = "";

 			String studentid = Helper.readString("Enter student ID > ");
 			String regid = Helper.readString("Enter registration ID > ");
 			
 			for (int i = 0; i < studentCCAList.size(); i++) {
 				
 				output += String.format("%-20s %-20s %-20s\n",
 						studentCCAList.get(i).getStudentID(),
 						studentCCAList.get(i).getStudentName(),
 						studentCCAList.get(i).getCcaName());
 				}
 			return output;
 			}
 			
 		public static void viewStudentCCAList(ArrayList<RegisterCCA> studentCCAList) {
 			C206_CaseStudy.setHeader("Students Registered for CCA");
 			String output = String.format("%-20s %-20s %-20s\n",
 					"Student ID", "Student's Name",
 					"CCA");
 			 output += retrieveStudentCCA(studentCCAList);
 			System.out.println(output);
 		}
			     
	}		
}

////DONE BY TIMOTHY
//public static void Categorymenu() {
//    C206_CaseStudy.setHeader("Maintaining parent accounts");
//    System.out.println("1. Add Categories");
//    System.out.println("2. View Categories");
//    System.out.println("3. Delete Categories");
//    System.out.println("4. Quit");
//    Helper.line(80, "-");
//  }
////add categories account
//public static Categories inputCategories() {
//
//   String catName = Helper.readString("Enter category name > ");
//
//
//   Categories Category = new Categories(catName);
//   return Category;
//    
//  }
//public static void addCategory(ArrayList<Categories> categoryList, Categories Category) {
//    
//    categoryList.add(Category);
//  }
////view categories account
//public static String retrieveAllCategories(ArrayList<Categories> categoryList) {
//String output = "";
//for (int i = 0; i < categoryList.size(); i++) {
//
//       output += String.format("%-15s \n",
//        
//        categoryList.get(i).getCatName());
//
//     }
//     return output;
//   }
//public static void viewAllCategory(ArrayList<Categories> categoryList) {
//    C206_CaseStudy.setHeader("CATEGORY LIST");
//    String output = String.format("%-15s \n");
//    output += retrieveAllCategories(categoryList);
//    System.out.println(output);
//  }
//
//public static void deleteAllCategory(ArrayList<Categories> categoryList) {
//String output = String.format("%-15s \n");
//output += retrieveAllCategories(categoryList);
//   System.out.println(output);
//}
//
////Manage categories accounts (add,view,delete)
//ArrayList<Categories> categoryList = new ArrayList<Categories>();
//
// while (optionCat != OPTION_QUIT) {
//
//    C206_CaseStudy.Categorymenu();
//     int optionCat = Helper.readInt("Enter an option > ");
//
//    if (optionCat == OPTION_ADD ) {
//      // Add a new item
//      C206_CaseStudy.setHeader("ADD");
//        // Add student
//        Categories category = inputCategories();
//        C206_CaseStudy.addCategory(categoryList, category);
//        System.out.println("Category added");
//     
//
//    } else if (optionCat == OPTION_VIEW) {
//      // View all categories
//      C206_CaseStudy.viewAllCategory(categoryList);
//
//    } else if (optionCat == OPTION_DELETE ) {
//      // Delete category
//      C206_CaseStudy.setHeader("DELETE");      
//      // Delete category
//      C206_CaseStudy.deleteAllCategory(categoryList);
//
//    } else if (optionCat == OPTION_QUIT) {
//      System.out.println("Bye!");
//      
//    } else {
//      System.out.println("Invalid option");
//    }
//  }
// }
// }
//