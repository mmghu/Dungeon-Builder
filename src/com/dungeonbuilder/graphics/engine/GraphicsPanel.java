package com.dungeonbuilder.graphics.engine;

import java.awt.GridLayout;
import javax.swing.JPanel;

import com.dungeonbuilder.graphics.MapBuilderPanel;
import com.dungeonbuilder.graphics.MapExplorerPanel;
import com.dungeonbuilder.graphics.MenuPanel;
import com.dungeonbuilder.map.Map;

public class GraphicsPanel extends JPanel implements Runnable{

	// member variables
	private static final long serialVersionUID = -5818196426488742698L;
	private GraphicsFrame masterFrame;
	private MenuPanel menu;
	private MapExplorerPanel explorer;
	private MapBuilderPanel builder;
	
	private Thread graphicsThread;
	
	// constructor
	public GraphicsPanel(GraphicsFrame m){
		masterFrame = m;
		setLayout(new GridLayout());

		graphicsThread = new Thread(this, "Graphics Thread");
		graphicsThread.start();
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

	@Override
	public void run() {
		while(true){
			try {
				masterFrame.validate();
				masterFrame.repaint();
				Thread.sleep(16); // run at 60 fps
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
} // end class
