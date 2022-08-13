import java.util.Random;

public class Parents {
	
	private String studentid;
	private String studentName;
	private String studentClass;
	private String studentGrade;
	private String studentTeacher;
	private String parentsName;
	private String parentsEmail;
	private String parentsContact;
	private String regID;
	
	public Parents(String studentid, String parentsName, String parentsEmail, String parentsContact, String regID) {
		super();
		this.studentid = studentid;
		this.parentsName = parentsName;
		this.parentsEmail = parentsEmail;
		this.parentsContact = parentsContact;
		this.regID = regID;
	}

	public String getStudentid() {
		return studentid;
	}
	
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	
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
	
	public String getStudentGrade() {
		return studentGrade;
	}
	
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	
	public String getStudentTeacher() {
		return studentTeacher;
	}
	
	public void setStudentTeacher(String studentTeacher) {
		this.studentTeacher = studentTeacher;
	}
	
	public String getParentsName() {
		return parentsName;
	}
	
	public void setParentsName(String parentsName) {
		this.parentsName = parentsName;
	}
	
	public String getParentsEmail() {
		return parentsEmail;
	}
	
	public void setParentsEmail(String parentsEmail) {
		this.parentsEmail = parentsEmail;
	}
	
	public String getParentsContact() {
		return parentsContact;
	}
	
	public void setParentsContact(String  parentsContact) {
		this.parentsContact = parentsContact;
	}
	
	public String getRegID() {
		return regID;
	}
	
}
