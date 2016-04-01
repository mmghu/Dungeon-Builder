package graphics;

import java.awt.Color;
import java.awt.Graphics;
import map.Map;
import javax.swing.JPanel;

public class MapExplorerPanel extends JPanel{

	// member variables
	private Map map;
	
	// constructor
	public MapExplorerPanel(Map m){
		map = m;
	}
	
	// methods
	@Override
	public void paint(Graphics g){
		map.drawMap(g);
	}
	
} // end class
