package backend.model;


public class Student {
	
	private int yearOfEnrollment;
	private int id;
	private String name;
	private Department dept;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
}
