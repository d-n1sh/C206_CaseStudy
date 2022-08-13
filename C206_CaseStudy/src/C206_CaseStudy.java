<<<<<<< HEAD



=======
import java.util.ArrayList;
>>>>>>> branch 'master' of https://github.com/d-n1sh/C206_CaseStudy.git
public class C206_CaseStudy {
	public static void Categorymenu() {
	       C206_CaseStudy.setHeader("Maintaining parent accounts");
	       System.out.println("1. Add Parent");
	       System.out.println("2. View Parent");
	       System.out.println("3. Delete Parent");
	       System.out.println("4. Quit");
	       Helper.line(80, "-");
	     }
	  //add categories account
	  public static Categories inputCategories() {
	   
	      String catName = Helper.readString("Enter category name > ");


	      Categories Category = new Categories(catName);
	      return Category;
	       
	     }
	  public static void addParent(ArrayList<Categories> categoryList, Categories Category) {
	       
	       categoryList.add(Category);
	     }
	  //view categories account
	  public static String retrieveAllCategories(ArrayList<Categories> categoryList) {
	   String output = "";
	   for (int i = 0; i < categoryList.size(); i++) {

	          output += String.format("%-15s \n",
	           
	           categoryList.get(i).getCatName());

	        }
	        return output;
	      }
	  public static void viewAllCategory(ArrayList<Categories> categoryList) {
	       C206_CaseStudy.setHeader("CATEGORY LIST");
	       String output = String.format("%-15s \n");
	       output += retrieveAllCategories(categoryList);
	       System.out.println(output);
	     }
	  
	  public static void deleteAllCategory(ArrayList<Categories> categoryList) {
	   String output = String.format("%-15s \n");
	   output += retrieveAllCategories(categoryList);
	      System.out.println(output);
	  }
	//Manage categories accounts (add,view,delete)
	  ArrayList<Categories> categoryList = new ArrayList<Categories>();
	  int option = 0;

	     while (option != 4) {

	       C206_CaseStudy.Categorymenu();
	       option = Helper.readInt("Enter an option > ");

	       if (option == 1) {
	         // Add a new item
	         C206_CaseStudy.setHeader("ADD");
	           // Add student
	           Categories category = inputCategories();
	           C206_CaseStudy.addParent(categoryList, category);
	           System.out.println("Category added");
	        

	       } else if (option == 2) {
	         // View all categories
	         C206_CaseStudy.viewAllCategory(categoryList);

	       } else if (option == 3) {
	         // Delete category
	         C206_CaseStudy.setHeader("DELETE");      
	         // Delete category
	         C206_CaseStudy.deleteAllCategory(categoryList);

	       } else if (option == 4) {
	         System.out.println("Bye!");
	         
	       } else {
	         System.out.println("Invalid option");
	       }
	     }
	  //


	private static final int OPTION_STAFF = 1;
	private static final int OPTION_PARENT = 2;
	private static final int OPTION_STUDENT = 3;
	
	private static final int OPTION_VIEW = 1;
	private static final int OPTION_ADD = 2;
	private static final int OPTION_DELETE = 3;
	
	private static final int OPTION_QUIT = 5;
	
	public static void main(String[] args) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		
		ArrayList<Parent> parentList = new ArrayList<Parent>();
		parentList.add(new Parent("21007466","Rick","P3"));
		System.out.println("Manage Parents account");
		Helper.line(80, "=");
       System.out.println("1. View students information");
        System.out.println("2. delete parent details");
        System.out.println("3. add parent details");
       int suboption = Helper.readInt("Enter an option > ");
       if (suboption == 1) { //Verified
          viewAllParent(parentList);
	        }
       else if (suboption == 2) {
    	  Parent newParent=inputParent() ;
    	  C206_CaseStudy.addParent(parentList,newParent);
    	  
        }
       else {
    	   doDelete (parentList);
       }
			
	}
	public static String retrieveAllParent(ArrayList<Parent> parentList) {
		String output="";
		for (int i = 0; i < parentList.size(); i++) {
			String id=parentList.get(i).getID();
			String name=parentList.get(i).getApptDate();
			output += String.format("%-5s %-10s\n", parentList.get(i).getID(),
					parentList.get(i).getApptDate());
			
		}
		return output;
	}
	public static void doView(ArrayList<Parent> parentList) {
=======

		// Done by Danish
		ArrayList<Cca> ccaList = new ArrayList<Cca>();

		ccaList.add(new Cca("little league soccer","Mini soccer competition!","30","Tuesday","3pm-4pm","Field","Mr Akmal"));
		ccaList.add(new Cca("LEGO expert","Build to satisfaction!","40","Wednesday","3:30pm-4:30pm","Activity Rooms","Mr Andy"));
		ccaList.add(new Cca("dig the ground","Finding Diamonds","20","Wednesday","2pm-3pm","Garden","Mr YX"));
		ccaList.add(new Cca("bakery","Baking your dream cake!","30","Tuesday","4pm-5pm","F&B","Mr Tim"));
		ccaList.add(new Cca("jewellery making","Create something fancy!","20","Tuesday","2:30pm-3:30pm","Library","Ms Stanley"));
		
		
		// Done by Jia Xin
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("21024611", "Jia Xin" , "E66K", "Year 2", "Amran", 88746209));
		
		
		int option = 0;
		C206_CaseStudy.menu();
		option = Helper.readInt("Enter an option > ");


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

			} else if (option == OPTION_PARENT) {
					
				String parentUsername = Helper.readString("Enter username > ");
				String parentPassword = Helper.readString("Enter password > ");
			
				// LOGIN PAGE TO BE DONE
			
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
							
						}else if (optionStudent == OPTION_QUIT){
							System.out.println("Bye " + studentUsername + "\n");
							C206_CaseStudy.menu();
					
							
						} else {
							System.out.println("Invalid option\n");
							C206_CaseStudy.Studentmenu();
							optionStudent = Helper.readInt("Enter option to either view/add/delete > ");
						}
						
					
					}
			}

		
		System.out.println("Bye!");
>>>>>>> branch 'master' of https://github.com/d-n1sh/C206_CaseStudy.git

		String output = String.format("%-5s %-10s\n", "ID", "NAME");
		output+=retrieveAllParent(pList);
		System.out.println(output);
	}

<<<<<<< HEAD
	public static Parent inputParent() {
		String id = Helper.readString("Enter ID > ");
		String name = Helper.readString("Enter name > ");
		Parent newParent = new Parent(id, name);
		return newParent;
	}

	public static void addParent(ArrayList<Parent> parentList, Parent newParent) {
		parentList.add(newParent);

	}
	public static void doDelete(ArrayList<Parent> parentList) {
		String id = Helper.readString("Enter ID > ");
		for (int i = 0; i < parentList.size(); i++) {
			if (parentList.get(i).getID().equals(id)) {
				parentList.remove(i);
				System.out.println("Deleted Successfully!");
			} else {
				System.out.println("Invalid Appointment ID");
			}
		}
	}
	
		
	}


=======

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
	public static void viewAllCca(ArrayList<Cca> ccaList) {
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

	//================================= Option 1 Add Student (CRUD - Create) =================================
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
	
	//================================= Option 2 View Students (CRUD - Read) =================================
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
	
}
>>>>>>> branch 'master' of https://github.com/d-n1sh/C206_CaseStudy.git
