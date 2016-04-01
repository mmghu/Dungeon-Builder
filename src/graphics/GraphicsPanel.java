package graphics;

import java.awt.Color;
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
	
	public void loadBuilder(){
		builder = new MapBuilderPanel();
		removeAll();
		add(builder);
	}
	
	public void loadExplorer(){
		explorer = new MapExplorerPanel();
		removeAll();
		add(explorer);
	}
	
} // end class
