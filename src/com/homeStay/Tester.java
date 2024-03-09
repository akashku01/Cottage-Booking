package com.homeStay;

public class Tester {
	
	public static void main(String[] args) {
		
		RoomDetails details=  new RoomDetails("Akash","standard", 0, 2); 
		
		float totalBill = details.calculateBill();
		
		System.out.println("BillId : " + details.getBillId());
		System.out.println("Customer Name: "+ details.getCustomerName());
		System.out.println("No. of days of stay: "+details.getNoOfDaysOfStay());
		System.out.println("Total Bill: " + totalBill);
		
		RoomDetails details2=  new RoomDetails("Behera","deluxe", 1, 2); 
		
		float totalBill2 = details2.calculateBill();
		
		System.out.println("BillId : " + details2.getBillId());
		System.out.println("Customer Name: "+ details2.getCustomerName());
		System.out.println("No. of days of stay: "+details2.getNoOfDaysOfStay());
		System.out.println("Total Bill: " + totalBill2);
	}
	 
	 
}
