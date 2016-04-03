package com.dungeonbuilder.graphics;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import com.dungeonbuilder.map.Map;
import com.dungeonbuilder.units.Character;

public class MapExplorerPanel extends JPanel implements MouseListener{

	// member variables
	private static final long serialVersionUID = -2513127929733972381L;
	private Map map;
	
	// constructor
	public MapExplorerPanel(Map m){
		map = m;
		addMouseListener(this);
	}
	
	// methods
	@Override
	public void paint(Graphics g){
		map.drawMap(g);
		map.drawUnits(g);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// convert click to coorindate
		int xCoord = map.getCoordinate(e.getX(), true);
		int yCoord = map.getCoordinate(e.getY(), false);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
} // end class
