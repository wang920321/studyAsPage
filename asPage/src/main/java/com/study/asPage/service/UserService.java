/**
 * 
 */
package com.study.asPage.service;

import com.study.asPage.entry.PageBean;
import com.study.asPage.entry.Student;
import com.study.asPage.entry.User;

/**
 * @author Administrator
 *
 */
public interface UserService {
    User loginByUserNameAndPassword(User user);
    PageBean<?> findByPage(int currentPage);
    void deleteStudent(Integer sId);
   Student selectById(Integer sId);
   void update(Student student);
   void addStudent(Student student);
}
