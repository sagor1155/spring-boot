package com.sagor.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	// using HttpRequest 
//	@RequestMapping("home")
//	public String home(HttpServletRequest req, HttpServletResponse res) {
//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
//		System.out.println("Hello " + name);
//		session.setAttribute("name", name);
//		return "home";
//	}
	
	// using ModelAndView
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name") String myname) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", myname);
//		mv.setViewName("home");
//		return mv;
//	}
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);	
		mv.setViewName("home");
		return mv;
	}
	
}
