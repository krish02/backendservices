/**
 * 
 */
package com.my.own.examples.dto;

import java.util.Date;



/**
 * @author Krish S
 *
 */
public class Instruction {

	private int instructionId;
	
	private String region;
	
	private String deal;
	
	private String destinationAccount;
	
	private String requestedStatus;
	
	private double requestedPar;
	
	private double settledPar;
	
	private String status;
	
	private Date updateTime;

	/**
	 * @return the instructionId
	 */
	public int getInstructionId() {
		return instructionId;
	}

	/**
	 * @param instructionId the instructionId to set
	 */
	public void setInstructionId(int instructionId) {
		this.instructionId = instructionId;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the deal
	 */
	public String getDeal() {
		return deal;
	}

	/**
	 * @param deal the deal to set
	 */
	public void setDeal(String deal) {
		this.deal = deal;
	}

	/**
	 * @return the destinationAccount
	 */
	public String getDestinationAccount() {
		return destinationAccount;
	}

	/**
	 * @param destinationAccount the destinationAccount to set
	 */
	public void setDestinationAccount(String destinationAccount) {
		this.destinationAccount = destinationAccount;
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
	 * @return the requestedPar
	 */
	public double getRequestedPar() {
		return requestedPar;
	}

	/**
	 * @param requestedPar the requestedPar to set
	 */
	public void setRequestedPar(double requestedPar) {
		this.requestedPar = requestedPar;
	}

	/**
	 * @return the settledPar
	 */
	public double getSettledPar() {
		return settledPar;
	}

	/**
	 * @param settledPar the settledPar to set
	 */
	public void setSettledPar(double settledPar) {
		this.settledPar = settledPar;
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

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return new Date();
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	}
