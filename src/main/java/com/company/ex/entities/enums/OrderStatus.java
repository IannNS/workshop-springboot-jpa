package com.company.ex.entities.enums;

public enum OrderStatus {

	WAITTING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	// Implement code ID for enumeration
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	// Makes it accessible 
	public int getCode() {
		return code;
	}
	
	// 'static' so it works without instantiation
	public static OrderStatus valueOf(int code) {
		// return enum value through enum code ID
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid order status code");
	}
}
