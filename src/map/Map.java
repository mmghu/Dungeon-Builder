package map;

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
	
} // end class
