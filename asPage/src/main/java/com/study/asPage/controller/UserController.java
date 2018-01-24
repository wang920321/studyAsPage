/**
 * 
 */
package com.study.asPage.controller;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.asPage.entry.Student;
import com.study.asPage.entry.User;
import com.study.asPage.service.UserService;

/**
 * @author Administrator
 *
 */
@Controller
public class UserController {
    @Resource
    private UserService service;
    @RequestMapping("/login")
    public ModelAndView login(@RequestParam("username") String username,
    		@RequestParam("password") String password)throws Exception{
    	ModelAndView mav=new ModelAndView();
    	System.out.println(username);
    	User user=new User();
    	user.setUsername(username);
    	user.setPassword(password);
    	User userresult=service.loginByUserNameAndPassword(user);
    	if(userresult!=null){
    		/*model.addAttribute("user", userresult);
    		model.addAttribute("currentUser", userresult.getUsername());*/
    		mav.addObject("user", userresult);
    		mav.addObject("currentUser", userresult.getUsername());
    		mav.setViewName("redirect:main");
    		System.out.println(mav);
    		return mav;
    	}
    	mav.setViewName("error");
		return mav;
    	
    }
    @RequestMapping("/main")
    public String main(@RequestParam(value="currentPage",defaultValue="1",required=false)
    int currentPage,Model model){
    	model.addAttribute("pagemsg", service.findByPage(currentPage));
		return "main";
    	
    }
    @RequestMapping("/delete")
    public ModelAndView delete(@RequestParam("id") String id){
    	ModelAndView mav=new ModelAndView();
    	service.deleteStudent(Integer.valueOf(id));
    	mav.setViewName("redirect:main");
		return mav;
    	
    }
    @RequestMapping("/query")
    public String queryById(@RequestParam("id") Integer id,Model model){
    	Student student=service.selectById(id);
    /*	HttpSession session = request.getSession();
    	session.setAttribute("student", student);*/
    	model.addAttribute("student", student);
		return "update";
    	
    }
    @RequestMapping("/update")
    public String update(Model model,HttpServletRequest request) throws UnsupportedEncodingException{
    	Student student=new Student();
    	if(request.getParameter("sId")!=null&&!request.getParameter("sId").equals("")){
    	String sId=new String(request.getParameter("sId").getBytes("ISO-8859-1"), "UTF-8");  
    	student.setsId(Integer.valueOf(sId));
    	}
    	String studentName = new String(request.getParameter("studentName").getBytes("ISO-8859-1"), "UTF-8"); 
    	String age = new String(request.getParameter("age").getBytes("ISO-8859-1"), "UTF-8"); 
    	System.out.println(studentName);
    	System.out.println(age);
		student.setStudentName(studentName);
		student.setAge(Integer.valueOf(age));
		if(student.getsId()==null){
			service.addStudent(student);
		}else{
			service.update(student);
		}
    	return "redirect:main";
    	
    }
    @RequestMapping("/tan")
    public String tan(){
    	
    	return "update";
    }
    
}
