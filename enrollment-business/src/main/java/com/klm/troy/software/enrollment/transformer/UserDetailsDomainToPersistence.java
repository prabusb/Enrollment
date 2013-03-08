/**
 * 
 */
package com.klm.troy.software.enrollment.transformer;

import com.troy.software.enrollment.persistence.domain.UserDetails;

/**
 * @author Prabu S B
 *
 */
public class UserDetailsDomainToPersistence {
	
	public UserDetails transform(com.troy.software.enrollment.domain.model.UserDetails userDetails) {
		UserDetails persistenceUserDetails = new UserDetails();
		persistenceUserDetails.setCollege(userDetails.getCollege());
		persistenceUserDetails.setDateOfBirth(userDetails.getDateOfBirth());
		persistenceUserDetails.setDepartMent(userDetails.getDepartMent());
		persistenceUserDetails.setEmailId(userDetails.getEmailId());
		persistenceUserDetails.setFirstName(userDetails.getFirstName());
		persistenceUserDetails.setLastName(userDetails.getLastName());
		persistenceUserDetails.setPassword(userDetails.getPassword());
		persistenceUserDetails.setUsername(userDetails.getUsername());
		persistenceUserDetails.setYearOfJoin(userDetails.getYearOfJoin());
		persistenceUserDetails.setRollNumber(userDetails.getRollNumber());
		return persistenceUserDetails;
	}

}
