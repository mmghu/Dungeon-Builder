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
	
	private boolean clicked;
	private Character clickedCharacter;
	
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
		
		for(int i = 0; i < map.getCharacters().size(); i++){
			if(map.getCharacters().get(i).isUpdated()){
				map.getCharacters().get(i).moveUnit(g, map.getxOrigin(), map.getyOrigin(), map.getCharacters().get(i).getNextX(), map.getCharacters().get(i).getNextY(), map.getMultiplier(), map);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// convert click to coorindate
		int xCoord = map.getCoordinate(e.getX(), true);
		int yCoord = map.getCoordinate(e.getY(), false);
		
		if(!clicked){
			if(map.getTile(xCoord, yCoord).hasCharacter()){
				clicked = true;
				clickedCharacter = map.getTile(xCoord, yCoord).getCharacter();
				System.out.println("clicked character");
			}
		}
		if(clicked){
			if(!map.getTile(xCoord, yCoord).hasEnemy() && !map.getTile(xCoord, yCoord).hasCharacter()){
				clickedCharacter.setUpdated(true);
				clickedCharacter.setNextX(xCoord);
				clickedCharacter.setNextY(yCoord);
				
				clicked = false;
				System.out.println("moved character");
			}
		}
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
