package map;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

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
		
		for(int x = xshift; x <= ((getWidth()) * multiplier) + xshift; x += multiplier){
			g.drawLine(x, yshift, x, (getHeight() * multiplier) + yshift);
		}
		
		for(int y = yshift; y <= ((getHeight()) * multiplier) + yshift; y += multiplier){
			g.drawLine(xshift, y, (getWidth() * multiplier) + xshift, y);
		}
	}
	
} // end class
