package GG;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Numsel extends JFrame implements ActionListener{
	JButton one,two,three,four;
	Numsel()
	{
		one=new JButton("one");
		two=new JButton("two");
		three=new JButton("three");
		four=new JButton("four");
		one.setToolTipText("one");
		two.setToolTipText("two");
		three.setToolTipText("three");
		four.setToolTipText("four");
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		add(one);add(two);
		add(three);add(four);
		setLayout(new GridLayout(2,2));
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
				
	}
	public void actionPerformed(ActionEvent e)
	{
		Random r=new Random();
		int n=r.nextInt(4);
		if(e.getSource()==one)
		{
			if(n==1)
			{
				one.setBackground(Color.GREEN);
				JOptionPane.showMessageDialog(this,"it's a match!!");
			}
			else
			{
				one.setBackground(Color.RED);
			}
		}
			if(e.getSource()==two)
				
			{
				if(n==2)
				{
					two.setBackground(Color.GREEN);
					JOptionPane.showMessageDialog(this,"it's a match!!");
				}
				else
				{
					two.setBackground(Color.RED);
				}
			}
			if(e.getSource()==three)
			{
				if(n==3)
				{
					three.setBackground(Color.GREEN);
					JOptionPane.showMessageDialog(this,"it's a match!!");
				}
				else
				{
					three.setBackground(Color.RED);
				}
			}
				if(e.getSource()==four)
				{
					if(n==4)
					{
						four.setBackground(Color.GREEN);
						JOptionPane.showMessageDialog(this,"it's a match!!");
					}
					else
					{
						four.setBackground(Color.RED);
					}
				}
					
		}
	public static void main(String a[])
	{
		new Numsel();
		
	}
	
}
