package com.lti.bean;

public class NetBanking {

	private String modeOftransfer;
	private int accountNumber;
	private String ifscCode;

	public String getModeOftransfer() {
		return modeOftransfer;
	}

	public void setModeOftransfer(String modeOftransfer) {
		this.modeOftransfer = modeOftransfer;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public NetBanking(String modeOftransfer, int accountNumber, String ifscCode) {

		this.modeOftransfer = modeOftransfer;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
	}
	

	public NetBanking() {

	}


	@Override
	public String toString() {
		return "NetBanking [modeOftransfer=" + modeOftransfer + ", accountNumber=" + accountNumber + ", ifscCode="
				+ ifscCode + "]";
	}

}
