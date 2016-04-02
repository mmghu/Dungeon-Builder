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
	
	protected int currX, currY;
	
	// accessors
	public String getName(){return name;}
	
	public double getHealth(){return health;}
	public double getMaxHealth(){return maxHealth;}
	
	public double getAttack(){return attack;}
	public double getDefense(){return defense;}
	
	public int getMovement(){return movement;}
	
	public int getCurrX(){return currX;}
	public int getCurrY(){return currY;}
	
	// mutators
	public void setName(String n){name = n;}
	
	public void setHealth(double h){health = h;}
	public void setMaxHealth(double h){maxHealth = h;}
	
	public void setAttack(double a){attack = a;}
	public void setDefense(double d){defense = d;}
	
	public void setMovement(int m){movement = m;}
	
	public void setCurrX(int x){currX = x;}
	public void setCurrY(int y){currY = y;}
	
	// methods
	public void desiredColor(Graphics g){
		g.setColor(Color.GREEN);
	}
	
	public void drawUnit(Graphics g, int xOrigin, int yOrigin, int xCoord, int yCoord, int mult){
		desiredColor(g);
		g.fillRect(xOrigin + (xCoord) * mult + 1, yOrigin + (yCoord) * mult + 1, mult - 1, mult - 1);
		
		// update current location
		currX = (xOrigin + (xCoord) * mult + 1);
		currY = (yOrigin + (yCoord) * mult + 1);
	}
	
	public void undrawUnit(Graphics g, int xOrigin, int yOrigin, int mult){
		g.setColor(Color.WHITE);
		g.fillRect(currX, currY, mult - 1, mult - 1);
		
	}
	
	public void moveUnit(Graphics g, int xOrigin, int yOrigin, int xCoord, int yCoord, int mult){
		undrawUnit(g, xOrigin, yOrigin, mult);
		drawUnit(g, xOrigin, yOrigin, xCoord, yCoord, mult);
	}
	
} // end abstract class
