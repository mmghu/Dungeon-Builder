import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class GraphicsFrame {

	// member variables
	private JFrame window;
	private int x,y;
	private JPanel[][] panels;
	
	// constructor
	public GraphicsFrame(){
		window = new JFrame("Dungeon Builder");
		x = 500;
		y = 500;
		window.setSize(x,y);
		window.setVisible(true);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// setup nimbus look and feel
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
			System.out.println("Nimbus Look and Feel Not Available");
		}
	}
	
	// accessors
	public int getWidth(){return x;}
	public int getHeight(){return y;}
	
	// mutators
	public void setWidth(int w){x = w; window.setSize(x, y);}
	public void setHeight(int h){y = h; window.setSize(x, y);}
	
	// methods
	public void drawMap(Map m){
		// create master jpanel with 2d array of jpanels inside
		JPanel masterPanel = new JPanel();
		masterPanel.setLayout(new GridLayout(m.getWidth(), m.getHeight()));
		
		// initialize panels 2d array to access these panels later
		panels = new JPanel[m.getWidth()][m.getHeight()];
		
		// intialize all the panels, add to 2d array, and add to master panel
		for(int x = 0; x < m.getWidth(); x++){
			for(int y = 0; y < m.getHeight(); y++){
				JPanel temp = new JPanel();
				temp.setBackground(Color.black);
				panels[x][y] = temp;
				masterPanel.add(temp);
			}
		}
		
		// add masterPanel to window
		window.add(masterPanel, BorderLayout.CENTER);
	}
	
} // end class
