package model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import backend.model.Department;
import backend.model.Student;

public class StudentTest {

	public static void main(String[] args) throws IOException {
		Student stu = new Student();
		stu.setName("Kanika");
		stu.setId(1);
		stu.setYearOfEnrollment(2005);
		
		Department dept = new Department();
		dept.setName("Science");
		dept.setCode(123);
		stu.setDept(dept);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String stuStr = objectMapper.writeValueAsString(stu);
		System.out.println(stuStr);
		
		Student dept1 = objectMapper.readValue(stuStr, Student.class); 
		
		System.out.println(dept1.getName());
		System.out.println(dept1.getId());
	}

}
