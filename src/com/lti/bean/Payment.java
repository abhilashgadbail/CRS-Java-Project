package com.lti.bean;

public class Payment {

	private int sId;
	private int transactionId;
	private float amount;
	private boolean status;

	public Payment() {

	}

	public Payment(int sId, int refId, float amount, boolean status) {

		this.sId = sId;
		this.transactionId = refId;
		this.amount = amount;
		this.status = status;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public int getRefId() {
		return transactionId;
	}

	public void setRefId(int refId) {
		this.transactionId = refId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
