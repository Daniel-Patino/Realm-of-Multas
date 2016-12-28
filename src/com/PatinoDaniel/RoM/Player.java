package com.PatinoDaniel.RoM;

/**
 * A Player is the character the player controls, defined are his characteristics...
 * @author Dsp02_000
 *
 */
public class Player {
	
	public int health = 1;
	public int gold = 0;
	public int attack = 1;
	public int defense = 1;
	public int slaves = 0;
	public int prestige = 0;
	
	/**
	 * Define the players health, gold. The difficulty must be a number between x - y and multiplies
	 * the players attack and defense therefore higher difficulties must be lower numbers
	 * 
	 * @param startingHealth
	 * @param startingGold
	 * @param difficulty
	 */
	public Player(int startingHealth, int startingGold, int difficulty){
		this.health = startingHealth;
		this.gold = startingGold;
		this.attack = this.attack * difficulty;
		this.defense = this.defense * difficulty;
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
