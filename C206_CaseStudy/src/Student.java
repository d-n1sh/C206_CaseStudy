public class Student {
	private String studentName;
	private String studentClass;
	private String studentID;
	private String studentGrade;
	private String classTeacher;
	private int contactNo;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public Student(String studentID, String studentName, String studentClass, String studentGrade, String classTeacher,
			int contactNo) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentID = studentID;
		this.studentGrade = studentGrade;
		this.classTeacher = classTeacher;
		this.contactNo = contactNo;
	}



}

