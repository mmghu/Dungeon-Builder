package graphics;

import java.awt.Dimension;

import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import map.Map;

public class GraphicsFrame extends JFrame{
	
	// member variables
	GraphicsPanel masterPanel;
	private int width, height;
	
	// constructor
	public GraphicsFrame(){
		// get screen dimensions and set screen size
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		width = (int)screenSize.getWidth();
		height = (int)screenSize.getHeight();
		
		// setup dimensions
		setSize(width,height);
		setResizable(false);
		
		// remove border
		setUndecorated(true);
		
		// set layout and setup graphics panel
		setLayout(new GridLayout());
		masterPanel = new GraphicsPanel(this);
		add(masterPanel);
		
		// exit on close and visible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	// accessors
	public int getWidth(){return width;}
	public int getHeight(){return height;}
	
	// mutators
	public void setWidth(int w){width = w;}
	public void setHeight(int h){height = h;}
	
	// methods
	public void loadMenu(){
		masterPanel.loadMenu();
	}
	
	public void loadBuilder(Map m){
		masterPanel.loadBuilder(m);
	}
	
	public void loadExplorer(Map m){
		masterPanel.loadExplorer(m);
	}
	
} // end class
