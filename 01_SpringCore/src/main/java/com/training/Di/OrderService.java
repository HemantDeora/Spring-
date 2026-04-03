package com.training.Di;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	private Payment p;
	

	public OrderService(Payment p) {
		super();
		this.p = p;
	}
	
	public Payment getP(Payment p) {
		return p;
	}
	
	@Override
	public String toString() {
		return "OrderService [p=" + p + "]";
	}
	
     

}
