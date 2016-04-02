package com.dungeonbuilder.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.dungeonbuilder.map.Map;

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
