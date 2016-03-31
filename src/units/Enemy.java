package units;


public class Enemy extends Unit{

	// construtor
	public Enemy(String n, double hp, double atk, double def, int mov){
		super.name = n;
		super.health = hp;
		super.maxHealth = hp;
		super.attack = atk;
		super.defense = def;
		super.movement = mov;
	}
	
} // end class
