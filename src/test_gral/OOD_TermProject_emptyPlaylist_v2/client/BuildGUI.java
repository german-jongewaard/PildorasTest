package test_gral.OOD_TermProject_emptyPlaylist_v2.client;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 *
 * @author German
 * 
 */

public class BuildGUI extends JFrame {	
	
    private static final long serialVersionUID = -4331421966781835517L;
    protected JButton chillBtn = new JButton("CHILL");
    protected JButton popBtn = new JButton("POP");
    protected JButton edmBtn = new JButton("EDM");
    protected JButton britneyBtn = new JButton("BRITNEY");
    protected JButton rhcpBtn = new JButton("RHCP");
    protected JButton allBtn = new JButton("ALL");
    protected JButton nextBtn = new JButton(">>");
    protected JPanel panel4 = new JPanel();
    protected JTextArea output = new JTextArea();
    protected JButton stopBtn = new JButton("Stop");
    
    private static BuildGUI singleGUI = null;

	// constructor
	private BuildGUI(){ 
		this.setTitle("OOD Final Project");
		this.setSize(500, 300);
		this.getContentPane().setLayout(
                new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.setResizable(true);
		
		JPanel panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(900,10));
        this.add(panel1);
        
        JLabel label1 = new JLabel("Select a Radio Station");
        panel1.add(label1);
		
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(500,10));
        this.add(panel2);
        
        JPanel panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(500,10));
        this.add(panel3);

		panel4.setPreferredSize(new Dimension(500,10));
		this.add(panel4);
		panel4.setVisible(false);
		panel4.add(nextBtn);
		panel4.add(stopBtn);
		
		JPanel panel5 = new JPanel();
		panel5.setPreferredSize(new Dimension (400,100));
		this.add(panel5);
		output.setLineWrap(true);
		output.setEditable(false);
//		output.setPreferredSize(preferredSize);
		JScrollPane scroll = new JScrollPane(output);
		scroll.setPreferredSize(new Dimension (310,100));
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		panel5.add(scroll);
        
        panel2.add(chillBtn);
        panel2.add(popBtn);
        panel2.add(edmBtn);
        
        panel3.add(britneyBtn);
        panel3.add(rhcpBtn);
        panel3.add(allBtn);
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		setSingleGUI(this);	
	}


	public static BuildGUI getSingleGUI() {
		if(singleGUI == null){
			return new BuildGUI();
		}
		return singleGUI;
	}


	private static void setSingleGUI(BuildGUI singleGUI) {
		BuildGUI.singleGUI = singleGUI;
	}

}
