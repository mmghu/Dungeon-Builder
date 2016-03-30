
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
		
		// manually create walls
		for(int x = 0; x < grasslands.getWidth(); x++){
			grasslands.setTile(x, 0, new Tile(0));
			grasslands.setTile(x, width - 1, new Tile(0));
			grasslands.setTile(height - 1, x, new Tile(0));
			grasslands.setTile(0, x, new Tile(0));
		}
		
		Enemy bandit = new Enemy("1", 10, 5, 5, 7);
		grasslands.getTile(2,2).setEnemy(bandit);
		
	} // end main
} // end class
