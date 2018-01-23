/**
 * 
 */
package com.study.asPage.dao;

import java.util.List;
import java.util.Map;

import com.study.asPage.entry.Student;
import com.study.asPage.entry.User;

/**
 * @author Administrator
 *
 */
public interface UserDao {
	User loginByUserNameAndPassword(User user);
	List<Student> findByPage(Map<String, Integer> map);
	int  selectCount();
	void deleteStudent(Integer id);
	 void updateStatu(Integer sId);
	 Student selectById(Integer sId);
	 void update(Student student);
}
