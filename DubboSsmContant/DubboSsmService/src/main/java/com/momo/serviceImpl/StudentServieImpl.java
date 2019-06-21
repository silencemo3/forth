package com.momo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momo.dao.StudentDao;
import com.momo.inter.StudentInterface;
import com.momo.pojo.StudentPojo;

@Service
public class StudentServieImpl implements StudentInterface {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<StudentPojo> getall() {
		
		return studentDao.getAll();
	}

}
