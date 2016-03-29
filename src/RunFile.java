
public class RunFile {
	public static void main(String[] args) {
		
		// create name and area 2d array
		String areaName = "Grasslands";
		Tile[][] area = new Tile[10][10];
		
		// create the map
		Map grasslands = new Map(areaName, area);
		
		// initialize with grass tiles
		for(int x = 0; x < grasslands.getWidth(); x++){
			for(int y = 0; y < grasslands.getHeight(); y++){
				grasslands.setTile(x, y, new Tile("Grass"));
			}
		}
		
		Enemy bandit = new Enemy("bandit", 10);
		grasslands.getTile(0,0).setEnemy(bandit);
		
		// create graphics
		GraphicsFrame window = new GraphicsFrame();
		window.drawMap(grasslands);
		
	} // end main
} // end class
