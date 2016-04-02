package map;
import units.Enemy;
import units.Character;

public class Tile {

	// member variables
	private int id;
	private Enemy enemy;
	private Character character;
	
	// constructor
	public Tile(int i){
		id = i;
		enemy = null;
	}
	
	// accessors
	public int getId(){return id;}
	
	public Enemy getEnemy(){return enemy;}
	public Character getCharacter(){return character;}
	
	// mutators
	public void setId(int i){id = i;}
	
	public void setEnemy(Enemy e){enemy = e;}
	public void setCharacter(Character c){character = c;}
	
	// methods
	public boolean hasEnemy(){
		if(enemy == null){
			return false;
		}
		else{
			return true;
		}
	}
	
	public boolean hasCharacter(){
		if(character == null){
			return false;
		}
		else{
			return true;
		}
	}
	
} // end class
