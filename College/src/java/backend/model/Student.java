package model;

public class Student {
	int yearOfEnrollment;
	int id;
	String studentName;
	Student student;
	
	public Student(){
		new Student();
	}
	public int getYearOfEnrollment() {
		return yearOfEnrollment;
	}
	public void setYearOfEnrollment(int yearOfEnrollment) {
		this.yearOfEnrollment = yearOfEnrollment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	Department dept;
}
