package com.example.demo;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class StudentController {

private StudentService studentService;
	
	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
		studentService.save(student);
		return "Student added successfully";
	}

	@PutMapping("/student/{id}")
	public String modify(@RequestBody Student Student) {
		studentService.modify(Student);
		return "Student updated successfully";
	}

	@DeleteMapping("/student/{id}")
	public String deleteById(int id) {
		studentService.deleteBy(id);
		return "Student deleted successfully";
	}

	@GetMapping("/student/{id}")
	public Student selectById(@PathVariable int id) {
		return studentService.selectById(id);
	}

	@GetMapping("/student")
	public List<Student> selectAllStudents() {
		return studentService.selectAll();
	}
	@GetMapping("/student")
	public List<Student> getAllPaginatedAndSorted(@RequestParam int pageNo,@RequestParam int sizeSize,@RequestParam String field){
		return studentService.getAllPaginatedAndSorted(pageNo, sizeSize, field);
	}
}
