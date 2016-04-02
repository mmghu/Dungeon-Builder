package com.dungeonbuilder.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.dungeonbuilder.map.Map;

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
