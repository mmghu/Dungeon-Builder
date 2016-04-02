package com.dungeonbuilder.units;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy extends Unit{

	// constructor
	public Enemy(String n, double hp, double atk, double def, int mov){
		super.name = n;
		super.health = hp;
		super.maxHealth = hp;
		super.attack = atk;
		super.defense = def;
		super.movement = mov;
	}
	
	// methods
	@Override
	public void desiredColor(Graphics g){
		g.setColor(Color.RED);
	}
	
} // end class
