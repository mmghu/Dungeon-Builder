import graphics.GraphicsFrame;
import map.Map;
import map.Tile;
import units.Enemy;

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
		
		// setup the window
		GraphicsFrame window = new GraphicsFrame();
		
		// load the explorer
		window.loadExplorer(grasslands);
		
	} // end main
} // end class
