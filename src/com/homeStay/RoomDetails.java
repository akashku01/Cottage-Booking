package com.homeStay;

public class RoomDetails implements RoomBillComponent {
	private int billId;
	private String customerName;
	private String typeOfRoom;
	private int noOfExtraPersons;
	private int noOfDaysOfStay;
	private static int counter = 1;

	RoomDetails(String a, String b, int c, int d) {
		this.customerName = a;
		this.typeOfRoom = b;
		this.noOfExtraPersons = c;
		this.noOfDaysOfStay = d;
		billId = 100+counter;
		this.counter +=1;
	}

	public int getBillId() {
		return billId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getTypeOfRoom() {
		return typeOfRoom;
	}

	public int getNoOfExtraPersons() {
		return noOfExtraPersons;
	}

	public int getNoOfDaysOfStay() {
		return noOfDaysOfStay;
	}

	public boolean validateNoOfDaysOfStay() {
		if (noOfDaysOfStay >= 1 && noOfDaysOfStay <= 15) {
			return true;
		} else {
			System.out.println("invalid no of days entered");
			return false;
		}

	}

	public boolean validateNoOfExtraPerson() {
		if (noOfExtraPersons > 2) {
			System.out.println("more than two extra persons are not allowed");
			return false;

		} else {
			return true;
		}

	}

	public boolean validTypeOfRoom() {
		if ("STANDARD".equalsIgnoreCase(typeOfRoom) || "DELUXE".equalsIgnoreCase(typeOfRoom)
				|| "COTTAGE".equalsIgnoreCase(typeOfRoom)) {
			return true;
		} else {
			System.out.println("invalid input");
			return false;
		}

	}

	@Override
	public float calculateBill() {
		float baseFare = 0;
		float totalBill = 0;
		if (validTypeOfRoom() &&
				validateNoOfDaysOfStay() &&
				validateNoOfExtraPerson()) {
			
			
			
			if(typeOfRoom.equalsIgnoreCase("STANDARD")) {
				baseFare=2500;
				
			}
			else if(typeOfRoom.equalsIgnoreCase("DELUXE")) {
				baseFare=3500;
			}
			else if(typeOfRoom.equalsIgnoreCase("COTTAGE")) {
				baseFare=5500;
			}
			
			
			totalBill = (float) ((noOfDaysOfStay * baseFare) + 
					(getNoOfDaysOfStay() * FOOD_CHARGE) +
					(EXTRA_PERSON_CHARGE * getNoOfExtraPersons()));
			 
			totalBill= totalBill+(totalBill*12/100);
			
			
			
			return totalBill;
			
		}
		else {
			System.out.println("Provided details Failed to verify");
			return totalBill;
		}
		

	}
	

}
