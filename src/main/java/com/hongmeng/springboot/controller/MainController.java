package com.hongmeng.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hongmeng.springboot.service.MainService;

@Controller

@RequestMapping("/user")
public class MainController {
	@Autowired
	MainService mainservice;
	@RequestMapping("/list")
	//@ResponseBody
	public String t(ModelMap map){
		Map<String,String> map1 = new HashMap<>();
		
		map1.put("h1", "h2");
		map.addAttribute(map1);
		//map.addAttribute("name", "h1");
//		map.put("h2", "h2");
//		map.put("h3", "h3");
		return "list";
	}
	@RequestMapping("/add")
	public String add(@RequestParam("id") int id,@RequestParam("name")String name,ModelMap map)  {
		
		String s = mainservice.add(id,name);
		
		
		return "list";
		
	}
	@RequestMapping("/success")
	//@ResponseBody
	public String add(ModelMap map)  {
		
		map.addAttribute("list", mainservice.get());
		
		
		return "success";
		
	}

}
