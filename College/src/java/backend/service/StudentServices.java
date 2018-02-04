package service;

import model.Department;
import model.Student;

public class StudentServices {
	Student object = new Student();

	public void addStudent(String name, int id, int yearoOfEnrolment, Department dept){
		Student newObject = new Student();
		newObject.setStudentName(name);
		newObject.setId(12);
		newObject.setYearOfEnrollment(yearoOfEnrolment);
		newObject.setDept(dept);
	}

	public void editDetails(String newName, Department newDept, int year){
		object.setStudentName(newName);
		object.setDept(newDept);
		object.setYearOfEnrollment(year);
	}

	public void deleteStudent(int id){
		if(object.getId() == id){
			object.setDept(null);
			object.setStudentName("");
			object.setYearOfEnrollment(0);
			object.setId(0);
		}
	} 
}
