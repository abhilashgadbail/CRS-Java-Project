package com.lti.bean;

public class Cheque {
	private String bankName;
	private long chequeNumber;
	
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the chequeNumber
	 */
	public long getChequeNumber() {
		return chequeNumber;
	}

	/**
	 * @param chequeNumber the chequeNumber to set
	 */
	public void setChequeNumber(long chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public Cheque() {
	}

	public Cheque(String bankName, long chequeNumber) {
		this.bankName = bankName;
		this.chequeNumber = chequeNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cheque [bankName=" + bankName + ", chequeNumber="
				+ chequeNumber + "]";
	}
	
	
}