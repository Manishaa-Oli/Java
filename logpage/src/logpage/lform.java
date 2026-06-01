package logpage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class lform extends JFrame {
	

	    JTextField idField, nameField, emailField;
	    JPasswordField passField;
	    JButton okButton;

	    public lform() {
	        setTitle("Login Form");
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setSize(400, 300); // Increased size
	        setLocationRelativeTo(null); // Center on screen

	        // Main panel with padding
	        JPanel panel = new JPanel(new GridBagLayout());
	        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // padding

	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.insets = new Insets(10, 10, 10, 10); // spacing between elements
	        gbc.fill = GridBagConstraints.HORIZONTAL;

	        // Create components
	        JLabel idLabel = new JLabel("ID:");
	        JLabel nameLabel = new JLabel("Name:");
	        JLabel emailLabel = new JLabel("Email:");
	        JLabel passLabel = new JLabel("Pass:");

	        idField = new JTextField(15);
	        nameField = new JTextField(15);
	        emailField = new JTextField(15);
	        passField = new JPasswordField(15);
	        okButton = new JButton("OK");

	        // Add components to panel with layout
	        gbc.gridx = 0; gbc.gridy = 0; panel.add(idLabel, gbc);
	        gbc.gridx = 1; panel.add(idField, gbc);

	        gbc.gridx = 0; gbc.gridy = 1; panel.add(nameLabel, gbc);
	        gbc.gridx = 1; panel.add(nameField, gbc);

	        gbc.gridx = 0; gbc.gridy = 2; panel.add(emailLabel, gbc);
	        gbc.gridx = 1; panel.add(emailField, gbc);

	        gbc.gridx = 0; gbc.gridy = 3; panel.add(passLabel, gbc);
	        gbc.gridx = 1; panel.add(passField, gbc);

	        gbc.gridx = 1; gbc.gridy = 4;
	        gbc.anchor = GridBagConstraints.CENTER;
	        panel.add(okButton, gbc);

	        // Add action
	        okButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                insertData();
	            }
	        });

	        add(panel); // Add to frame
	        setVisible(true);
	    }

	    void insertData() {
	        String id = idField.getText();
	        String name = nameField.getText();
	        String email = emailField.getText();
	        String pass = String.valueOf(passField.getPassword());

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection conn = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/userdb", "root", "9845860688@Mi"
	            );

	            String sql = "INSERT INTO users (id, name, email, password) VALUES (?, ?, ?, ?)";
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            stmt.setInt(1, Integer.parseInt(id));
	            stmt.setString(2, name);
	            stmt.setString(3, email);
	            stmt.setString(4, pass);

	            int rows = stmt.executeUpdate();

	            if (rows > 0) {
	                JOptionPane.showMessageDialog(this, "Data inserted successfully!");
	            }

	            stmt.close();
	            conn.close();

	        } catch (Exception ex) {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        new lform();
	    }
	}


