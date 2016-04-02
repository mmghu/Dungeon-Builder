package com.dungeonbuilder.graphics;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.dungeonbuilder.map.Map;

public class MapBuilderPanel extends JPanel{

	// member variables
	private static final long serialVersionUID = -1078149554177441434L;
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
