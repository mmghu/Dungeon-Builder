
public class Tile {

	// member variables
	private String name;
	private Enemy enemy;
	
	// constructor
	public Tile(String n){
		name = n;
		enemy = null;
	}
	
	// accessors
	public String getName(){return name;}
	public Enemy getEnemy(){return enemy;}
	
	// mutators
	public void setName(String n){name = n;}
	public void setEnemy(Enemy e){enemy = e;}
	
	// methods
	public boolean hasEnemy(){
		if(enemy == null){
			return false;
		}
		else{
			return true;
		}
	}
	
} // end class
