package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import service.TestServiceI;
import entity.Student;

@Controller
@EnableAutoConfiguration
@ComponentScan("service")
public class SimpleController {
	@Autowired(required=true)
	public TestServiceI testServiceI;
	
	@RequestMapping(value="/showstu",method=RequestMethod.GET)
	 @ResponseBody
	public  Student view(){
		Student stu = new Student(testServiceI.test(),"zhangjun075@pingan.com.cn");
		return stu;
	}
	@RequestMapping(value="/testjsp",method=RequestMethod.GET)
	public ModelAndView jspTest(){
		return new ModelAndView("welcome");
	}
}
