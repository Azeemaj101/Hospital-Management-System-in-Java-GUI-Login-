
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

public class LabLogin extends JFrame {
	private static final long serialVersionUID = 1L;
	private Image img_UserName =new ImageIcon(LabLogin.class.getResource("UserName.JPG")).getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH);
    private Image img_Password =new ImageIcon(LabLogin.class.getResource("Lock.jpg")).getImage().getScaledInstance(60, 40, Image.SCALE_SMOOTH);
    private Image img_Login =new ImageIcon(LabLogin.class.getResource("Key.png")).getImage().getScaledInstance(90, 80, Image.SCALE_SMOOTH);
	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField txtPassword;
	private JLabel lblLoginMessage = new JLabel("");
    static int a=0;
    static int b=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabLogin frame = new LabLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public LabLogin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 205), 2));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 139, 139));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(162, 115, 250, 40);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textUsername = new JTextField();
		textUsername.setForeground(new Color(0, 0, 0));
		textUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textUsername.getText().equals("UserName"))
				{
				   textUsername.setText("");	
				}
				else
				{
					textUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
			if(textUsername.getText().equals(""))
			{
				textUsername.setText("Usarname");
			}
			}
		});
		textUsername.setBorder(null);
		textUsername.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textUsername.setText("Username");
		textUsername.setBounds(10, 11, 198, 18);
		panel_1.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel lblUserName = new JLabel("");
		lblUserName.setBorder(null);
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setBounds(209, 0, 41, 40);
		lblUserName.setIcon(new ImageIcon(img_UserName));
		panel_1.add(lblUserName);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(162, 166, 250, 40);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.setForeground(new Color(0, 0, 0));
		txtPassword.addFocusListener(new FocusAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password"))
				{
					txtPassword.setEchoChar('●');
					txtPassword.setText("");
				}
				else
				{
					txtPassword.selectAll();
				}
			}
			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals(""))
				{
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);
				}
			}
		});
		txtPassword.setBorder(null);
		txtPassword.setEchoChar((char)0);
		txtPassword.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 11, 200, 18);
		panel_1_1.add(txtPassword);
		
		JLabel lblPassword = new JLabel("");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(209, 0, 41, 40);
		lblPassword.setIcon(new ImageIcon(img_Password));
		panel_1_1.add(lblPassword);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			//LeftButton.setEnabled(false);
			}
		});
		panel_2.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textUsername.getText().equals("Customer") && txtPassword.getText().equals("Customer"))
				{
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null, "Login Successful");
					LabLogin.this.dispose();
					a++;
				}
				else if(textUsername.getText().equals("Update") && txtPassword.getText().equals("Update"))
				{
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null, "Login Successful Welcome Back Head");
					LabLogin.this.dispose();
					b++;
				}
				else if(textUsername.getText().equals("") || textUsername.getText().equals("Username")
						||txtPassword.getText().equals("")||txtPassword.getText().equals("Password"))
				{
					lblLoginMessage.setText("Please Input All Requirements!");
				}
				else
				{
					lblLoginMessage.setText("Username and Password didn't match");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2.setBackground(new Color(0, 91, 105));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2.setBackground(new Color(0, 101, 155));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				panel_2.setBackground(new Color(0, 91, 105));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_2.setBackground(new Color(0, 101, 155));
			}
		});
		panel_2.addFocusListener(new FocusAdapter() {
		});
		panel_2.setBackground(new Color(0, 101, 155));
		panel_2.setBounds(162, 234, 250, 63);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOG IN");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(99, 11, 82, 41);
		panel_2.add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(55, 11, 41, 40);
		lblLogin.setIcon(new ImageIcon(img_Login));
		panel_2.add(lblLogin);
		
		JLabel lblx = new JLabel("x");
		lblx.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			if(JOptionPane.showConfirmDialog(null, "Are You Sure You Want to close this Application", "Confirmation", JOptionPane.YES_NO_OPTION)==0)
			{
				LabLogin.this.dispose();
			}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			   lblx.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				   lblx.setForeground(Color.GREEN);
				}
		});
		lblx.setVerticalAlignment(SwingConstants.BOTTOM);
		lblx.setForeground(new Color(0, 255, 0));
		lblx.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblx.setHorizontalAlignment(SwingConstants.CENTER);
		lblx.setBounds(576, 0, 20, 20);
		panel.add(lblx);
		
		lblLoginMessage.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblLoginMessage.setForeground(new Color(255, 255, 255));
		lblLoginMessage.setBounds(162, 209, 250, 20);
		panel.add(lblLoginMessage);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Azeem\\eclipse-workspace\\2Semester(HMS)Project\\LAB3.jpg"));
		lblNewLabel_1.setBounds(0, 0, 596, 396);
		panel.add(lblNewLabel_1);
		setLocationRelativeTo(null);
	}
}