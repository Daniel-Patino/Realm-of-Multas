package com.PatinoDaniel.RoM;

/**
 * A Player is the character the player controls, defined are his characteristics...
 * @author Dsp02_000
 *
 */
public class Player {
	
	private int health = 1;
	private int gold = 0;
	
	/**
	 * Define the players health, gold. The difficulty must be a number between x - y and multiplies
	 * the players attack and defense therefore higher difficulties must be lower numbers
	 * 
	 * @param startingHealth
	 * @param startingGold
	 * @param difficulty
	 */
	public Player(int startingHealth, int startingGold){
		this.health = startingHealth;
		this.gold = startingGold;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public void setGold(int gold){
		this.gold = gold;
	}
	
	public int getHealth(){
		return health;
	}
	
	public int getGold(){
		return gold;
	}
}
