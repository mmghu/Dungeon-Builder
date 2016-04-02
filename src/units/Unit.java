package units;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import com.sun.javafx.geom.Rectangle;

public abstract class Unit {
	
	// member variables
	protected String name;
	protected double health, maxHealth;
	protected double attack, defense;
	protected int movement;
	
	// accessors
	public String getName(){return name;}
	
	public double getHealth(){return health;}
	public double getMaxHealth(){return maxHealth;}
	
	public double getAttack(){return attack;}
	public double getDefense(){return defense;}
	
	public int getMovement(){return movement;}
	
	// mutators
	public void setName(String n){name = n;}
	
	public void setHealth(double h){health = h;}
	public void setMaxHealth(double h){maxHealth = h;}
	
	public void setAttack(double a){attack = a;}
	public void setDefense(double d){defense = d;}
	
	public void setMovement(int m){movement = m;}
	
	// methods
	public void drawUnit(Graphics g, int xOrigin, int yOrigin, int xCoord, int yCoord, int mult){
		g.setColor(Color.RED);
		g.fillRect(xOrigin + (xCoord - 1) * mult + 1, yOrigin + (yCoord - 1) * mult + 1, mult - 1, mult - 1);
	}
	
} // end abstract class
