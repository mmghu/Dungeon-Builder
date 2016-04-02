import graphics.GraphicsFrame;
import map.Map;
import map.Tile;
import units.Enemy;
import units.Character;

public class RunFile {
	public static void main(String[] args) {
		
		// create name and area 2d array
		String areaName = "Grasslands";
		int width = 25; int height = 25;
		Tile[][] area = new Tile[width][height];
		
		// create the map
		Map grasslands = new Map(areaName, area);
		
		// initialize with grass tiles
		for(int x = 0; x < grasslands.getWidth(); x++){
			for(int y = 0; y < grasslands.getHeight(); y++){
				grasslands.setTile(x, y, new Tile(1));
			}
		}
		
		// create an enemy
		Enemy bandit = new Enemy("Bandit 1", 10, 5, 5, 7);
		grasslands.getTile(3, 3).setEnemy(bandit);
		
		// create a character
		Character hero = new Character("Hero 1", 10, 5, 5, 7);
		grasslands.getTile(9, 9).setCharacter(hero);
		
		// setup the window
		GraphicsFrame window = new GraphicsFrame();
		
		// load the explorer
		window.loadExplorer(grasslands);
		
	} // end main
} // end class
