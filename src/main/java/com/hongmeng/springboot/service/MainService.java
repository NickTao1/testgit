package com.hongmeng.springboot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hongmeng.springboot.dao.MainDao;
import com.hongmeng.springboot.pojo.MainPojo;

@Service
public class MainService {
	@Autowired
	MainDao maindao;

	public String add(int id, String name)  {
		try {
			maindao.save(id,name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<MainPojo> get() {
		return maindao.get();
		
	}

}
