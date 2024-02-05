package com.example.demo;

import java.util.List;

public interface StudentService {

	void save(Student Student);
	void modify(Student Student);
	void deleteBy(int id);
	Student selectById(int id);
	List<Student> selectAll();
	List<Student> getAllPaginatedAndSorted(int pageNO,int sizeSize,String fields);
}
