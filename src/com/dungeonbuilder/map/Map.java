package com.dungeonbuilder.map;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import com.dungeonbuilder.units.Character;

public class Map {

	// member variables
	private String name;
	private Tile[][] tiles;
	
	// constructor
	public Map(String n, Tile[][] t){
		name = n;
		tiles = t;
	}
	
	// accessors
	public String getName(){return name;}
	
	public Tile[][] getTiles(){return tiles;}
	public Tile getTile(int x, int y){return tiles[x][y];}
	
	public int getWidth(){return tiles.length;}
	public int getHeight(){return tiles[0].length;}
	
	// mutators
	public void setName(String n){name = n;}
	public void setTile(int x, int y, Tile t){tiles[x][y] = t;}
	
	// methods
	public void drawMap(Graphics g){
		
		// get dimensions of the screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screenSize.getWidth();
		int height = (int)screenSize.getHeight();
		
		/* temporary - fix later - centers map on the screen */
		
		int multiplier = 30;
		int xshift = (width - (getWidth() * multiplier))/2;
		int yshift = (height - (getHeight() * multiplier))/2;
		
		// draw the background
		g.setColor(Color.WHITE);
		g.fillRect(xshift, yshift, getWidth() * multiplier, getHeight() * multiplier);
		
		// draw the map
		g.setColor(Color.BLACK);
		
		for(int x = xshift; x <= ((getWidth()) * multiplier) + xshift; x += multiplier){
			g.drawLine(x, yshift, x, (getHeight() * multiplier) + yshift);
		}
		
		for(int y = yshift; y <= ((getHeight()) * multiplier) + yshift; y += multiplier){
			g.drawLine(xshift, y, (getWidth() * multiplier) + xshift, y);
		}
		
		// draw the enemies
		for(int x = 0; x < getWidth(); x++){
			for(int y = 0; y < getHeight(); y++){
				if(tiles[x][y].hasEnemy()){
					tiles[x][y].getEnemy().drawUnit(g, xshift, yshift, x, y, multiplier);
				}
			}
		}
		
		// draw the characters
		for(int x = 0; x < getWidth(); x++){
			for(int y = 0; y < getHeight(); y++){
				if(tiles[x][y].hasCharacter()){
					tiles[x][y].getCharacter().drawUnit(g, xshift, yshift, x, y, multiplier);
				}
			}
		}
		
	}
	
} // end class
