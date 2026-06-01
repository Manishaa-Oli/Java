package ss;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SwingSql extends JFrame implements ActionListener {
	JLabel idL,nameL,emailL,passL;
	JTextField idT,nameT,emailT,passT;
	JButton ok;
	SwingSql()throws Exception
	{
		
	
		idL=new JLabel("id:");
		nameL=new JLabel("name:");
		emailL=new JLabel("email:");
		passL=new JLabel("password:");
		idT=new JTextField(20);
		nameT=new JTextField(20);
		emailT=new JTextField(20);
		passT=new JTextField(20);
		ok=new JButton("OK");
		add(idL);add(idT);
		add(nameL);add(nameT);
		add(emailL);add(emailT);
		add(passL);add(passT);
		add(ok);
		ok.addActionListener(this);
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
		{
			
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
		String q="insert into user values(?,?,?,?)";
		PreparedStatement pre=con.prepareStatement(q);
		pre.setString(1, "101");
		pre.setString(2, "man");
		pre.setString(3, "mn@gmail.com");
		pre.setString(4, "123jhv");
		pre.execute();
		pre.close();
		con.close();
		System.out.println("data added!!");
		}catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();		}
		}
		public static void main(String a[])throws Exception
		{
			new SwingSql();
		}
	}


