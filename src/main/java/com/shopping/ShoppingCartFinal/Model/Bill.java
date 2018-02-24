package com.shopping.ShoppingCartFinal.Model;

public class Bill {
	private Integer billableId;
	private String billableName;
	private String billableAddress;

	public Integer getBillableId() {
		return billableId;
	}

	public void setBillableId(Integer billableId) {
		this.billableId = billableId;
	}

	public String getBillableName() {
		return billableName;
	}

	public void setBillableName(String billableName) {
		this.billableName = billableName;
	}

	public String getBillableAddress() {
		return billableAddress;
	}

	public void setBillableAddress(String billableAddress) {
		this.billableAddress = billableAddress;
	}

}
