package model;

import backend.model.Department;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DepartmentTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Department dept = new Department();
		dept.setName("Science");
		dept.setCode(123);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String deptStr = objectMapper.writeValueAsString(dept);
		System.out.println(deptStr);
		
		Department dept1 = objectMapper.readValue(deptStr, Department.class); 
		
		System.out.println(dept1.getName());
		System.out.println(dept1.getCode());
	}

}
