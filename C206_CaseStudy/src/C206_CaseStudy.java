import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("21024611", "Jia Xin" , "E66K", "Year 2", "Amran", 88746209));
		
		int option = 0;

		while (option != 4) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// Add a new item
				C206_CaseStudy.setHeader("ADD");			
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Student");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Add student
					Student student = inputStudent();
					C206_CaseStudy.addStudent(studentList, student);
					System.out.println("Student added");

				} else {
					System.out.println("Student does not exist / Invalid input");
				}

			} else if (option == 2) {
				// View all items
				C206_CaseStudy.viewAllStudent(studentList);

			} else if (option == 3) {
				// Delete Student
				C206_CaseStudy.setHeader("DELETE STUDENT");			
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. STUDENT");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Delete Student
					//C206_CaseStudy.deleteStudent(studentList);
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 4) {
				System.out.println("Bye!");
				
			} else {
				System.out.println("Invalid option");
			}
		}

		}
		public static void menu() {
			C206_CaseStudy.setHeader("CCA Registration");
			System.out.println("1. Add Student");
			System.out.println("2. View Student");
			System.out.println("3. Delete Student");
			System.out.println("4. Quit");
			Helper.line(80, "-");

		}
		
		public static void setHeader(String header) {
			Helper.line(80, "-");
			System.out.println(header);
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

			Student student= new Student(studentID, studentName, studentClass, studentGrade, classTeacher, contactNo);
			return student;
			
		}
		public static void addStudent(ArrayList<Student> studentList, Student student) {
			
			studentList.add(student);
			
		}
		
		//================================= Option 2 View Students (CRUD- Read) =================================
		public static String retrieveAllStudent(ArrayList<Student> studentList) {
			String output = "";

			for (int i = 0; i < studentList.size(); i++) {

				output += String.format("%-10s %-30s %-10s %-10s %-20d\n", studentList.get(i).getStudentID(),
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
			String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "student ID", "student Name", "student Class", "student Grade", "class Teacher", "contact Number");
			output += retrieveAllStudent(studentList);	
			System.out.println(output);
		}

		
	
	public static void deleteStudent(ArrayList<Student> studentList, Student student) {
		
		studentList.remove(student);
		
	}
	}
