package map;
import units.Enemy;

public class Tile {

	// member variables
	private int id;
	private Enemy enemy;
	
	// constructor
	public Tile(int i){
		id = i;
		enemy = null;
	}
	
	// accessors
	public int getId(){return id;}
	public Enemy getEnemy(){return enemy;}
	
	// mutators
	public void setId(int i){id = i;}
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
