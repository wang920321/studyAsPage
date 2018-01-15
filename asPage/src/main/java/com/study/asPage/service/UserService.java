/**
 * 
 */
package com.study.asPage.service;

import com.study.asPage.entry.PageBean;
import com.study.asPage.entry.User;

/**
 * @author Administrator
 *
 */
public interface UserService {
    User loginByUserNameAndPassword(User user);
    PageBean<?> findByPage(int currentPage);
    
}
