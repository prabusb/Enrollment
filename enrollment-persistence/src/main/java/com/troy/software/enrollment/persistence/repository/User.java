/**
 * 
 */
package com.troy.software.enrollment.persistence.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.troy.software.enrollment.persistence.domain.UserDetails;

/**
 * @author Prabu S B
 *
 */
@Component
public interface User {
	
	void add(UserDetails book);
	
	void save(UserDetails book);
	
	UserDetails find(String username);
	
	UserDetails getUserDetails(String rollNumber);
	
	void remove(String username);
	
	List<UserDetails> findAll();

}
