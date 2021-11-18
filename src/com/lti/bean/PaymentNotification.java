/**
 * 
 */
package com.lti.bean;

import java.util.Date;

/**
 * @author HP
 *
 */
public class PaymentNotification {
	
	private int sId;
	private int transactionId;
	private int notifyId;
	private String notifyMsg;
	
	
	
	public PaymentNotification() {
	
		// TODO Auto-generated constructor stub
	}
	
	public PaymentNotification(int sId, int transactionId, int notifyId, String notifyMsg) {
	
		this.sId = sId;
		this.transactionId = transactionId;
		this.notifyId = notifyId;
		this.notifyMsg = notifyMsg;
	}



	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getNotifyId() {
		return notifyId;
	}
	public void setNotifyId(int notifyId) {
		this.notifyId = notifyId;
	}
	public String getNotifyMsg() {
		return notifyMsg;
	}
	public void setNotifyMsg(String notifyMsg) {
		this.notifyMsg = notifyMsg;
	}
	
	
	

}
