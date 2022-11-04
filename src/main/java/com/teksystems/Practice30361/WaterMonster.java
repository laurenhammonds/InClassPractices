package com.teksystems.Practice30361;

public class WaterMonster extends Monster {
	public WaterMonster(String name) {
		super(name);
	}
 @Override
 public String attack() {
	 return "Attack with water!";
 }
 
 @Override
 public String toString() {
	 return "This is a water Monster";
 }
 
}
