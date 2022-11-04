package com.teksystems.Practice30361;

public class Monster {
	private String name;
	
	   public Monster (String name) {
		   this.name = name;
	   }
	   
	   public Monster() {
	   } 

	 public void setAttack(String attack) {
	       this.name = attack;
	   }

	   public String attack() {
	       return "!^_&^$@+%$* I don't know how to attack!";
	   }

	   @Override
	   public String toString() {
		   return "This is a monster of some sorts?";
	   }
	       
}
