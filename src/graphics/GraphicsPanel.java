package graphics;

import java.awt.Color;
import map.Map;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel{

	// member variables
	private MenuPanel menu;
	private MapExplorerPanel explorer;
	private MapBuilderPanel builder;
	
	// constructor
	public GraphicsPanel(){
		setLayout(new GridLayout());
	}
	
	// methods
	public void loadMenu(){
		menu = new MenuPanel();
		removeAll();
		add(menu);
	}
	
	public void loadBuilder(Map m){
		builder = new MapBuilderPanel(m);
		removeAll();
		add(builder);
	}
	
	public void loadExplorer(Map m){
		explorer = new MapExplorerPanel(m);
		removeAll();
		add(explorer);
	}
	
} // end class
