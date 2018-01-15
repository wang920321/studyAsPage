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
		int pageSize=3;
		pageBean.setPageSize(pageSize);
		int totalCount=userDao.selectCount();
		pageBean.setTotalCount(totalCount);
		//这里用到的向上取整，不能两个数都为int型，不然有可能不能显示最后一页的数据
		Double tc=Double.valueOf(totalCount);
		Double num= Math.ceil(tc/pageSize);
		pageBean.setTotalPage(num.intValue());
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		List<Student> list=userDao.findByPage(map);
		pageBean.setLists(list);
		return pageBean;
	}

}
