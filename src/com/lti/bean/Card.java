package com.lti.bean;

public class Card {
	private long cardNumber;
	private String cardType;
	
	/**
	 * @return the cardNumber
	 */
	public long getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the cardType
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Card() {
	}

	public Card(int cardNumber, String cardType) {
		this.cardNumber = cardNumber;
		this.cardType = cardType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Card [cardNumber=" + cardNumber + ", cardType=" + cardType
				+ "]";
	}
	
	}

