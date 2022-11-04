package com.teksystems.Practice30361;

public class FireMonster extends Monster {
	public FireMonster(String name) {
	       super(name);
	   }

	   @Override
	   public String attack() {
	       return "Attack with fire!";
	   }
	   
	   @Override
	   public String toString() {
	       return "This is a fire Monster";
	   }

}
