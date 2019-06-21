package com.momo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momo.inter.StudentInterface;
import com.momo.pojo.StudentPojo;

@RestController
public class StudentController {

	@Autowired
	private StudentInterface studentInterface;

	@GetMapping("/stu")
	public List<StudentPojo> selectAll() {

		return studentInterface.getall();
	}
}
