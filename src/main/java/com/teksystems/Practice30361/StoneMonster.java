package com.teksystems.Practice30361;

public class StoneMonster extends Monster {
	public StoneMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with stones!";
	}
	
	@Override
	public String toString() {
		return "This is a stone Monster";
	}
}
