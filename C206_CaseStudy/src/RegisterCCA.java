/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Akmal
 * Student ID: 21033695
 * Class: C208-1B3B-W64F-FF
 * Date/Time created: Saturday 13-08-2022 19:38
 */

/**
 * @author 21033695
 *
 */
public class RegisterCCA {
	private String studentName;
	private String studentID;
	private String ccaName;
	
	public RegisterCCA(String studentID, String studentName, String ccaName) {
		this.studentName = studentName;
		this.studentID = studentID;
		this.ccaName = ccaName;
	}
	public String getStudentName() {
		  return studentName;
	}
	public String getStudentID() {
		  return studentID;
	}
	public String getCcaName() {
		  return ccaName;
	}  
	public void setStudentName(String studentName) {
		  this.studentName = studentName;
	} 
	public void setCcaName(String ccaName) {
		  this.ccaName = ccaName;
	}
	public void setStudentID(String studentID) {
		  this.studentID = studentID;
	}
}
