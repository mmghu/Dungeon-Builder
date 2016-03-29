
public class RunFile {
	public static void main(String[] args) {
		
		// create name and area 2d array
		String areaName = "Grasslands";
		Tile[][] area = new Tile[5][5];
		
		// create the map
		Map grasslands = new Map(areaName, area);
		
		// initialize with grass tiles
		for(int x = 0; x < grasslands.getWidth(); x++){
			for(int y = 0; y < grasslands.getHeight(); y++){
				grasslands.setTile(x, y, new Tile("Grass"));
			}
		}
		
		// create graphics
		GraphicsFrame window = new GraphicsFrame();
		window.drawMap(grasslands);
		
	} // end main
} // end class
