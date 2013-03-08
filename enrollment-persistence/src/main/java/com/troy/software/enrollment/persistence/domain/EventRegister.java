/**
 * 
 */
package com.troy.software.enrollment.persistence.domain;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Prabu S B
 *
 */

@Document
public class EventRegister {
	
	private String eventName;
	
	private boolean soloEvent;
	
	private int maxAllowedMembers;
	
	private String status;

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * @return the soloEvent
	 */
	public boolean isSoloEvent() {
		return soloEvent;
	}

	/**
	 * @param soloEvent the soloEvent to set
	 */
	public void setSoloEvent(boolean soloEvent) {
		this.soloEvent = soloEvent;
	}

	/**
	 * @return the maxAllowedMembers
	 */
	public int getMaxAllowedMembers() {
		return maxAllowedMembers;
	}

	/**
	 * @param maxAllowedMembers the maxAllowedMembers to set
	 */
	public void setMaxAllowedMembers(int maxAllowedMembers) {
		this.maxAllowedMembers = maxAllowedMembers;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
