package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import timers.Timers;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class Main {
	// Customizable text (Default values)
	public static String championsHeader = "Champions";
	public static String summonersHeader = "Summoners";
	public static String jungleHeader = "Jungle";
	public static String version = "5.8";
	public static String title = "Timers for " + version;
		
	// Image parameters (Default values)
	public static int champsPerLine = 13;
	public static int iconSize = 80;
	public static int canvasSize = 120;
	public static int fontSize = 14;
	public static int headerFontSize = 42;
	public static int titleFontSize = 8;
		
	// Color options (Default values)
	public static Color background = Color.white;
	public static Color timerText = Color.black;
	public static Color headerText = Color.black;
	public static Color headerLine = Color.black;
	public static Color titleText = Color.black;
	
	// DO NOT MODIFY
	public File selectedFolder;
	private JFrame frmLolTimers;
	private JTextField champText;
	private JTextField summonerText;
	private JTextField jungleText;
	private JTextField versionText;
	private JTextField subtitleText;
	private JLabel lblChampion;
	private JLabel lblNewLabel;
	private JLabel lblTextCustomization;
	private JLabel lblJungle;
	private JLabel lblVersion;
	private JLabel lblSubtitle;
	private JLabel lblNewLabel_1;
	
	public JTextField champsPerLineField;
	public JTextField iconSizeField;
	public JTextField paddingField;
	public JTextField timerFontSizeField;
	public JTextField headerFontSizeField;
	public JTextField titleFontSizeField;
	
	private JLabel lblNewLabel_2;
	private JLabel lblIconSize;
	private JLabel lblCanvasSize;
	private JLabel lblTimerFontSize;
	private JLabel lblHeaderFontSize;
	private JLabel lblTitleFontSize;
	private Component horizontalStrut;
	private JLabel lblColorCustomization;
	private JLabel lblBackground;
	private JLabel lblTimerText;
	private JLabel lblHeaderText;
	private JLabel lblHeaderLine;
	private JLabel lblTitleText;
	private JButton timerTextColorPickerButton;
	private JButton backgroundColorPickerButton;
	private JButton headerTextColorPickerButton;
	private JButton headerLineColorPickerButton;
	private JButton titleTextColorPickerButton;
	private JLabel backgroundIndicator;
	private JLabel timerTextIndicator;
	private JLabel headerTextIndicator;
	private JLabel headerLineIndicator;
	private JLabel titleTextIndicator;
	private Component verticalStrut;
	private Component horizontalStrut_1;
	private Component horizontalStrut_2;
	private Component horizontalStrut_3;
	private JTextField textField;
	private JLabel lblSaveTo;
	private JLabel lblClickBoxTo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmLolTimers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		frmLolTimers = new JFrame();
		frmLolTimers.setTitle("LoL Timers");
		frmLolTimers.setBounds(100, 100, 570, 350);
		frmLolTimers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 90, 0, 0, 0, 0, 0, 0, 0, 40, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmLolTimers.getContentPane().setLayout(gridBagLayout);
		
		verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		frmLolTimers.getContentPane().add(verticalStrut, gbc_verticalStrut);
		
		horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_1.gridx = 4;
		gbc_horizontalStrut_1.gridy = 0;
		frmLolTimers.getContentPane().add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		horizontalStrut_2 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_2 = new GridBagConstraints();
		gbc_horizontalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_2.gridx = 7;
		gbc_horizontalStrut_2.gridy = 0;
		frmLolTimers.getContentPane().add(horizontalStrut_2, gbc_horizontalStrut_2);
		
		horizontalStrut_3 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_3 = new GridBagConstraints();
		gbc_horizontalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_3.gridx = 10;
		gbc_horizontalStrut_3.gridy = 0;
		frmLolTimers.getContentPane().add(horizontalStrut_3, gbc_horizontalStrut_3);
		
		lblTextCustomization = new JLabel("Text Customization");
		lblTextCustomization.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblTextCustomization = new GridBagConstraints();
		gbc_lblTextCustomization.gridwidth = 2;
		gbc_lblTextCustomization.insets = new Insets(0, 0, 5, 5);
		gbc_lblTextCustomization.gridx = 2;
		gbc_lblTextCustomization.gridy = 1;
		frmLolTimers.getContentPane().add(lblTextCustomization, gbc_lblTextCustomization);
		
		lblNewLabel_1 = new JLabel("Layout Customization");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 5;
		gbc_lblNewLabel_1.gridy = 1;
		frmLolTimers.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblColorCustomization = new JLabel("Color Customization");
		lblColorCustomization.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblColorCustomization = new GridBagConstraints();
		gbc_lblColorCustomization.gridwidth = 2;
		gbc_lblColorCustomization.insets = new Insets(0, 0, 5, 5);
		gbc_lblColorCustomization.gridx = 8;
		gbc_lblColorCustomization.gridy = 1;
		frmLolTimers.getContentPane().add(lblColorCustomization, gbc_lblColorCustomization);
		
		lblChampion = new JLabel("Champion:");
		lblChampion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblChampion = new GridBagConstraints();
		gbc_lblChampion.insets = new Insets(0, 0, 5, 5);
		gbc_lblChampion.anchor = GridBagConstraints.EAST;
		gbc_lblChampion.gridx = 2;
		gbc_lblChampion.gridy = 2;
		frmLolTimers.getContentPane().add(lblChampion, gbc_lblChampion);
		
		champText = new JTextField();
		champText.setText("Champions");
		GridBagConstraints gbc_champText = new GridBagConstraints();
		gbc_champText.insets = new Insets(0, 0, 5, 5);
		gbc_champText.fill = GridBagConstraints.HORIZONTAL;
		gbc_champText.gridx = 3;
		gbc_champText.gridy = 2;
		frmLolTimers.getContentPane().add(champText, gbc_champText);
		champText.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Champions per line:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.gridx = 5;
		gbc_lblNewLabel_2.gridy = 2;
		frmLolTimers.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		champsPerLineField = new JTextField();
		champsPerLineField.setText("13");
		GridBagConstraints gbc_champsPerLine = new GridBagConstraints();
		gbc_champsPerLine.insets = new Insets(0, 0, 5, 5);
		gbc_champsPerLine.fill = GridBagConstraints.HORIZONTAL;
		gbc_champsPerLine.gridx = 6;
		gbc_champsPerLine.gridy = 2;
		frmLolTimers.getContentPane().add(champsPerLineField, gbc_champsPerLine);
		champsPerLineField.setColumns(10);
		
		lblBackground = new JLabel("Background:");
		lblBackground.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblBackground = new GridBagConstraints();
		gbc_lblBackground.insets = new Insets(0, 0, 5, 5);
		gbc_lblBackground.anchor = GridBagConstraints.EAST;
		gbc_lblBackground.gridx = 8;
		gbc_lblBackground.gridy = 2;
		frmLolTimers.getContentPane().add(lblBackground, gbc_lblBackground);
		
		backgroundColorPickerButton = new JButton("Pick");
		GridBagConstraints gbc_btnPick = new GridBagConstraints();
		gbc_btnPick.insets = new Insets(0, 0, 5, 5);
		gbc_btnPick.gridx = 9;
		gbc_btnPick.gridy = 2;
		frmLolTimers.getContentPane().add(backgroundColorPickerButton, gbc_btnPick);
		
		backgroundIndicator = new JLabel("SIZE");
		GridBagConstraints gbc_backgroundIndicator = new GridBagConstraints();
		gbc_backgroundIndicator.insets = new Insets(0, 0, 5, 5);
		gbc_backgroundIndicator.gridx = 10;
		gbc_backgroundIndicator.gridy = 2;
		frmLolTimers.getContentPane().add(backgroundIndicator, gbc_backgroundIndicator);
		
		horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 1;
		gbc_horizontalStrut.gridy = 3;
		frmLolTimers.getContentPane().add(horizontalStrut, gbc_horizontalStrut);
		
		lblNewLabel = new JLabel("Summoner:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 3;
		frmLolTimers.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		summonerText = new JTextField();
		summonerText.setText("Summoners");
		GridBagConstraints gbc_summonerText = new GridBagConstraints();
		gbc_summonerText.insets = new Insets(0, 0, 5, 5);
		gbc_summonerText.fill = GridBagConstraints.HORIZONTAL;
		gbc_summonerText.gridx = 3;
		gbc_summonerText.gridy = 3;
		frmLolTimers.getContentPane().add(summonerText, gbc_summonerText);
		summonerText.setColumns(10);
		
		lblIconSize = new JLabel("Icon size:");
		lblIconSize.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblIconSize = new GridBagConstraints();
		gbc_lblIconSize.insets = new Insets(0, 0, 5, 5);
		gbc_lblIconSize.anchor = GridBagConstraints.EAST;
		gbc_lblIconSize.gridx = 5;
		gbc_lblIconSize.gridy = 3;
		frmLolTimers.getContentPane().add(lblIconSize, gbc_lblIconSize);
		
		iconSizeField = new JTextField();
		iconSizeField.setText("80");
		iconSizeField.setColumns(10);
		GridBagConstraints gbc_iconSize = new GridBagConstraints();
		gbc_iconSize.insets = new Insets(0, 0, 5, 5);
		gbc_iconSize.fill = GridBagConstraints.HORIZONTAL;
		gbc_iconSize.gridx = 6;
		gbc_iconSize.gridy = 3;
		frmLolTimers.getContentPane().add(iconSizeField, gbc_iconSize);
		
		lblTimerText = new JLabel("Timer text:");
		lblTimerText.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblTimerText = new GridBagConstraints();
		gbc_lblTimerText.insets = new Insets(0, 0, 5, 5);
		gbc_lblTimerText.anchor = GridBagConstraints.EAST;
		gbc_lblTimerText.gridx = 8;
		gbc_lblTimerText.gridy = 3;
		frmLolTimers.getContentPane().add(lblTimerText, gbc_lblTimerText);
		
		timerTextColorPickerButton = new JButton("Pick");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 9;
		gbc_btnNewButton_1.gridy = 3;
		frmLolTimers.getContentPane().add(timerTextColorPickerButton, gbc_btnNewButton_1);
		
		timerTextIndicator = new JLabel("SIZE");
		GridBagConstraints gbc_timerTextIndicator = new GridBagConstraints();
		gbc_timerTextIndicator.insets = new Insets(0, 0, 5, 5);
		gbc_timerTextIndicator.gridx = 10;
		gbc_timerTextIndicator.gridy = 3;
		frmLolTimers.getContentPane().add(timerTextIndicator, gbc_timerTextIndicator);
		
		lblJungle = new JLabel("Jungle:");
		lblJungle.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblJungle.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblJungle = new GridBagConstraints();
		gbc_lblJungle.insets = new Insets(0, 0, 5, 5);
		gbc_lblJungle.anchor = GridBagConstraints.EAST;
		gbc_lblJungle.gridx = 2;
		gbc_lblJungle.gridy = 4;
		frmLolTimers.getContentPane().add(lblJungle, gbc_lblJungle);
		
		jungleText = new JTextField();
		jungleText.setText("Jungle");
		GridBagConstraints gbc_jungleText = new GridBagConstraints();
		gbc_jungleText.insets = new Insets(0, 0, 5, 5);
		gbc_jungleText.fill = GridBagConstraints.HORIZONTAL;
		gbc_jungleText.gridx = 3;
		gbc_jungleText.gridy = 4;
		frmLolTimers.getContentPane().add(jungleText, gbc_jungleText);
		jungleText.setColumns(10);
		
		lblCanvasSize = new JLabel("Padding:");
		lblCanvasSize.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblCanvasSize = new GridBagConstraints();
		gbc_lblCanvasSize.insets = new Insets(0, 0, 5, 5);
		gbc_lblCanvasSize.anchor = GridBagConstraints.EAST;
		gbc_lblCanvasSize.gridx = 5;
		gbc_lblCanvasSize.gridy = 4;
		frmLolTimers.getContentPane().add(lblCanvasSize, gbc_lblCanvasSize);
		
		paddingField = new JTextField();
		paddingField.setText("40");
		paddingField.setColumns(10);
		GridBagConstraints gbc_padding = new GridBagConstraints();
		gbc_padding.insets = new Insets(0, 0, 5, 5);
		gbc_padding.fill = GridBagConstraints.HORIZONTAL;
		gbc_padding.gridx = 6;
		gbc_padding.gridy = 4;
		frmLolTimers.getContentPane().add(paddingField, gbc_padding);
		
		lblHeaderText = new JLabel("Header text:");
		lblHeaderText.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblHeaderText = new GridBagConstraints();
		gbc_lblHeaderText.insets = new Insets(0, 0, 5, 5);
		gbc_lblHeaderText.anchor = GridBagConstraints.EAST;
		gbc_lblHeaderText.gridx = 8;
		gbc_lblHeaderText.gridy = 4;
		frmLolTimers.getContentPane().add(lblHeaderText, gbc_lblHeaderText);
		
		headerTextColorPickerButton = new JButton("Pick");
		GridBagConstraints gbc_btnPick_1 = new GridBagConstraints();
		gbc_btnPick_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnPick_1.gridx = 9;
		gbc_btnPick_1.gridy = 4;
		frmLolTimers.getContentPane().add(headerTextColorPickerButton, gbc_btnPick_1);
		
		headerTextIndicator = new JLabel("SIZE");
		GridBagConstraints gbc_headerTextIndicator = new GridBagConstraints();
		gbc_headerTextIndicator.insets = new Insets(0, 0, 5, 5);
		gbc_headerTextIndicator.gridx = 10;
		gbc_headerTextIndicator.gridy = 4;
		frmLolTimers.getContentPane().add(headerTextIndicator, gbc_headerTextIndicator);
		
		lblVersion = new JLabel("Version:");
		lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblVersion.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblVersion = new GridBagConstraints();
		gbc_lblVersion.insets = new Insets(0, 0, 5, 5);
		gbc_lblVersion.anchor = GridBagConstraints.EAST;
		gbc_lblVersion.gridx = 2;
		gbc_lblVersion.gridy = 5;
		frmLolTimers.getContentPane().add(lblVersion, gbc_lblVersion);
		
		versionText = new JTextField();
		versionText.setText(version);
		GridBagConstraints gbc_versionText = new GridBagConstraints();
		gbc_versionText.insets = new Insets(0, 0, 5, 5);
		gbc_versionText.fill = GridBagConstraints.HORIZONTAL;
		gbc_versionText.gridx = 3;
		gbc_versionText.gridy = 5;
		frmLolTimers.getContentPane().add(versionText, gbc_versionText);
		versionText.setColumns(10);
		
		lblTimerFontSize = new JLabel("Timer font size:");
		lblTimerFontSize.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblTimerFontSize = new GridBagConstraints();
		gbc_lblTimerFontSize.insets = new Insets(0, 0, 5, 5);
		gbc_lblTimerFontSize.anchor = GridBagConstraints.EAST;
		gbc_lblTimerFontSize.gridx = 5;
		gbc_lblTimerFontSize.gridy = 5;
		frmLolTimers.getContentPane().add(lblTimerFontSize, gbc_lblTimerFontSize);
		
		timerFontSizeField = new JTextField();
		timerFontSizeField.setText("14");
		timerFontSizeField.setColumns(10);
		GridBagConstraints gbc_timerFontSize = new GridBagConstraints();
		gbc_timerFontSize.insets = new Insets(0, 0, 5, 5);
		gbc_timerFontSize.fill = GridBagConstraints.HORIZONTAL;
		gbc_timerFontSize.gridx = 6;
		gbc_timerFontSize.gridy = 5;
		frmLolTimers.getContentPane().add(timerFontSizeField, gbc_timerFontSize);
		
		lblHeaderLine = new JLabel("Header line:");
		lblHeaderLine.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblHeaderLine = new GridBagConstraints();
		gbc_lblHeaderLine.insets = new Insets(0, 0, 5, 5);
		gbc_lblHeaderLine.anchor = GridBagConstraints.EAST;
		gbc_lblHeaderLine.gridx = 8;
		gbc_lblHeaderLine.gridy = 5;
		frmLolTimers.getContentPane().add(lblHeaderLine, gbc_lblHeaderLine);
		
		headerLineColorPickerButton = new JButton("Pick");
		GridBagConstraints gbc_btnPick_2 = new GridBagConstraints();
		gbc_btnPick_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnPick_2.gridx = 9;
		gbc_btnPick_2.gridy = 5;
		frmLolTimers.getContentPane().add(headerLineColorPickerButton, gbc_btnPick_2);
		
		headerLineIndicator = new JLabel("SIZE");
		GridBagConstraints gbc_headerLineIndicator = new GridBagConstraints();
		gbc_headerLineIndicator.insets = new Insets(0, 0, 5, 5);
		gbc_headerLineIndicator.gridx = 10;
		gbc_headerLineIndicator.gridy = 5;
		frmLolTimers.getContentPane().add(headerLineIndicator, gbc_headerLineIndicator);
		
		lblSubtitle = new JLabel("Subtitle:");
		lblSubtitle.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblSubtitle = new GridBagConstraints();
		gbc_lblSubtitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblSubtitle.anchor = GridBagConstraints.EAST;
		gbc_lblSubtitle.gridx = 2;
		gbc_lblSubtitle.gridy = 6;
		frmLolTimers.getContentPane().add(lblSubtitle, gbc_lblSubtitle);
		
		subtitleText = new JTextField();
		subtitleText.setText("Timers for ");
		GridBagConstraints gbc_subtitleText = new GridBagConstraints();
		gbc_subtitleText.insets = new Insets(0, 0, 5, 5);
		gbc_subtitleText.fill = GridBagConstraints.HORIZONTAL;
		gbc_subtitleText.gridx = 3;
		gbc_subtitleText.gridy = 6;
		frmLolTimers.getContentPane().add(subtitleText, gbc_subtitleText);
		subtitleText.setColumns(10);
		
		lblHeaderFontSize = new JLabel("Header font size:");
		lblHeaderFontSize.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblHeaderFontSize = new GridBagConstraints();
		gbc_lblHeaderFontSize.insets = new Insets(0, 0, 5, 5);
		gbc_lblHeaderFontSize.anchor = GridBagConstraints.EAST;
		gbc_lblHeaderFontSize.gridx = 5;
		gbc_lblHeaderFontSize.gridy = 6;
		frmLolTimers.getContentPane().add(lblHeaderFontSize, gbc_lblHeaderFontSize);
		
		headerFontSizeField = new JTextField();
		headerFontSizeField.setText("42");
		headerFontSizeField.setColumns(10);
		GridBagConstraints gbc_headerFontSize = new GridBagConstraints();
		gbc_headerFontSize.insets = new Insets(0, 0, 5, 5);
		gbc_headerFontSize.fill = GridBagConstraints.HORIZONTAL;
		gbc_headerFontSize.gridx = 6;
		gbc_headerFontSize.gridy = 6;
		frmLolTimers.getContentPane().add(headerFontSizeField, gbc_headerFontSize);
		
		lblTitleText = new JLabel("Title text:");
		lblTitleText.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblTitleText = new GridBagConstraints();
		gbc_lblTitleText.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitleText.anchor = GridBagConstraints.EAST;
		gbc_lblTitleText.gridx = 8;
		gbc_lblTitleText.gridy = 6;
		frmLolTimers.getContentPane().add(lblTitleText, gbc_lblTitleText);
		
		titleTextColorPickerButton = new JButton("Pick");
		GridBagConstraints gbc_btnPick_3 = new GridBagConstraints();
		gbc_btnPick_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnPick_3.gridx = 9;
		gbc_btnPick_3.gridy = 6;
		frmLolTimers.getContentPane().add(titleTextColorPickerButton, gbc_btnPick_3);
		
		titleTextIndicator = new JLabel("SIZE");
		GridBagConstraints gbc_titleTextIndicator = new GridBagConstraints();
		gbc_titleTextIndicator.insets = new Insets(0, 0, 5, 5);
		gbc_titleTextIndicator.gridx = 10;
		gbc_titleTextIndicator.gridy = 6;
		frmLolTimers.getContentPane().add(titleTextIndicator, gbc_titleTextIndicator);
		
		lblTitleFontSize = new JLabel("Subtitle font size:");
		lblTitleFontSize.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblTitleFontSize = new GridBagConstraints();
		gbc_lblTitleFontSize.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitleFontSize.anchor = GridBagConstraints.EAST;
		gbc_lblTitleFontSize.gridx = 5;
		gbc_lblTitleFontSize.gridy = 7;
		frmLolTimers.getContentPane().add(lblTitleFontSize, gbc_lblTitleFontSize);
		
		titleFontSizeField = new JTextField();
		titleFontSizeField.setText("8");
		titleFontSizeField.setColumns(10);
		GridBagConstraints gbc_titleFontSize = new GridBagConstraints();
		gbc_titleFontSize.insets = new Insets(0, 0, 5, 5);
		gbc_titleFontSize.fill = GridBagConstraints.HORIZONTAL;
		gbc_titleFontSize.gridx = 6;
		gbc_titleFontSize.gridy = 7;
		frmLolTimers.getContentPane().add(titleFontSizeField, gbc_titleFontSize);
		
		setDefaultColors();
		
		ActionListener actionListener = new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	        	String source = actionEvent.getSource().toString();
	        	Color chosenColor = Color.black;	// Default to black
	        	
	        	if(source.contains("timertext")) {
	        		chosenColor = JColorChooser.showDialog(null, "Pick Color", timerText);
	        		timerText = chosenColor;
	        	} else if(source.contains("background")) {
	        		chosenColor = JColorChooser.showDialog(null, "Pick Color", background);
	        		background = chosenColor;
	        	} else if(source.contains("headertext")) {
	        		chosenColor = JColorChooser.showDialog(null, "Pick Color", headerText);
	        		headerText = chosenColor;
	        	} else if(source.contains("headerline")) {
	        		chosenColor = JColorChooser.showDialog(null, "Pick Color", headerLine);
	        		headerLine = chosenColor;
	        	} else if(source.contains("titletext")) {
	        		chosenColor = JColorChooser.showDialog(null, "Pick Color", titleText);
	        		titleText = chosenColor;
	        	}
	        	
	        	// Update colors
	        	setDefaultColors();
	        }
	    };
	    
	    // Set names to identify actionEvent source
	    timerTextColorPickerButton.setName("timertext");
	    backgroundColorPickerButton.setName("background");
		headerTextColorPickerButton.setName("headertext");
		headerLineColorPickerButton.setName("headerline");
		titleTextColorPickerButton.setName("titletext");
		
		JButton generate = new JButton("Generate");
		generate.addMouseListener(new MouseAdapter() {
			@Override public void mouseClicked(MouseEvent e) {
				setValues();
				
				if(new File(textField.getText()).exists()) {
					try {
						if(Timers.createTimers()) {
							JOptionPane.showMessageDialog(null, "File saved.");
						} else {
							JOptionPane.showMessageDialog(null, "Something went wrong...");
						}
					} catch (IOException e1) { }
				} else {
					JOptionPane.showMessageDialog(null, "You must select a file location.");
				}
			}
		});
		
		lblSaveTo = new JLabel("Save to:");
		GridBagConstraints gbc_lblSaveTo = new GridBagConstraints();
		gbc_lblSaveTo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSaveTo.anchor = GridBagConstraints.EAST;
		gbc_lblSaveTo.gridx = 2;
		gbc_lblSaveTo.gridy = 9;
		frmLolTimers.getContentPane().add(lblSaveTo, gbc_lblSaveTo);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				selectedFolder = chooseFile(frmLolTimers);
				if(selectedFolder != null) {
					textField.setText(selectedFolder.getAbsolutePath());
					lib.File.exportPath = textField.getText();
				}
			}
		});
		
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 9;
		frmLolTimers.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		GridBagConstraints gbc_generate = new GridBagConstraints();
		gbc_generate.insets = new Insets(0, 0, 5, 5);
		gbc_generate.gridx = 9;
		gbc_generate.gridy = 9;
		frmLolTimers.getContentPane().add(generate, gbc_generate);
		
		lblClickBoxTo = new JLabel("Click box to select location.");
		lblClickBoxTo.setVerticalAlignment(SwingConstants.TOP);
		lblClickBoxTo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClickBoxTo.setFont(new Font("Tahoma", Font.ITALIC, 10));
		GridBagConstraints gbc_lblClickBoxTo = new GridBagConstraints();
		gbc_lblClickBoxTo.gridwidth = 2;
		gbc_lblClickBoxTo.insets = new Insets(0, 0, 0, 5);
		gbc_lblClickBoxTo.gridx = 5;
		gbc_lblClickBoxTo.gridy = 10;
		frmLolTimers.getContentPane().add(lblClickBoxTo, gbc_lblClickBoxTo);
	    
		// Add triggers
	    timerTextColorPickerButton.addActionListener(actionListener);
		backgroundColorPickerButton.addActionListener(actionListener);
		headerTextColorPickerButton.addActionListener(actionListener);
		headerLineColorPickerButton.addActionListener(actionListener);
		titleTextColorPickerButton.addActionListener(actionListener);
	}
	
	private void setDefaultColors() {
		// Set labels to opaque or background won't show
    	timerTextIndicator.setOpaque(true);
    	backgroundIndicator.setOpaque(true);
    	headerTextIndicator.setOpaque(true);
    	headerLineIndicator.setOpaque(true);
    	titleTextIndicator.setOpaque(true);
    	
    	// Set colors
		setColor(timerTextIndicator, timerText);
		setColor(backgroundIndicator, background);
		setColor(headerTextIndicator, headerText);
		setColor(headerLineIndicator, headerLine);
		setColor(titleTextIndicator, titleText);
	}
	
	private static void setColor(JLabel comp, Color color) {
		comp.setForeground(color);
		comp.setBackground(color);
	}
	
	private void setValues() {
		int i = -1;
		
		if(!champsPerLineField.getText().equals("")) {
			try {
				i = Integer.parseInt(champsPerLineField.getText());
			} catch(Exception e) { }
			
			if(i > 0) {
				champsPerLine = i;
				i = -1;
			}
		}
		
		if(!iconSizeField.getText().equals("")) {
			try {
				i = Integer.parseInt(iconSizeField.getText());
			} catch(Exception e) { }
			
			if(i > 0) {
				iconSize = i;
				i = -1;
			}
		}
		
		if(!paddingField.getText().equals("")) {
			try {
				i = Integer.parseInt(paddingField.getText());
			} catch(Exception e) { }
			
			if(i > 0) {
				canvasSize = iconSize + i;
				i = -1;
			}
		}
		
		if(!timerFontSizeField.getText().equals("")) {
			try {
				i = Integer.parseInt(timerFontSizeField.getText());
			} catch(Exception e) { }
			
			if(i > 0) {
				fontSize = i;
				i = -1;
			}
		}
		
		if(!headerFontSizeField.getText().equals("")) {
			try {
				i = Integer.parseInt(headerFontSizeField.getText());
			} catch(Exception e) { }
			
			if(i > 0) {
				headerFontSize = i;
				i = -1;
			}
		}
		
		if(!titleFontSizeField.getText().equals("")) {
			try {
				i = Integer.parseInt(titleFontSizeField.getText());
			} catch(Exception e) { }
			
			if(i > 0) {
				titleFontSize = i;
				i = -1;
			}
		}

		// No checking, can be blank
		championsHeader = champText.getText();
		summonersHeader = summonerText.getText();
		jungleHeader = jungleText.getText();
		version = versionText.getText();
		title = subtitleText.getText().trim() + " " + versionText;
	}
	
	private File chooseFile(JFrame frame) {
		File selectedFile = null;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		int result = fileChooser.showOpenDialog(frame);
		if (result == JFileChooser.APPROVE_OPTION) {
			selectedFile = fileChooser.getSelectedFile();
		}

		return selectedFile;
	}
}