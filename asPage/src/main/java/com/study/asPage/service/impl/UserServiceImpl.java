/**
 * 
 */
package com.study.asPage.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.study.asPage.dao.UserDao;
import com.study.asPage.entry.PageBean;
import com.study.asPage.entry.Student;
import com.study.asPage.entry.User;
import com.study.asPage.service.UserService;

/**
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
	/* (non-Javadoc)
	 * @see com.study.asPage.service.UserService#loginByUserNameAndPassword(com.study.asPage.entry.User)
	 * @param user
	 * @return
	 */
	public User loginByUserNameAndPassword(User user) {
		return userDao.loginByUserNameAndPassword(user);
	}
	/* (non-Javadoc)
	 * @see com.study.asPage.service.UserService#findByPage(int)
	 * @param currentPage
	 * @return
	 */
	public PageBean<Student> findByPage(int currentPage) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		PageBean<Student> pageBean=new PageBean<Student>();
		pageBean.setCurrPage(currentPage);
		pageBean.setPageSize(3);
		int totalCount=userDao.selectCount();
		pageBean.setTotalCount(totalCount);
		Double tc=Double.valueOf(totalCount);
		Double num= Math.ceil(tc/3);
		System.out.println(totalCount/3);
		System.out.println(num);
		pageBean.setTotalPage(num.intValue());
		map.put("start", (currentPage-1)*3);
		map.put("pageSize", 3);
		List<Student> list=userDao.findByPage(map);
		pageBean.setLists(list);
		return pageBean;
	}

}
