/**
 * 
 */
package com.troy.software.enrollment.validator;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.troy.software.enrollment.domain.model.UserDetails;

/**
 * @author Prabu S B
 *
 */
@Component
public class UserDetailsValidator {
	
	/**
	 * 
	 * @param userDetails
	 * @param result
	 */
	public void validateLoginDetails(UserDetails userDetails, BindingResult result) {
		if (userDetails != null && (userDetails.getUsername() == null || userDetails.getUsername().length() <= 0)) {
			ObjectError error = new ObjectError("userDetails.username", "Username can't be empty");
			result.addError(error);
		}
		if (userDetails != null && (userDetails.getPassword() == null || userDetails.getPassword().length() <= 0)) {
			ObjectError error = new ObjectError("userDetails.password", "Password can't be empty");
			result.addError(error);
		}
	}
	
	/**
	 * 
	 * @param userDetails
	 * @param result
	 */
	public void validateRegisterUser(UserDetails userDetails, BindingResult result) {
		if (null != userDetails) {
			if (StringUtils.isEmpty(userDetails.getUsername())) {
				ObjectError error = new ObjectError("userDetails.username", "UserName can't be empty");
				result.addError(error);
			}
			if (StringUtils.isEmpty(userDetails.getPassword())) {
				ObjectError error = new ObjectError("userDetails.password", "Password can't be empty");
				result.addError(error);
			}
			if (StringUtils.isEmpty(userDetails.getConfirmPassword())) {
				ObjectError error = new ObjectError("userDetails.confirmPassword", "ConfirmPassword can't be empty");
				result.addError(error);
			}
			if (StringUtils.isNotEmpty(userDetails.getPassword()) && StringUtils.isNotEmpty(userDetails.getConfirmPassword())
					&& !StringUtils.equals(userDetails.getPassword(), userDetails.getConfirmPassword())) {
				ObjectError error = new ObjectError("userDetails.password", "Password & ConfirmPassword are not equal");
				result.addError(error);
			}
			if (StringUtils.isEmpty(userDetails.getRollNumber())) {
				ObjectError error = new ObjectError("userDetails.rollNumber", "RollNumber can't be empty");
				result.addError(error);
			}
			if (StringUtils.isEmpty(userDetails.getFirstName())) {
				ObjectError error = new ObjectError("userDetails.firstName", "FirstName can't be empty");
				result.addError(error);
			}
			if (StringUtils.isEmpty(userDetails.getLastName())) {
				ObjectError error = new ObjectError("userDetails.lastName", "LastName can't be empty");
				result.addError(error);
			}
			if (StringUtils.isEmpty(userDetails.getDepartMent())) {
				ObjectError error = new ObjectError("userDetails.departMent", "DepartMent can't be empty");
				result.addError(error);
			}
			if (StringUtils.isEmpty(userDetails.getDateOfBirth())) {
				ObjectError error = new ObjectError("userDetails.dateOfBirth", "DateOfBirth can't be empty");
				result.addError(error);
			}
			if (StringUtils.isEmpty(userDetails.getEmailId())) {
				ObjectError error = new ObjectError("userDetails.emailId", "EmailId can't be empty");
				result.addError(error);
			}
			if (StringUtils.isEmpty(userDetails.getCollege())) {
				ObjectError error = new ObjectError("userDetails.college", "College Name can't be empty");
				result.addError(error);
			}
			if (StringUtils.isEmpty(userDetails.getYearOfJoin())) {
				ObjectError error = new ObjectError("userDetails.yearOfJoin", "YearOfJoin Name can't be empty");
				result.addError(error);
			}
		} else {
			ObjectError error = new ObjectError("userDetails", "User Details are missing");
			result.addError(error);
		}
	}

}
