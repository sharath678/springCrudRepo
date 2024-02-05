package com.example.demo;

import java.awt.print.Pageable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.*;

public class StudentServiceImpl implements StudentService{


	@Autowired
	private StudentDao stu;
	@Override
	public void save(Student Student) {
		// TODO Auto-generated method stub

		stu.save(Student);
		
	}

	@Override
	public void modify(Student Student) {
		// TODO Auto-generated method stub

		stu.save(Student);
	}

	@Override
	public void deleteBy(int id) {
		// TODO Auto-generated method stub

		stu.deleteById(id);
	}

	@Override
	public Student selectById(int id) {
		// TODO Auto-generated method stub
		Optional<Student> opt=stu.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Student> selectAll() {
		// TODO Auto-generated method stub
		Iterable<Student> itr=stu.findAll();
		List<Student> lst=new ArrayList<Student>();
		itr.forEach(ele->lst.add(ele));
		return lst;
	}

	@Override
	public List<Student> getAllPaginatedAndSorted(int pageNO, int sizeSize, String fields) {
		
		//Pageable p=PageRequest.of(pageNO, sizeSize,Direction.ASC,fields);
		return null;
	}

	

}
