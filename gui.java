import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.TextArea;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;

public class gui {

	private JFrame frmRegister;
	private JLayeredPane layeredPane;
	private JPanel Main;
	private JTextField textField;
	private JTextField txtEnterInCash;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frmRegister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegister = new JFrame();
		frmRegister.setResizable(false);
		frmRegister.setTitle("Register");
		frmRegister.getContentPane().setForeground(Color.WHITE);
		frmRegister.getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 996, 673);
		frmRegister.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		Main = new JPanel();
		layeredPane.add(Main, "name_279449572344700");
		Main.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(new Color(211, 211, 211));
		Main.add(panel_4_1, BorderLayout.NORTH);
		panel_4_1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblNewLabel_6_1 = new JLabel("Main Menu\r\n");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setForeground(Color.BLACK);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_4_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6 = new JLabel("Press Tab to add or remove food items!");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.DARK_GRAY);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_4_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Press Cash out to cash out customer ");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.DARK_GRAY);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_4_1.add(lblNewLabel_7);
		
		JPanel panel = new JPanel();
		Main.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 3, 50, 50));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		JLabel lblNewLabel = new JLabel("Table 1");
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel.setBackground(Color.WHITE);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		
		JButton btnCashOut = new JButton("Tab");
		btnCashOut.setBackground(Color.WHITE);
		panel_2.add(btnCashOut);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JButton btnNewButton_1 = new JButton("Cash Out");
		panel_3.add(btnNewButton_1);
		
		JPanel panel_1_1 = new JPanel();
		panel.add(panel_1_1);
		panel_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Table 2");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_1.setBackground(Color.WHITE);
		panel_1_1.add(lblNewLabel_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_1_1.add(panel_2_1);
		
		JButton btnNewButton_2 = new JButton("Tab");
		btnNewButton_2.setBackground(Color.WHITE);
		panel_2_1.add(btnNewButton_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_1_1.add(panel_3_1);
		
		JButton btnNewButton_1_1 = new JButton("Cash Out");
		panel_3_1.add(btnNewButton_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel.add(panel_1_2);
		panel_1_2.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Table 3");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_2.setBackground(Color.WHITE);
		panel_1_2.add(lblNewLabel_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_1_2.add(panel_2_2);
		
		JButton btnNewButton_3 = new JButton("Tab");
		btnNewButton_3.setBackground(Color.WHITE);
		panel_2_2.add(btnNewButton_3);
		
		JPanel panel_3_2 = new JPanel();
		panel_1_2.add(panel_3_2);
		
		JButton btnNewButton_1_2 = new JButton("Cash Out");
		panel_3_2.add(btnNewButton_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel.add(panel_1_3);
		panel_1_3.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		JLabel lblNewLabel_3 = new JLabel("Table 4");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_3.setBackground(Color.WHITE);
		panel_1_3.add(lblNewLabel_3);
		
		JPanel panel_2_3 = new JPanel();
		panel_1_3.add(panel_2_3);
		
		JButton btnNewButton_4 = new JButton("Tab");
		btnNewButton_4.setBackground(Color.WHITE);
		panel_2_3.add(btnNewButton_4);
		
		JPanel panel_3_3 = new JPanel();
		panel_1_3.add(panel_3_3);
		
		JButton btnNewButton_1_3 = new JButton("Cash Out");
		panel_3_3.add(btnNewButton_1_3);
		
		JPanel panel_1_4 = new JPanel();
		panel.add(panel_1_4);
		panel_1_4.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		JLabel lblNewLabel_4 = new JLabel("Table 5");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_4.setBackground(Color.WHITE);
		panel_1_4.add(lblNewLabel_4);
		
		JPanel panel_2_4 = new JPanel();
		panel_1_4.add(panel_2_4);
		
		JButton btnNewButton_5 = new JButton("Tab");
		btnNewButton_5.setBackground(Color.WHITE);
		panel_2_4.add(btnNewButton_5);
		
		JPanel panel_3_4 = new JPanel();
		panel_1_4.add(panel_3_4);
		
		JButton btnNewButton_1_4 = new JButton("Cash Out ");
		panel_3_4.add(btnNewButton_1_4);
		
		JPanel panel_1_5 = new JPanel();
		panel.add(panel_1_5);
		panel_1_5.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		JLabel lblNewLabel_5 = new JLabel("Table 6");
		lblNewLabel_5.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_5.setBackground(Color.WHITE);
		panel_1_5.add(lblNewLabel_5);
		
		JPanel panel_2_5 = new JPanel();
		panel_1_5.add(panel_2_5);
		
		JButton btnNewButton_6 = new JButton("Tab");
		btnNewButton_6.setBackground(Color.WHITE);
		panel_2_5.add(btnNewButton_6);
		
		JPanel panel_3_5 = new JPanel();
		panel_1_5.add(panel_3_5);
		
		JButton btnNewButton_1_5 = new JButton("Cash Out");
		panel_3_5.add(btnNewButton_1_5);
		
		JPanel panel_4 = new JPanel();
		layeredPane.add(panel_4, "name_279492568056700");
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 68, 728, 605);
		panel_4.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		panel_5.add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		JPanel chooseFood = new JPanel();
		chooseFood.setBackground(new Color(245, 245, 245));
		layeredPane_1.add(chooseFood, "name_283150248070400");
		chooseFood.setLayout(null);
		
		JButton btnNewButton = new JButton("Burgers");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(20, 152, 200, 175);
		chooseFood.add(btnNewButton);
		
		JButton btnChickenTenders = new JButton("Chicken Tenders");
		btnChickenTenders.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChickenTenders.setBounds(260, 156, 200, 175);
		chooseFood.add(btnChickenTenders);
		
		JButton btnSides = new JButton("Sides");
		btnSides.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnSides.setBounds(500, 156, 200, 175);
		chooseFood.add(btnSides);
		
		JButton btnNewButton_8_1 = new JButton("Dessert");
		btnNewButton_8_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_8_1.setBounds(500, 383, 200, 175);
		chooseFood.add(btnNewButton_8_1);
		
		JButton btnNewButton_7_1 = new JButton("Drinks");
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_7_1.setBounds(260, 383, 200, 175);
		chooseFood.add(btnNewButton_7_1);
		
		JButton btnNewButton_7_2 = new JButton("Salads");
		btnNewButton_7_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_7_2.setBounds(20, 383, 200, 175);
		chooseFood.add(btnNewButton_7_2);
		
		JLabel lblNewLabel_8 = new JLabel("Food");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(156, 11, 403, 75);
		chooseFood.add(lblNewLabel_8);
		
		JPanel cashOutScreen = new JPanel();
		layeredPane_1.add(cashOutScreen, "name_284758187107600");
		cashOutScreen.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Payment");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(236, 0, 197, 52);
		cashOutScreen.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Sub Total: ");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10.setBounds(134, 62, 343, 52);
		cashOutScreen.add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(506, 62, 139, 41);
		cashOutScreen.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Total with tax: ");
		lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_1.setBounds(134, 109, 343, 52);
		cashOutScreen.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("Tip: ");
		lblNewLabel_10_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_2.setBounds(134, 156, 343, 52);
		cashOutScreen.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("Total: ");
		lblNewLabel_10_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_2_1.setBounds(379, 221, 98, 52);
		cashOutScreen.add(lblNewLabel_10_2_1);
		
		JButton btnNewButton_8 = new JButton("Credit");
		btnNewButton_8.setBounds(232, 284, 123, 52);
		cashOutScreen.add(btnNewButton_8);
		
		JLabel lblNewLabel_11 = new JLabel("Choose Payment");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_11.setBounds(50, 295, 158, 41);
		cashOutScreen.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("or");
		lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_11_1.setBounds(381, 295, 67, 41);
		cashOutScreen.add(lblNewLabel_11_1);
		
		txtEnterInCash = new JTextField();
		txtEnterInCash.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEnterInCash.setText("Enter in Amount of Cash");
		txtEnterInCash.setBounds(471, 288, 174, 41);
		cashOutScreen.add(txtEnterInCash);
		txtEnterInCash.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(506, 114, 139, 41);
		cashOutScreen.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(506, 166, 139, 41);
		cashOutScreen.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(506, 221, 139, 41);
		cashOutScreen.add(textField_4);
		
		JButton btnNewButton_9 = new JButton("Cash Out");
		btnNewButton_9.setBounds(506, 346, 139, 41);
		cashOutScreen.add(btnNewButton_9);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(506, 439, 139, 41);
		cashOutScreen.add(textField_1);
		
		JLabel lblNewLabel_10_2_1_1 = new JLabel("Change: ");
		lblNewLabel_10_2_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_2_1_1.setBounds(134, 439, 343, 52);
		cashOutScreen.add(lblNewLabel_10_2_1_1);
		
		JPanel burgerScreen = new JPanel();
		layeredPane_1.add(burgerScreen, "name_357597043214500");
		burgerScreen.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Condiments", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(10, 73, 708, 191);
		burgerScreen.add(panel_7);
		panel_7.setLayout(null);
		
		JButton btnNewButton_11 = new JButton("Tomatos");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11.setBounds(10, 22, 120, 30);
		panel_7.add(btnNewButton_11);
		
		JButton btnNewButton_11_1 = new JButton("Extra Tomatos");
		btnNewButton_11_1.setBounds(10, 55, 120, 30);
		panel_7.add(btnNewButton_11_1);
		
		JButton btnNewButton_11_2 = new JButton("Onions");
		btnNewButton_11_2.setBounds(523, 22, 120, 30);
		panel_7.add(btnNewButton_11_2);
		
		JButton btnNewButton_11_2_1 = new JButton("Extra Onions");
		btnNewButton_11_2_1.setBounds(523, 55, 120, 30);
		panel_7.add(btnNewButton_11_2_1);
		
		JButton btnNewButton_11_2_2 = new JButton("Mayo");
		btnNewButton_11_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11_2_2.setBounds(139, 22, 120, 30);
		panel_7.add(btnNewButton_11_2_2);
		
		JButton btnNewButton_11_2_3 = new JButton("Extra Mayo");
		btnNewButton_11_2_3.setBounds(140, 55, 120, 30);
		panel_7.add(btnNewButton_11_2_3);
		
		JButton btnNewButton_11_3 = new JButton("Pickles");
		btnNewButton_11_3.setBounds(263, 22, 120, 30);
		panel_7.add(btnNewButton_11_3);
		
		JButton btnNewButton_11_1_1 = new JButton("Extra Pickles");
		btnNewButton_11_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11_1_1.setBounds(263, 55, 120, 30);
		panel_7.add(btnNewButton_11_1_1);
		
		JButton btnNewButton_11_2_4 = new JButton("Lettuce");
		btnNewButton_11_2_4.setBounds(393, 22, 120, 30);
		panel_7.add(btnNewButton_11_2_4);
		
		JButton btnNewButton_11_2_1_1 = new JButton("Extra Lettuce");
		btnNewButton_11_2_1_1.setBounds(393, 55, 120, 30);
		panel_7.add(btnNewButton_11_2_1_1);
		
		JButton btnNewButton_11_4 = new JButton("Ketchup");
		btnNewButton_11_4.setBounds(10, 96, 120, 30);
		panel_7.add(btnNewButton_11_4);
		
		JButton btnNewButton_11_1_2 = new JButton("Extra Ketchup");
		btnNewButton_11_1_2.setBounds(10, 129, 120, 30);
		panel_7.add(btnNewButton_11_1_2);
		
		JButton btnNewButton_11_2_5 = new JButton("Mustard");
		btnNewButton_11_2_5.setBounds(139, 96, 120, 30);
		panel_7.add(btnNewButton_11_2_5);
		
		JButton btnNewButton_11_2_1_2 = new JButton("Extra Mustard");
		btnNewButton_11_2_1_2.setBounds(139, 129, 120, 30);
		panel_7.add(btnNewButton_11_2_1_2);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setLayout(null);
		panel_7_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Cheese", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1.setBounds(10, 275, 708, 99);
		burgerScreen.add(panel_7_1);
		
		JButton btnNewButton_12 = new JButton("American");
		btnNewButton_12.setBounds(10, 24, 154, 52);
		panel_7_1.add(btnNewButton_12);
		
		JButton btnNewButton_12_1 = new JButton("Swiss");
		btnNewButton_12_1.setBounds(197, 24, 154, 52);
		panel_7_1.add(btnNewButton_12_1);
		
		JButton btnNewButton_12_2 = new JButton("Cheddar");
		btnNewButton_12_2.setBounds(380, 24, 154, 52);
		panel_7_1.add(btnNewButton_12_2);
		
		JButton btnNewButton_12_2_1 = new JButton("Colby Jack");
		btnNewButton_12_2_1.setBounds(544, 24, 154, 52);
		panel_7_1.add(btnNewButton_12_2_1);
		
		JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Meat", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1.setBounds(10, 385, 708, 99);
		burgerScreen.add(panel_7_1_1);
		
		JButton btnNewButton_12_3 = new JButton("Quarter pound");
		btnNewButton_12_3.setBounds(10, 24, 154, 52);
		panel_7_1_1.add(btnNewButton_12_3);
		
		JButton btnNewButton_12_1_1 = new JButton("Half Pound");
		btnNewButton_12_1_1.setBounds(197, 24, 154, 52);
		panel_7_1_1.add(btnNewButton_12_1_1);
		
		JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Bread", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1.setBounds(10, 495, 708, 99);
		burgerScreen.add(panel_7_1_1_1);
		
		JButton btnNewButton_12_3_1 = new JButton("Hamburger Bun");
		btnNewButton_12_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12_3_1.setBounds(10, 24, 154, 52);
		panel_7_1_1_1.add(btnNewButton_12_3_1);
		
		JButton btnNewButton_12_1_1_1 = new JButton("Sourdough");
		btnNewButton_12_1_1_1.setBounds(197, 24, 154, 52);
		panel_7_1_1_1.add(btnNewButton_12_1_1_1);
		
		JButton btnNewButton_12_1_1_1_1 = new JButton("Rye");
		btnNewButton_12_1_1_1_1.setBounds(361, 24, 154, 52);
		panel_7_1_1_1.add(btnNewButton_12_1_1_1_1);
		
		JLabel lblNewLabel_12 = new JLabel("Burgers");
		lblNewLabel_12.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12.setForeground(Color.RED);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(187, 11, 284, 51);
		burgerScreen.add(lblNewLabel_12);
		
		JPanel chicken = new JPanel();
		chicken.setLayout(null);
		layeredPane_1.add(chicken, "name_360921205834800");
		
		JPanel panel_7_2 = new JPanel();
		panel_7_2.setLayout(null);
		panel_7_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Number of Tenders", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2.setBounds(10, 107, 708, 128);
		chicken.add(panel_7_2);
		
		JButton btnNewButton_12_4_1 = new JButton("1pc");
		btnNewButton_12_4_1.setBounds(10, 41, 154, 52);
		panel_7_2.add(btnNewButton_12_4_1);
		
		JButton btnNewButton_12_4_2 = new JButton("4pc");
		btnNewButton_12_4_2.setBounds(184, 41, 154, 52);
		panel_7_2.add(btnNewButton_12_4_2);
		
		JButton btnNewButton_12_4_3 = new JButton("8pc");
		btnNewButton_12_4_3.setBounds(348, 41, 154, 52);
		panel_7_2.add(btnNewButton_12_4_3);
		
		JPanel panel_7_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Sauces", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1.setBounds(10, 246, 708, 211);
		chicken.add(panel_7_1_1_1_1);
		
		JButton btnNewButton_12_4_1_1 = new JButton("Ranch");
		btnNewButton_12_4_1_1.setBounds(10, 25, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1);
		
		JButton btnNewButton_12_4_1_1_1 = new JButton("Sweet and Sour");
		btnNewButton_12_4_1_1_1.setBounds(188, 25, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1 = new JButton("BBQ");
		btnNewButton_12_4_1_1_1_1.setBounds(352, 25, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1_1 = new JButton("Honey Mustard");
		btnNewButton_12_4_1_1_1_1_1.setBounds(516, 25, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2 = new JButton("Chipotle BBQ");
		btnNewButton_12_4_1_1_1_1_2.setBounds(10, 113, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2);
		
		JButton btnNewButton_12_4_1_1_1_1_3 = new JButton("Buffalo");
		btnNewButton_12_4_1_1_1_1_3.setBounds(188, 113, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_3);
		
		JButton btnNewButton_12_4_1_1_1_1_2_2 = new JButton("Ketchup");
		btnNewButton_12_4_1_1_1_1_2_2.setBounds(352, 113, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_2);
		
		JButton btnNewButton_12_4_1_1_1_1_2_3 = new JButton("Mustard");
		btnNewButton_12_4_1_1_1_1_2_3.setBounds(516, 113, 154, 52);
		panel_7_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_3);
		
		JLabel lblNewLabel_12_1 = new JLabel("Chicken");
		lblNewLabel_12_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1.setForeground(Color.RED);
		lblNewLabel_12_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_1.setBounds(195, 27, 284, 51);
		chicken.add(lblNewLabel_12_1);
		
		JPanel Sides = new JPanel();
		Sides.setLayout(null);
		layeredPane_1.add(Sides, "name_361320264502300");
		
		JPanel panel_7_2_1 = new JPanel();
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Fries", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1.setBounds(10, 149, 286, 128);
		Sides.add(panel_7_2_1);
		
		JButton btnNewButton_12_4_1_2 = new JButton("Regular");
		btnNewButton_12_4_1_2.setBounds(10, 41, 98, 52);
		panel_7_2_1.add(btnNewButton_12_4_1_2);
		
		JButton btnNewButton_12_4_2_1 = new JButton("Large");
		btnNewButton_12_4_2_1.setBounds(138, 41, 98, 52);
		panel_7_2_1.add(btnNewButton_12_4_2_1);
		
		JPanel panel_7_2_1_1 = new JPanel();
		panel_7_2_1_1.setLayout(null);
		panel_7_2_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Onion Rings", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1.setBounds(401, 149, 286, 128);
		Sides.add(panel_7_2_1_1);
		
		JButton btnNewButton_12_4_1_2_1 = new JButton("Regular");
		btnNewButton_12_4_1_2_1.setBounds(10, 41, 98, 52);
		panel_7_2_1_1.add(btnNewButton_12_4_1_2_1);
		
		JButton btnNewButton_12_4_2_1_1 = new JButton("Large");
		btnNewButton_12_4_2_1_1.setBounds(138, 41, 98, 52);
		panel_7_2_1_1.add(btnNewButton_12_4_2_1_1);
		
		JPanel panel_7_2_1_1_1 = new JPanel();
		panel_7_2_1_1_1.setLayout(null);
		panel_7_2_1_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Chesse curds", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1_1.setBounds(10, 303, 286, 128);
		Sides.add(panel_7_2_1_1_1);
		
		JButton btnNewButton_12_4_1_2_1_1 = new JButton("Regular");
		btnNewButton_12_4_1_2_1_1.setBounds(10, 41, 98, 52);
		panel_7_2_1_1_1.add(btnNewButton_12_4_1_2_1_1);
		
		JButton btnNewButton_12_4_2_1_1_1 = new JButton("Large");
		btnNewButton_12_4_2_1_1_1.setBounds(138, 41, 98, 52);
		panel_7_2_1_1_1.add(btnNewButton_12_4_2_1_1_1);
		
		JPanel panel_7_2_1_1_2 = new JPanel();
		panel_7_2_1_1_2.setLayout(null);
		panel_7_2_1_1_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Onion Rings", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1_2.setBounds(401, 303, 286, 128);
		Sides.add(panel_7_2_1_1_2);
		
		JButton btnNewButton_12_4_1_2_1_2 = new JButton("Regular");
		btnNewButton_12_4_1_2_1_2.setBounds(10, 41, 98, 52);
		panel_7_2_1_1_2.add(btnNewButton_12_4_1_2_1_2);
		
		JButton btnNewButton_12_4_2_1_1_2 = new JButton("Large");
		btnNewButton_12_4_2_1_1_2.setBounds(138, 41, 98, 52);
		panel_7_2_1_1_2.add(btnNewButton_12_4_2_1_1_2);
		
		JPanel panel_7_2_1_1_3 = new JPanel();
		panel_7_2_1_1_3.setLayout(null);
		panel_7_2_1_1_3.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Mozzarella Sticks", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1_3.setBounds(10, 451, 286, 128);
		Sides.add(panel_7_2_1_1_3);
		
		JButton btnNewButton_12_4_1_2_1_3 = new JButton("Regular");
		btnNewButton_12_4_1_2_1_3.setBounds(10, 41, 98, 52);
		panel_7_2_1_1_3.add(btnNewButton_12_4_1_2_1_3);
		
		JButton btnNewButton_12_4_2_1_1_3 = new JButton("Large");
		btnNewButton_12_4_2_1_1_3.setBounds(138, 41, 98, 52);
		panel_7_2_1_1_3.add(btnNewButton_12_4_2_1_1_3);
		
		JPanel panel_7_2_1_1_4 = new JPanel();
		panel_7_2_1_1_4.setLayout(null);
		panel_7_2_1_1_4.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Waffle Fries", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_1_1_4.setBounds(401, 451, 286, 128);
		Sides.add(panel_7_2_1_1_4);
		
		JButton btnNewButton_12_4_1_2_1_4 = new JButton("Regular");
		btnNewButton_12_4_1_2_1_4.setBounds(10, 41, 98, 52);
		panel_7_2_1_1_4.add(btnNewButton_12_4_1_2_1_4);
		
		JButton btnNewButton_12_4_2_1_1_4 = new JButton("Large");
		btnNewButton_12_4_2_1_1_4.setBounds(138, 41, 98, 52);
		panel_7_2_1_1_4.add(btnNewButton_12_4_2_1_1_4);
		
		JLabel lblNewLabel_12_2 = new JLabel("Sides");
		lblNewLabel_12_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_2.setForeground(Color.RED);
		lblNewLabel_12_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_2.setBounds(196, 50, 284, 51);
		Sides.add(lblNewLabel_12_2);
		
		JPanel salad = new JPanel();
		salad.setLayout(null);
		layeredPane_1.add(salad, "name_362045875581000");
		
		JPanel panel_7_2_2 = new JPanel();
		panel_7_2_2.setLayout(null);
		panel_7_2_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Toppings", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_2.setBounds(10, 107, 708, 186);
		salad.add(panel_7_2_2);
		
		JButton btnNewButton_12_4_1_3 = new JButton("Carrots");
		btnNewButton_12_4_1_3.setBounds(10, 41, 154, 52);
		panel_7_2_2.add(btnNewButton_12_4_1_3);
		
		JButton btnNewButton_12_4_2_2 = new JButton("Grape Tomatos");
		btnNewButton_12_4_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12_4_2_2.setBounds(184, 41, 154, 52);
		panel_7_2_2.add(btnNewButton_12_4_2_2);
		
		JButton btnNewButton_12_4_3_1 = new JButton("cucumber");
		btnNewButton_12_4_3_1.setBounds(348, 41, 154, 52);
		panel_7_2_2.add(btnNewButton_12_4_3_1);
		
		JButton btnNewButton_12_4_3_1_1 = new JButton("onion");
		btnNewButton_12_4_3_1_1.setBounds(512, 41, 154, 52);
		panel_7_2_2.add(btnNewButton_12_4_3_1_1);
		
		JButton btnNewButton_12_4_1_3_1 = new JButton("Shredded Cheese");
		btnNewButton_12_4_1_3_1.setBounds(10, 104, 154, 52);
		panel_7_2_2.add(btnNewButton_12_4_1_3_1);
		
		JButton btnNewButton_12_4_2_2_1 = new JButton("Croutons");
		btnNewButton_12_4_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12_4_2_2_1.setBounds(184, 104, 154, 52);
		panel_7_2_2.add(btnNewButton_12_4_2_2_1);
		
		JPanel panel_7_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Sauces", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1_1.setBounds(10, 324, 708, 232);
		salad.add(panel_7_1_1_1_1_1);
		
		JButton btnNewButton_12_4_1_1_2 = new JButton("Ranch");
		btnNewButton_12_4_1_1_2.setBounds(10, 25, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_2);
		
		JButton btnNewButton_12_4_1_1_1_2 = new JButton("Sweet and Sour");
		btnNewButton_12_4_1_1_1_2.setBounds(188, 25, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_2);
		
		JButton btnNewButton_12_4_1_1_1_1_4 = new JButton("BBQ");
		btnNewButton_12_4_1_1_1_1_4.setBounds(352, 25, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_4);
		
		JButton btnNewButton_12_4_1_1_1_1_1_1 = new JButton("Honey Mustard");
		btnNewButton_12_4_1_1_1_1_1_1.setBounds(516, 25, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1 = new JButton("Chipotle BBQ");
		btnNewButton_12_4_1_1_1_1_2_1.setBounds(10, 88, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1);
		
		JButton btnNewButton_12_4_1_1_1_1_3_1 = new JButton("Buffalo");
		btnNewButton_12_4_1_1_1_1_3_1.setBounds(188, 88, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_3_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_2_1 = new JButton("Ketchup");
		btnNewButton_12_4_1_1_1_1_2_2_1.setBounds(352, 88, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_2_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_3_1 = new JButton("Mustard");
		btnNewButton_12_4_1_1_1_1_2_3_1.setBounds(516, 88, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_3_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1_1 = new JButton("1000 island");
		btnNewButton_12_4_1_1_1_1_2_1_1.setBounds(10, 151, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1_1);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1_2 = new JButton("Blue Cheese");
		btnNewButton_12_4_1_1_1_1_2_1_2.setBounds(188, 151, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1_2);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1_3 = new JButton("French");
		btnNewButton_12_4_1_1_1_1_2_1_3.setBounds(352, 151, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1_3);
		
		JButton btnNewButton_12_4_1_1_1_1_2_1_4 = new JButton("Italian");
		btnNewButton_12_4_1_1_1_1_2_1_4.setBounds(516, 151, 154, 52);
		panel_7_1_1_1_1_1.add(btnNewButton_12_4_1_1_1_1_2_1_4);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("Salad");
		lblNewLabel_12_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1_1.setForeground(Color.RED);
		lblNewLabel_12_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_1_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_1_1.setBounds(195, 27, 284, 51);
		salad.add(lblNewLabel_12_1_1);
		
		JPanel Drinks = new JPanel();
		Drinks.setLayout(null);
		layeredPane_1.add(Drinks, "name_362790125265300");
		
		JPanel panel_7_2_3 = new JPanel();
		panel_7_2_3.setLayout(null);
		panel_7_2_3.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Size", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_2_3.setBounds(10, 311, 708, 128);
		Drinks.add(panel_7_2_3);
		
		JButton btnNewButton_12_4_1_4 = new JButton("Small");
		btnNewButton_12_4_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12_4_1_4.setBounds(10, 41, 154, 52);
		panel_7_2_3.add(btnNewButton_12_4_1_4);
		
		JButton btnNewButton_12_4_2_3 = new JButton("Regular");
		btnNewButton_12_4_2_3.setBounds(184, 41, 154, 52);
		panel_7_2_3.add(btnNewButton_12_4_2_3);
		
		JButton btnNewButton_12_4_3_2 = new JButton("Large");
		btnNewButton_12_4_3_2.setBounds(348, 41, 154, 52);
		panel_7_2_3.add(btnNewButton_12_4_3_2);
		
		JPanel panel_7_1_1_1_1_2 = new JPanel();
		panel_7_1_1_1_1_2.setLayout(null);
		panel_7_1_1_1_1_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Type of drink", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1_2.setBounds(10, 89, 708, 211);
		Drinks.add(panel_7_1_1_1_1_2);
		
		JButton btnNewButton_12_4_1_1_3 = new JButton("Pepsi");
		btnNewButton_12_4_1_1_3.setBounds(10, 25, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_3);
		
		JButton btnNewButton_12_4_1_1_1_3 = new JButton("Diet Pepsi");
		btnNewButton_12_4_1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12_4_1_1_1_3.setBounds(188, 25, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_3);
		
		JButton btnNewButton_12_4_1_1_1_1_5 = new JButton("Mtn Dew");
		btnNewButton_12_4_1_1_1_1_5.setBounds(352, 25, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_1_5);
		
		JButton btnNewButton_12_4_1_1_1_1_1_2 = new JButton("Rootbeer");
		btnNewButton_12_4_1_1_1_1_1_2.setBounds(516, 25, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_1_1_2);
		
		JButton btnNewButton_12_4_1_1_1_1_2_4 = new JButton("Dr.Pepper");
		btnNewButton_12_4_1_1_1_1_2_4.setBounds(10, 113, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_1_2_4);
		
		JButton btnNewButton_12_4_1_1_1_1_3_2 = new JButton("Sprite");
		btnNewButton_12_4_1_1_1_1_3_2.setBounds(188, 113, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_1_3_2);
		
		JButton btnNewButton_12_4_1_1_1_1_2_2_2 = new JButton("Ice Tea");
		btnNewButton_12_4_1_1_1_1_2_2_2.setBounds(352, 113, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_1_2_2_2);
		
		JButton btnNewButton_12_4_1_1_1_1_2_3_2 = new JButton("Milk");
		btnNewButton_12_4_1_1_1_1_2_3_2.setBounds(516, 113, 154, 52);
		panel_7_1_1_1_1_2.add(btnNewButton_12_4_1_1_1_1_2_3_2);
		
		JLabel lblNewLabel_12_1_2 = new JLabel("Drinks");
		lblNewLabel_12_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1_2.setForeground(Color.RED);
		lblNewLabel_12_1_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_1_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_1_2.setBounds(195, 27, 284, 51);
		Drinks.add(lblNewLabel_12_1_2);
		
		JPanel Dessert = new JPanel();
		Dessert.setLayout(null);
		layeredPane_1.add(Dessert, "name_363207220296900");
		
		JPanel panel_7_1_1_1_1_2_1 = new JPanel();
		panel_7_1_1_1_1_2_1.setLayout(null);
		panel_7_1_1_1_1_2_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Shakes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1_2_1.setBounds(10, 89, 708, 128);
		Dessert.add(panel_7_1_1_1_1_2_1);
		
		JButton btnNewButton_12_4_1_4_1_1 = new JButton("Chocolate");
		btnNewButton_12_4_1_4_1_1.setBounds(10, 35, 154, 52);
		panel_7_1_1_1_1_2_1.add(btnNewButton_12_4_1_4_1_1);
		
		JButton btnNewButton_12_4_1_4_1_2 = new JButton("Strawberry");
		btnNewButton_12_4_1_4_1_2.setBounds(188, 35, 154, 52);
		panel_7_1_1_1_1_2_1.add(btnNewButton_12_4_1_4_1_2);
		
		JButton btnNewButton_12_4_1_4_1_3 = new JButton("Vanilla");
		btnNewButton_12_4_1_4_1_3.setBounds(371, 35, 154, 52);
		panel_7_1_1_1_1_2_1.add(btnNewButton_12_4_1_4_1_3);
		
		JLabel lblNewLabel_12_1_2_1 = new JLabel("Dessert");
		lblNewLabel_12_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1_2_1.setForeground(Color.RED);
		lblNewLabel_12_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_12_1_2_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12_1_2_1.setBounds(195, 27, 284, 51);
		Dessert.add(lblNewLabel_12_1_2_1);
		
		JPanel panel_7_1_1_1_1_2_1_1 = new JPanel();
		panel_7_1_1_1_1_2_1_1.setLayout(null);
		panel_7_1_1_1_1_2_1_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Sundaes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7_1_1_1_1_2_1_1.setBounds(10, 235, 708, 128);
		Dessert.add(panel_7_1_1_1_1_2_1_1);
		
		JButton btnNewButton_12_4_1_4_1_1_1 = new JButton("Chocolate");
		btnNewButton_12_4_1_4_1_1_1.setBounds(10, 35, 154, 52);
		panel_7_1_1_1_1_2_1_1.add(btnNewButton_12_4_1_4_1_1_1);
		
		JButton btnNewButton_12_4_1_4_1_2_1 = new JButton("Strawberry");
		btnNewButton_12_4_1_4_1_2_1.setBounds(188, 35, 154, 52);
		panel_7_1_1_1_1_2_1_1.add(btnNewButton_12_4_1_4_1_2_1);
		
		JButton btnNewButton_12_4_1_4_1_3_1 = new JButton("Vanilla");
		btnNewButton_12_4_1_4_1_3_1.setBounds(371, 35, 154, 52);
		panel_7_1_1_1_1_2_1_1.add(btnNewButton_12_4_1_4_1_3_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(728, 0, 268, 673);
		panel_6.setBackground(new Color(245, 245, 245));
		panel_4.add(panel_6);
		panel_6.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 5, 258, 568);
		scrollPane.setViewportBorder(new TitledBorder(null, "Tab", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(30);
		textArea.setColumns(30);
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel_10_2_1_2 = new JLabel("Sub Total: ");
		lblNewLabel_10_2_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10_2_1_2.setBounds(15, 589, 98, 52);
		panel_6.add(lblNewLabel_10_2_1_2);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(119, 599, 139, 41);
		panel_6.add(textField_5);
		
		JButton btnNewButton_7 = new JButton("Home");
		btnNewButton_7.setBounds(10, 17, 94, 40);
		panel_4.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("Back ");
		btnNewButton_10.setBounds(119, 17, 108, 40);
		panel_4.add(btnNewButton_10);
		frmRegister.setBounds(100, 100, 1000, 700);
		frmRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
