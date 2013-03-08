/**
 * 
 */
package com.troy.software.enrollment.domain.model;

/**
 * @author Prabu S B
 *
 */
public class UserDetails {
	
	private String username;
	
	private String password;
	
	private String confirmPassword;
	
	private String firstName;
	
	private String lastName;
	
	private String dateOfBirth;
	
	private String departMent;
	
	private String college;
	
	private String emailId;
	
	private String yearOfJoin;
	
	private boolean invalidUser;
	
	private String rollNumber;
	

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the departMent
	 */
	public String getDepartMent() {
		return departMent;
	}

	/**
	 * @param departMent the departMent to set
	 */
	public void setDepartMent(String departMent) {
		this.departMent = departMent;
	}

	/**
	 * @return the college
	 */
	public String getCollege() {
		return college;
	}

	/**
	 * @param college the college to set
	 */
	public void setCollege(String college) {
		this.college = college;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the yearOfJoin
	 */
	public String getYearOfJoin() {
		return yearOfJoin;
	}

	/**
	 * @param yearOfJoin the yearOfJoin to set
	 */
	public void setYearOfJoin(String yearOfJoin) {
		this.yearOfJoin = yearOfJoin;
	}

	/**
	 * @return the invalidUser
	 */
	public boolean getInvalidUser() {
		return invalidUser;
	}

	/**
	 * @param invalidUser the invalidUser to set
	 */
	public void setInvalidUser(boolean invalidUser) {
		this.invalidUser = invalidUser;
	}

	/**
	 * @return the rollNumber
	 */
	public String getRollNumber() {
		return rollNumber;
	}

	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

}
