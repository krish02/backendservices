/**
 * 
 */
package com.my.own.examples.dto;

import java.util.List;

/**
 * @author Krish S
 *
 */
public class Message {
	
	private List<Instruction> instructions;
	
	private String system;
	
	private int id;
	
	private String destinationSystemId;
	
	private String accountNumber;
	
	private String requestedStatus;
	
	private String currentStatus;

	/**
	 * @return the instructions
	 */
	public List<Instruction> getInstructions() {
		return instructions;
	}

	/**
	 * @param instructions the instructions to set
	 */
	public void setInstructions(List<Instruction> instructions) {
		this.instructions = instructions;
	}

	/**
	 * @return the system
	 */
	public String getSystem() {
		return system;
	}

	/**
	 * @param system the system to set
	 */
	public void setSystem(String system) {
		this.system = system;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the requestedStatus
	 */
	public String getRequestedStatus() {
		return requestedStatus;
	}

	/**
	 * @param requestedStatus the requestedStatus to set
	 */
	public void setRequestedStatus(String requestedStatus) {
		this.requestedStatus = requestedStatus;
	}

	/**
	 * @return the currentStatus
	 */
	public String getCurrentStatus() {
		return currentStatus;
	}

	/**
	 * @param currentStatus the currentStatus to set
	 */
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	/**
	 * @return the destinationSystemId
	 */
	public String getDestinationSystemId() {
		return destinationSystemId;
	}

	/**
	 * @param destinationSystemId the destinationSystemId to set
	 */
	public void setDestinationSystemId(String destinationSystemId) {
		this.destinationSystemId = destinationSystemId;
	}

}
