import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Exit extends JFrame {

	private JPanel contentPane;
	private Image img_Exit =new ImageIcon(VandingMechine.class.getResource("Exit.JPG")).getImage().getScaledInstance(670, 350, Image.SCALE_SMOOTH);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exit frame = new Exit();
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
	
	public Exit() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 454);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new LineBorder(new Color(0, 128, 128), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbla = new JLabel("X");
		lbla.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lbla.setHorizontalTextPosition(SwingConstants.CENTER);
		lbla.setHorizontalAlignment(SwingConstants.CENTER);
		//lbla.setBounds(760, 0, 32, 23);
		contentPane.add(lbla);
		lbla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			if(JOptionPane.showConfirmDialog(null, "Are You Sure You Want to close this Application", "Confirmation", JOptionPane.YES_NO_OPTION)==0)
			{
				Exit.this.dispose();
			}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			   lbla.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				   lbla.setForeground(Color.GREEN);
				}
		});
		lbla.setVerticalAlignment(SwingConstants.BOTTOM);
		lbla.setForeground(new Color(0, 255, 0));
		lbla.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lbla.setBounds(768, 0, 24, 23);
		contentPane.add(lbla);
		
		JLabel lblPic = new JLabel("");
		lblPic.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblPic.setBounds(65, 77, 665, 337);
		lblPic.setIcon(new ImageIcon(img_Exit));
		contentPane.add(lblPic);
		
		JLabel lblNewLabel = new JLabel("Produced By : Muhammad Azeem");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(578, 431, 214, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Exit");
		lblNewLabel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1.setBackground(new Color(0, 139, 139));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 48));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(287, 9, 225, 57);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Azeem\\eclipse-workspace\\2Semester(HMS)Project\\End.jpg"));
		lblNewLabel_2.setBounds(0, 0, 792, 454);
		contentPane.add(lblNewLabel_2);
		}
}
