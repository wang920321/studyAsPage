/**
 * 
 */
package com.study.asPage.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String login(@RequestParam("username") String username,
    		@RequestParam("password") String password,Model model)throws Exception{
    	User user=new User();
    	user.setUsername(username);
    	user.setPassword(password);
    	User userresult=service.loginByUserNameAndPassword(user);
    	if(userresult!=null){
    		model.addAttribute("user", userresult);
    		model.addAttribute("currentUser", userresult.getUsername());
    		return "redirect:main";
    	}
		return "error";
    	
    }
    @RequestMapping("/main")
    public String main(@RequestParam(value="currentPage",defaultValue="1",required=false)
    int currentPage,Model model){
    	model.addAttribute("pagemsg", service.findByPage(currentPage));
		return "main";
    	
    }
}
