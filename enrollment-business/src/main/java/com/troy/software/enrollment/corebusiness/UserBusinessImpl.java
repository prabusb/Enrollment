/**
 * 
 */
package com.troy.software.enrollment.corebusiness;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.klm.troy.software.enrollment.transformer.UserDetailsDomainToPersistence;
import com.troy.software.enrollment.domain.model.UserDetails;
import com.troy.software.enrollment.persistence.repository.User;

/**
 * @author Prabu S B
 *
 */

@Component
public class UserBusinessImpl implements UserBusiness {
	
	@Autowired
	User user;
	
	public boolean isValidUser(UserDetails userDetails) {
		System.out.println("Username:" + userDetails.getUsername());			
		com.troy.software.enrollment.persistence.domain.UserDetails domainUserdetails = user.find(userDetails.getUsername());
		if (domainUserdetails != null && StringUtils.equals(userDetails.getUsername(), domainUserdetails.getUsername())) {
			if (StringUtils.equals(userDetails.getPassword(), domainUserdetails.getPassword())) {
				mapUserDetails(userDetails, domainUserdetails);
				return true;
			}
		}		
		return false;
	}
	
	public void registerUser(UserDetails userDetails) {
		UserDetailsDomainToPersistence userDetailsDomainToPersistence = new UserDetailsDomainToPersistence();		
		user.save(userDetailsDomainToPersistence.transform(userDetails));		
	}
	
	public UserDetails getUserDetails(String rollNumber) {
		System.out.println("rollNumber" + rollNumber);	
		UserDetails userDetails = new UserDetails();
		com.troy.software.enrollment.persistence.domain.UserDetails domainUserdetails = user.getUserDetails(rollNumber);
		mapUserDetails(userDetails, domainUserdetails);
		return userDetails;
	}
	
	private void mapUserDetails(UserDetails userDetails, com.troy.software.enrollment.persistence.domain.UserDetails domainUserdetails) {
		userDetails.setCollege(domainUserdetails.getCollege());
		userDetails.setDateOfBirth(domainUserdetails.getDateOfBirth());
		userDetails.setDepartMent(domainUserdetails.getDepartMent());
		userDetails.setEmailId(domainUserdetails.getEmailId());
		userDetails.setFirstName(domainUserdetails.getFirstName());
		userDetails.setLastName(domainUserdetails.getLastName());
		userDetails.setYearOfJoin(domainUserdetails.getYearOfJoin());
		userDetails.setRollNumber(domainUserdetails.getRollNumber());
		userDetails.setUsername(domainUserdetails.getUsername());
		userDetails.setPassword(domainUserdetails.getPassword());
	}

}
