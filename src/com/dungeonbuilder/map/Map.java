package com.dungeonbuilder.map;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;

import com.dungeonbuilder.units.Enemy;
import com.dungeonbuilder.units.Character;

public class Map {

	// member variables
	private String name;
	private Tile[][] tiles;
	
	private int xOrigin, yOrigin;
	private int multiplier;
	
	private ArrayList<Enemy> enemies;
	private ArrayList<Character> characters;
	
	// constructor
	public Map(String n, Tile[][] t){
		name = n;
		tiles = t;
		
		enemies = new ArrayList<Enemy>();
		characters = new ArrayList<Character>();
	}
	
	// accessors
	public String getName(){return name;}
	
	public Tile[][] getTiles(){return tiles;}
	public Tile getTile(int x, int y){return tiles[x][y];}
	
	public int getWidth(){return tiles.length;}
	public int getHeight(){return tiles[0].length;}
	
	public int getxOrigin(){return xOrigin;}
	public int getyOrigin(){return yOrigin;}
	
	public int getMultiplier(){return multiplier;}
	
	public ArrayList<Enemy> getEnemies(){return enemies;}
	public ArrayList<Character> getCharacters(){return characters;}
	
	// mutators
	public void setName(String n){name = n;}
	public void setTile(int x, int y, Tile t){tiles[x][y] = t;}
	
	public void addEnemy(Enemy e){enemies.add(e);}
	public void addCharacter(Character c){characters.add(c);}
	
	// methods
	public void drawMap(Graphics g){
		
		// get dimensions of the screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screenSize.getWidth();
		int height = (int)screenSize.getHeight();
		
		/* temporary - fix later - centers map on the screen */
		
		multiplier = 30;
		xOrigin = (width - (getWidth() * multiplier))/2;
		yOrigin = (height - (getHeight() * multiplier))/2;
		
		// draw the background
		g.setColor(Color.WHITE);
		g.fillRect(xOrigin, yOrigin, getWidth() * multiplier, getHeight() * multiplier);
		
		// draw the map
		g.setColor(Color.BLACK);
		
		for(int x = xOrigin; x <= ((getWidth()) * multiplier) + xOrigin; x += multiplier){
			g.drawLine(x, yOrigin, x, (getHeight() * multiplier) + yOrigin);
		}
		
		for(int y = yOrigin; y <= ((getHeight()) * multiplier) + yOrigin; y += multiplier){
			g.drawLine(xOrigin, y, (getWidth() * multiplier) + xOrigin, y);
		}
	}
	
	public void drawUnits(Graphics g){
		// draw the enemies
		for(int x = 0; x < getWidth(); x++){
			for(int y = 0; y < getHeight(); y++){
				if(tiles[x][y].hasEnemy()){
					tiles[x][y].getEnemy().drawUnit(g, xOrigin, yOrigin, x, y, multiplier);
				}
			}
		}
				
		// draw the characters
		for(int x = 0; x < getWidth(); x++){
			for(int y = 0; y < getHeight(); y++){
				if(tiles[x][y].hasCharacter()){
					tiles[x][y].getCharacter().drawUnit(g, xOrigin, yOrigin, x, y, multiplier);
				}
			}
		}
	}
	
	// convert pixel to coordinate
	public int getCoordinate(int p, boolean xShift){
		int diff;
		
		if(xShift){
			diff = p - xOrigin;
		}
		else{
			diff = p - yOrigin;
		}

		return (diff / multiplier);
	}
	
} // end class
