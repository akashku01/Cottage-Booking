package com.homeStay;

public interface RoomBillComponent {
  public double TAX= 12;
  public double EXTRA_PERSON_CHARGE=500;
  public double FOOD_CHARGE=800;
  
  public float calculateBill();
  
}
