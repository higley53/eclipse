import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class swingInterfaceBasic {

	ArrayList<JButton> buttonList = new ArrayList<JButton>();
	
	swingInterfaceBasic()
	{
		run();
	
	}
	
	private void run()
	{
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(400,400);
		
		JPanel mainPanel = new JPanel(new GridLayout(2,2));
		mainFrame.add(mainPanel, BorderLayout.CENTER);
		
		JButton b1 = new JButton("1");
		buttonList.add(b1);
		mainPanel.add(b1);
		
		JButton b2 = new JButton("2");
		buttonList.add(b2);
		mainPanel.add(b2);
		
		for(JButton b : buttonList)
		{
			b.addActionListener(new buttonListener());
		}
		
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	class buttonListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{
			JButton clicked = new JButton();
			clicked = (JButton) e.getSource();
			
			for(JButton b : buttonList)
			{
				if(clicked.equals(b));
				{
					System.out.println(b.getText());
				}
			}
			
		
		}
		
	}
}
