package view;

import java.awt.BorderLayout;
import java.awt.Dimension; 

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventPerformer extends JFrame
{

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * windows filling --> reading of file and display 
	 * this methode is used	via BoulderDashView 
	 * @param null 
	 * @return void 
	 * @author Julien  
	 */
	
	
	public void keyCodeToUser() 
	{
		
		
		JLabel label = new JLabel("tape pour test");  
        add(label, BorderLayout.CENTER);

        
        addKeyListener(new keyControler());

        setPreferredSize(new Dimension(640, 640));
        pack();
       
        
	}
}
	
	