
public abstract class Unit {
	
	// member variables
	protected String name;
	protected double health, maxHealth;
	
	// accessors
	public String getName(){return name;}
	
	public double getHealth(){return health;}
	public double getMaxHealth(){return maxHealth;}
	
	// mutators
	public void setName(String n){name = n;}
	
	public void setHealth(double h){health = h;}
	public void setMaxHealth(double h){maxHealth = h;}
	
} // end abstract class
