package graphics;

import java.awt.Color;
import java.awt.Graphics;

import map.Map;
import javax.swing.JPanel;

public class MapBuilderPanel extends JPanel{

	// member variables
	private Map map;
	
	// constructor
	public MapBuilderPanel(Map m){
		map = m;
	}
	
	// methods
	@Override
	public void paint(Graphics g){
		map.drawMap(g);
	}
	
} // end class
