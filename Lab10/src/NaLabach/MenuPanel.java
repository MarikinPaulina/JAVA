package NaLabach;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MenuPanel extends JPanel {
	
	MainFrame frame;
	

	public MenuPanel(final MainFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		this.add(frame.button);
		this.add(frame.textF);
		frame.textF.setBounds(frame.textF.getX(), frame.textF.getY(), 100, 10);
		
		ActionListener BListener = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection conn = null;
				try {
					conn = DriverManager.getConnection(
							"jdbc:h2:./data/nazwabazy", "sa",
							"");
					
					Statement statement = conn.createStatement();
					statement.execute(frame.textF.getText());
					ResultSet rs = statement.getResultSet();
					ResultSetMetaData md  = rs.getMetaData();
					
					
					
					for (int ii = 1; ii <= md.getColumnCount(); ii++){
						frame.textA.setText(md.getColumnName(ii)+ " | ");	
						System.out.print(md.getColumnName(ii)+ " | ");	
						
					}
					frame.textA.setText(frame.textA.getText() + "\n");
					System.out.println();
					
					while (rs.next()) {
						for (int ii = 1; ii <= md.getColumnCount(); ii++){
							frame.textA.setText(frame.textA.getText() + rs.getObject(ii) + " | ");	
							System.out.print( rs.getObject(ii) + " | ");	
						}
						frame.textA.setText(frame.textA.getText() + "\n");
						System.out.println();
				}
					
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (conn!= null){
						try {
							conn.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
			}
		};
		frame.button.addActionListener(BListener);
	}

	public MenuPanel(LayoutManager layout) {
		super(layout);
	}

	public MenuPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
	}

	public MenuPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
	}

}
