import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.util.*;
public class SpaceRace extends JFrame {
	
	boolean up=true;
    boolean up1=true;
    boolean up2=true;
    boolean up3=true;
    boolean up4=true;
    boolean up5=true;
    boolean up6=true;
	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpaceRace frame = new SpaceRace();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public boolean choque(JLabel a, JLabel b) {
		boolean x=false;
		Rectangle r1 = a.getBounds();
		Rectangle r2 = b.getBounds();
		if(r2.intersects(r1)) {
			x=true;
		}else {
			x=false;
		}
		return x;		
	}

	/**
	 * Create the frame.
	 */
	public SpaceRace() {
		
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 615);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l2 = new JLabel("");
		l2.setIcon(new ImageIcon("C:\\Users\\so\\Downloads\\95369_10002.png"));
		l2.setBounds(352, -13, 20, 27);
		contentPane.add(l2);
		
		JLabel l7 = new JLabel("");
		l7.setIcon(new ImageIcon("C:\\Users\\so\\Downloads\\95369_10002.png"));
		l7.setBounds(310, -13, 20, 27);
		contentPane.add(l7);
		
		JLabel l6 = new JLabel("");
		l6.setIcon(new ImageIcon("C:\\Users\\so\\Downloads\\95369_10002.png"));
		l6.setBounds(270, -13, 20, 27);
		contentPane.add(l6);
		
		JLabel l5 = new JLabel("");
		l5.setIcon(new ImageIcon("C:\\Users\\so\\Downloads\\95369_10002.png"));
		l5.setBounds(219, -13, 20, 27);
		contentPane.add(l5);
		
		JLabel l4 = new JLabel("");
		l4.setIcon(new ImageIcon("C:\\Users\\so\\Downloads\\95369_10002.png"));
		l4.setBounds(162, -13, 20, 27);
		contentPane.add(l4);
		
		JLabel l3 = new JLabel("");
		l3.setIcon(new ImageIcon("C:\\Users\\so\\Downloads\\95369_10002.png"));
		l3.setBounds(97, -13, 20, 27);
		contentPane.add(l3);
		
		JLabel l1 = new JLabel("");
		l1.setIcon(new ImageIcon("C:\\Users\\so\\Downloads\\95369_10002.png"));
		l1.setBounds(36, -13, 20, 27);
		contentPane.add(l1);
		JLabel Loud = new JLabel("");
		Loud.setIcon(new ImageIcon("C:\\Users\\so\\Pictures\\nave do espa\u00E7o.png"));
		Loud.setBounds(187, 532, 31, 33);
		contentPane.add(Loud);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\so\\Downloads\\gif espa\u00E7o.gif"));
		lblNewLabel.setBounds(0, 0, 401, 576);
		contentPane.add(lblNewLabel);
		
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					if(Loud.getLocation().x>1){
						Loud.setLocation(Loud.getLocation().x-10 ,Loud.getLocation().y);	
					}
				}
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					if(Loud.getLocation().x<367) {
						Loud.setLocation(Loud.getLocation().x+10 ,Loud.getLocation().y);
					}
				}
				if(e.getKeyCode()==KeyEvent.VK_UP) {
					Loud.setLocation(Loud.getLocation().x ,Loud.getLocation().y-10);
					if(Loud.getLocation().y<11) {
						JOptionPane.showMessageDialog( Loud, "Parabéns, venceste!!");
						nivel2 n2 = new nivel2();
						n2.setVisible(true);
						setVisible(false);
						
					}
					
					
				}
				if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					Loud.setLocation(Loud.getLocation().x ,Loud.getLocation().y+10);
				}
				
			}
		});
		
		Timer timer =new Timer();
		class Aux extends TimerTask {
			
			public void run() {
				
				for (int i =0; i <14 ;i ++) {
					if(i == 0) {
						
					
					if (up) {

						if(l1.getLocation().y<1) {
							up = false;
						}
						
						else {
							l1.setLocation(l1.getLocation().x, l1.getLocation().y-23);
						}
					}
						
						  else {
							 
						 
						
							if(l1.getLocation().y>555) {
								up=true;
								
							}else {
								l1.setLocation(l1.getLocation().x, l1.getLocation().y+42);
							}
					}
				}
					if(i == 1) {
						
						
						if (up1) {

							if(l2.getLocation().y<1) {
								up1 = false;
							}
							
							else {
								l2.setLocation(l2.getLocation().x, l2.getLocation().y-18);
							}
						}
							
							  else {
								 
							 
							
								if(l2.getLocation().y>570) {
									up1=true;
									
								}else {
									l2.setLocation(l2.getLocation().x, l2.getLocation().y+13);
								}
						}
					}
                      if(i == 2) {
						
						
						if (up2) {

							if(l3.getLocation().y<1) {
								up2 = false;
							}
							
							else {
								l3.setLocation(l3.getLocation().x, l3.getLocation().y-16);
							}
						}
							
							  else {
								 
							 
							
								if(l3.getLocation().y>410) {
									up2=true;
									
								}else {
									l3.setLocation(l3.getLocation().x, l3.getLocation().y+20);
								}
						}
					}
                      if(i == 3) {
  						
  						
  						if (up3) {

  							if(l4.getLocation().y<1) {
  								up3 = false;
  							}
  							
  							else {
  								l4.setLocation(l4.getLocation().y, l4.getLocation().y-10);
  							}
  						}
  							
  							  else {
  								 
  							 
  							
  								if(l4.getLocation().y>300) {
  									up3=true;
  									
  								}else {
  									l4.setLocation(l4.getLocation().y, l4.getLocation().y+10);
  								}
  						}
  					}
                      if(i == 4) {
    						
    						
    						if (up4) {

    							if(l5.getLocation().y<1) {
    								up4 = false;
    							}
    							
    							else {
    								l5.setLocation(l5.getLocation().x, l5.getLocation().y-13);
    							}
    						}
    							
    							  else {
    								 
    							 
    							
    								if(l5.getLocation().y>345) {
    									up4=true;
    									
    								}else {
    									l5.setLocation(l5.getLocation().x, l5.getLocation().y+13);
    								}
    						}
    					}
                      if(i == 5) {
  						
  						
  						if (up5) {

  							if( l6.getLocation().y<1) {
  								up5 = false;
  							}
  							
  							else {
  								l6.setLocation(l6.getLocation().x+5, l6.getLocation().y-8);
  							}
  						}
  							
  							  else {
  								 
  							 
  							
  								if(l6.getLocation().y>192 ) {
  									up5=true;
  									
  								}else {
  									l6.setLocation(l6.getLocation().x-5, l6.getLocation().y+8);
  								}
  						}
  					}
                      if(i == 6) {
    						
    						
    						if (up6) {

    							if( l7.getLocation().y<1) {
    								up6 = false;
    							}
    							
    							else {
    								l7.setLocation(l7.getLocation().x, l7.getLocation().y-8);
    							}
    						}
    							
    							  else {
    								 
    							 
    							
    								if(l7.getLocation().y>327 ) {
    									up6=true;
    									
    								}else {
    									l7.setLocation(l7.getLocation().x, l7.getLocation().y+8);
    								}
    						}
    					}
				}
				
				
				
				if (choque(Loud, l1 )) {
					JFrame frame = new JFrame("");
					Loud.setLocation(162, 507);
					JOptionPane.showMessageDialog( frame, "Tenta outra vez");
				}
				if (choque(Loud, l2 )) {
					JFrame frame = new JFrame("");
					Loud.setLocation(162, 507);
					JOptionPane.showMessageDialog( frame, "Tenta outra vez");
				}
				if (choque(Loud, l3 )) {
					JFrame frame = new JFrame("");
					Loud.setLocation(162, 507);
					JOptionPane.showMessageDialog( frame, "Tenta outra vez");
				}
				if (choque(Loud, l4 )) {
					JFrame frame = new JFrame("");
					Loud.setLocation(162, 507);
					JOptionPane.showMessageDialog( frame, "Tenta outra vez");
				}
				if (choque(Loud, l5 )) {
					JFrame frame = new JFrame("");
					Loud.setLocation(162, 507);
					JOptionPane.showMessageDialog( frame, "Tenta outra vez");
				}
				if (choque(Loud, l6 )) {
					JFrame frame = new JFrame("");
					Loud.setLocation(162, 507);
					JOptionPane.showMessageDialog( frame, "Tenta outra vez");
				}
				
				
				
				
			}
		}
			TimerTask task = new Aux();		
			timer.schedule(task, 20, 50 );
	}
}
