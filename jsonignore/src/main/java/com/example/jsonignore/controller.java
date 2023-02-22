package com.example.jsonignore;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class controller {
	
	@RequestMapping("hello")
	public String display(HttpServletRequest req)
	{
		String name=req.getParameter("name");
		HttpSession session = req.getSession();
		session.setAttribute("displayName", name);
		
		return "NewFile1.jsp";
	}
	
}
//package com.example.demo.controller;
//
//import java.util.List;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//
////import com.example.demo.model.pojoclass;
//
//@Controller
//
//public class controller {
//	@GetMapping("/")
//public String info(){
////	return Arrays.asList(new pojoclass(1,"jo","IT"),new pojoclass(2,"ki","IT"));
//		return "NewFile1.jsp";
//}
//}
