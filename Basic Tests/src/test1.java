import javax.swing.*;
public class test1 extends JFrame {

	public static void main(String[]args)
	{
		new test1();
		System.out.println("yo");
	}
	
	private test1()
	{
		JLabel l = new JLabel("yo, working");
		JFrame a = new JFrame();
		a.add(l);
		a.setSize(500,600);
		a.setVisible(true);
	}
}
