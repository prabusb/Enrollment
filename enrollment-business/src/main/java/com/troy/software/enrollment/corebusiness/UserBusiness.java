/**
 * 
 */
package com.troy.software.enrollment.corebusiness;

import com.troy.software.enrollment.domain.model.UserDetails;

/**
 * @author Prabu S B
 *
 */
public interface UserBusiness {
	
	public boolean isValidUser(UserDetails userDetails);
	
	public void registerUser(UserDetails userDetails);
	
	public UserDetails getUserDetails(String rollNumber);

}
