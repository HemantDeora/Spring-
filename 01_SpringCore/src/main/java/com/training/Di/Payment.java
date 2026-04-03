package com.training.Di;

public class Payment {
	
	private String mode;
	private String status;
	private String amount;
	
	public Payment(String mode, String status, String amount) {
		super();
		this.mode = mode;
		this.status = status;
		this.amount = amount;
	}
	
	public String getMode() {
		return mode;
	}
	
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getAmount() {
		return amount;
	}
	
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Payment [mode=" + mode + ", status=" + status + ", amount=" + amount + "]";
	}
	
	

}
