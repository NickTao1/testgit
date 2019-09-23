package com.hongmeng.springboot.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.hongmeng.springboot.pojo.MainPojo;

@Repository
public class MainDao {
	
	static Map<Integer,MainPojo> map = Collections.synchronizedMap(new HashMap());
	
	public void save(int id, String name) throws Exception {
		MainPojo mp = new MainPojo();
		mp.setId(id);
		mp.setName(name);
		if(map.get(id)!= null) {
			throw new Exception("数据已经存在");
		}else {
			
			map.put(id, mp);
		}
	}

	public List<MainPojo> get() {
		
		
		
		return new ArrayList<>(map.values());
		
	}

}
