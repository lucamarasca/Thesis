package org.xtext.generator;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

public class Gui implements ActionListener, DocumentListener {
	
	
	Main main;
	String source_path;
	String output_path;
//++++++++++++++++++++++++++++++++++++++GUI ELEMENTS+++++++++++++++++++++++++++++++++++
	JFileChooser chooser;
	GridBagConstraints c;
	GridBagConstraints main_c;
	JPanel main_view;
	JPanel view_browse ; //View that contains browse options
	JPanel view_menus ;	//View that contains Jmenus bar
	JPanel view_console; //View that contain submit button and console
	JPanel prova;
	JFrame frame;	//Container of all the views
	Button dialogButton;
	
	
	//First view
	JLabel text1;
	JTextField txtFieldSource; 
	JButton btnBrowseSource ;
	
	JLabel text2;
	JTextField txtFieldOutput; 
	JButton btnBrowseOutput ;
	
	//Second view
	JLabel text3;
	JComboBox<String> devices;
	JLabel text4;
	JComboBox<String> network_protocol_wireless;
	JLabel text5;
	JComboBox<String> sensors;
	JComboBox<String> bluetooth_sensors;
	JComboBox<String> distance_sensors;
	JComboBox<String> wifi_sensors;
	JComboBox<String> temperature_sensors;
	JComboBox<String> gas_sensors;
	JComboBox<String> light_sensors;
	JCheckBox end_point;
	//Third view
	JButton btnSubmit ;
	static MessageConsole console;
	
	
	
	
	
	public Gui(Main main) {
		this.main = main;
		source_path = "";
		output_path = "C:\\Users\\Luca\\Desktop";
		this.init();
		ConsoleLog("Console:>", 1);
	}
	private void init() {
		
		
		
		//CONSOLE
		console = new MessageConsole();
		console.setEditable(false);
		//Collegamento del System.out alla JConsole
		System.setOut(console.getPrintStream());
		System.setErr(console.getPrintStream());
		
		
		
		frame = new JFrame();
		frame.setTitle("BPMN translator");
		frame.setSize(600,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Init views
		view_browse = new JPanel(new GridBagLayout());
		view_menus = new JPanel(new GridBagLayout());
		view_console = new JPanel(new GridBagLayout());
		main_view = new JPanel(new GridBagLayout());
		prova = new JPanel (new GridLayout(1,1));
		c = new GridBagConstraints();
		main_c = new GridBagConstraints();	    
	   
        //Init graphical elements
		text1 = new JLabel("source BPMN file:");
		text2 = new JLabel("Output folder:");
		text3 =  new JLabel("Device:");
		text4 = new JLabel("Network protocol:");
		text5 = new JLabel("Sensor:");
		btnBrowseSource = new JButton("Browse");
		btnBrowseOutput = new JButton("Browse");
		txtFieldSource = new JTextField();
		txtFieldOutput = new JTextField();
		devices = new JComboBox<String>(new Vector<String>(Parameters.Devices));
		network_protocol_wireless = new JComboBox<String>(new Vector<String>(Parameters.Network_protocols_wireless));
		wifi_sensors = new JComboBox<String>(new Vector<String>(Parameters.Wifi_sensors));
		end_point = new JCheckBox ();
		sensors = new JComboBox<String>(new Vector<String>(Parameters.Sensor_type));
		distance_sensors = new JComboBox<String>(new Vector<String>(Parameters.Distance_sensors));
		temperature_sensors = new JComboBox<String>(new Vector<String>(Parameters.Temperature_sensors));
		light_sensors = new JComboBox<String>(new Vector<String>(Parameters.Light_sensors));
		gas_sensors = new JComboBox<String>(new Vector<String>(Parameters.Gas_sensors));

		btnSubmit = new JButton("Submit");
		
		
		
		
		
		txtFieldOutput.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
				  	update_string();
				  }
				  public void removeUpdate(DocumentEvent e) {
					update_string();
				  }
				  public void insertUpdate(DocumentEvent e) {
				    update_string();
				  }

				  public void update_string() {
				     output_path = txtFieldOutput.getText();
				  }
				});
		
		txtFieldSource.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
				  	update_string();
				  }
				  public void removeUpdate(DocumentEvent e) {
					update_string();
				  }
				  public void insertUpdate(DocumentEvent e) {
				    update_string();
				  }

				  public void update_string() {
				     source_path = txtFieldSource.getText();
				  }
				});
		btnBrowseSource.addActionListener(this);
		btnBrowseOutput.addActionListener(this);
		network_protocol_wireless.addActionListener(this);
		sensors.addActionListener(this);
	    btnSubmit.addActionListener(this);
        showAndAdjustGui();
	    
		
	}
	private void showAndAdjustGui() {
		
		
		c.fill = GridBagConstraints.BOTH; // not HORIZONTAL
		//First label
		c.insets = new Insets(30,30,5,0);
		c.weightx = 1.0;
	    c.weighty = 1.0;
	    c.gridx = 0;
	    c.gridy = 0;
		text1.setFont(new Font("Courier", Font.BOLD,14));
		view_browse.add(text1,c);
		
		//First textField
		c.insets = new Insets(0,30,5,30);
		c.gridy++;
		
		view_browse.add(txtFieldSource,c);
		
		//First button
		c.gridx++;		
		c.weightx = 0;
		view_browse.add(btnBrowseSource,c);
	    
	    //Second Label
	    c.weightx = 1;
	    c.gridx=0;
		c.gridy++;
		c.insets = new Insets(30,30,5,0);
		text2.setFont(new Font("Courier", Font.BOLD,14));
		view_browse.add(text2,c);
		
		//Second textField
		c.insets = new Insets(0,30,5,30);
		c.gridx=0;
		c.gridy++;
		c.weightx = 0;
		view_browse.add(txtFieldOutput,c);
	    
	    //Second Button
	    c.gridx=1;
		c.weightx = 0;
		view_browse.add(btnBrowseOutput,c);
	    
	    //Devices Label
	    c.weightx = 1;
	    c.gridx=0;
		c.gridy++;
		c.insets = new Insets(0,30,5,0);
		text3.setFont(new Font("Courier", Font.BOLD,14));
		view_menus.add(text3,c);
	    
		//Devices Label
	    c.weightx = 1;
	    c.gridx=0;
		c.gridy=0;
		c.insets = new Insets(30,30,5,0);
		text3.setFont(new Font("Courier", Font.BOLD,14));
		view_menus.add(text3,c);
		
		//First Menu
		c.insets = new Insets(0,30,5,30);
		c.gridy++;
		c.weightx = 0;
		view_menus.add(devices,c);
	    
		//Network Label
	    c.weightx = 1;
	    c.gridx=0;
		c.gridy++;
		c.insets = new Insets(0,30,5,0);
		text4.setFont(new Font("Courier", Font.BOLD,14));
		view_menus.add(text4,c);
		
		//Second Menu
		c.insets = new Insets(0,30,5,30);
		c.gridy++;
		c.weightx = 0;
		network_protocol_wireless.setVisible(true);
		view_menus.add(network_protocol_wireless,c);
		c.gridy++;
		wifi_sensors.setVisible(false);
		view_menus.add(wifi_sensors,c);
		
	
		//Sensors Label
	    c.weightx = 1;
	    c.gridx=0;
		c.gridy++;
		c.insets = new Insets(0,30,5,0);
		text5.setFont(new Font("Courier", Font.BOLD,14));
		view_menus.add(text5,c);
		
		//Second Menu
		c.insets = new Insets(0,30,5,30);
		c.gridy++;
		c.weightx = 0;
		view_menus.add(sensors,c);
		c.gridy++;
		distance_sensors.setVisible(false);
		view_menus.add(distance_sensors,c);
		temperature_sensors.setVisible(false);
		view_menus.add(temperature_sensors,c);
		gas_sensors.setVisible(false);
		view_menus.add(gas_sensors,c);
		light_sensors.setVisible(false);
		view_menus.add(light_sensors,c);
		
	    //Confirm Button
		
		c.weightx = 1.0;
	    c.weighty = 1.0;
	    
	  
		c.gridy++;
		c.insets = new Insets(30,30,5,30);
	    view_menus.add(btnSubmit,c);
	    
	    //Console
	    
	    c.gridy++;
	    c.weighty=20;
	    c.gridheight = 20;
	    c.weighty = 5.0;
	    
	    view_console.add(new JScrollPane(console),c);
	    
	    
	    //End
	  
	    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    main_c.fill = GridBagConstraints.BOTH; // not HORIZONTAL
	   
	    main_c.gridx = 0;
	    main_c.gridy = 0;
	    main_c.weightx = 1.0;
	    main_view.add(view_browse,main_c);
	    main_c.gridy++;
	    main_view.add(view_menus,main_c);
	    main_c.gridy++;
	    main_c.weighty=2.0;
	    main_view.add(view_console,main_c);
	   
	    
	   
	    frame.setContentPane(main_view);
	    
	   
	    frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//Action to perform for the submit button
		if (e.getSource() == btnSubmit)
	    {
			if (output_path.equals(""))
        	{
        		JOptionPane.showMessageDialog(null, 
                        "select output folder", 
                        "ERROR", 
                        JOptionPane.ERROR_MESSAGE); 
        		return;
        	} 
			if(source_path.equals(""))
			{
				UIManager.put("OptionPane.cancelButtonText", "Cancel");
				UIManager.put("OptionPane.yesButtonText", "Yes");
				int dialogResult = JOptionPane.showConfirmDialog (null, "you didn't select a source file, you wish to continue?",  "Select an Option...",JOptionPane.YES_NO_CANCEL_OPTION);
				if(dialogResult == JOptionPane.YES_OPTION){
					if (sensors.getSelectedIndex() == 0 && wifi_sensors.getSelectedIndex() == 0)
					{
						JOptionPane.showMessageDialog(null, 
		                        "Select an input BPMN or fill the required datas", 
		                        "ERROR", 
		                        JOptionPane.ERROR_MESSAGE); 
		        		return;
					}
					GetDataForGeneration();
					main.runGenerator(source_path, output_path);
				}
			} 
        	else
        	{
        		main.runGenerator(source_path, output_path);
        	}
	    }
		
		//Action to perform for the browse button
	    if (e.getSource() == btnBrowseSource)
	    {
	    	UIManager.put("FileChooser.saveButtonText","Select");
	        chooser = new JFileChooser(new File(System.getProperty("user.home") + "\\Desktop\\examples")); //Downloads Directory as default

	        chooser.setDialogTitle("Select Location");
	        
	        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	        chooser.setAcceptAllFileFilterUsed(false);
	        
	        if (chooser.showSaveDialog(view_browse) == JFileChooser.APPROVE_OPTION)
	        { 
	            source_path = chooser.getSelectedFile().getPath();
	            txtFieldSource.setText(source_path);
	        }
	    }
	    //Action to perform for the browse button
	    if (e.getSource() == btnBrowseOutput)
	    {
	        chooser = new JFileChooser(new File(System.getProperty("user.home") + "\\Downloads")); //Downloads Directory as default
	        chooser.setDialogTitle("Select Location");
	        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	        chooser.setAcceptAllFileFilterUsed(false);
	        
	        if (chooser.showSaveDialog(view_browse) == JFileChooser.APPROVE_OPTION)
	        { 
	            output_path = chooser.getSelectedFile().getPath();
	            txtFieldOutput.setText(output_path);
	        }
	    }
	   
	    if(e.getSource() == network_protocol_wireless)
	    	wifi_sensors.setVisible(true);
	    
	    if (e.getSource() == sensors)
	    {
	    	if(sensors.getSelectedIndex() == 0)
	    	{
				distance_sensors.setVisible(false);
				temperature_sensors.setVisible(false);
				gas_sensors.setVisible(false);
				light_sensors.setVisible(false);
	    	}
	    	if(sensors.getSelectedIndex() == 1)
	    	{
	    		
				distance_sensors.setVisible(true);
				temperature_sensors.setVisible(false);
				gas_sensors.setVisible(false);
				light_sensors.setVisible(false);
	    	}	
	    	if(sensors.getSelectedIndex() == 2)
	    	{
				distance_sensors.setVisible(false);
				temperature_sensors.setVisible(true);
				gas_sensors.setVisible(false);
				light_sensors.setVisible(false);
	    	}
	    	if(sensors.getSelectedIndex() == 3)
	    	{
				distance_sensors.setVisible(false);
				temperature_sensors.setVisible(false);
				gas_sensors.setVisible(true);
				light_sensors.setVisible(false);
	    	}
	    	if(sensors.getSelectedIndex() == 4)
	    	{
				distance_sensors.setVisible(false);
				temperature_sensors.setVisible(false);
				gas_sensors.setVisible(false);
				light_sensors.setVisible(true);
	    	}
	    }
	    
	}
	public void GetDataForGeneration() {
		Parameters.selected_device = devices.getItemAt(devices.getSelectedIndex());
		if (wifi_sensors.getSelectedIndex() != 0)
			Parameters.selected_wifisensor = wifi_sensors.getItemAt(wifi_sensors.getSelectedIndex());
		if (network_protocol_wireless.getSelectedIndex() != 0)	
			Parameters.selected_protocol = network_protocol_wireless.getItemAt(network_protocol_wireless.getSelectedIndex());
		if(end_point.isSelected())
			Parameters.end_point_generation = true;
		else
			Parameters.end_point_generation = false;
		if (sensors.getSelectedIndex() == 1)
			if (distance_sensors.getSelectedIndex() != 0)		
				Parameters.selected_sensor = distance_sensors.getItemAt(distance_sensors.getSelectedIndex());
		if (sensors.getSelectedIndex() == 2)
			if (temperature_sensors.getSelectedIndex() != 0)
				Parameters.selected_sensor = temperature_sensors.getItemAt(temperature_sensors.getSelectedIndex());
		if (sensors.getSelectedIndex() == 3)
			if (gas_sensors.getSelectedIndex() != 0)		
				Parameters.selected_sensor = gas_sensors.getItemAt(gas_sensors.getSelectedIndex());
		if (sensors.getSelectedIndex() == 4)
			if (light_sensors.getSelectedIndex() != 0)		
				Parameters.selected_sensor = light_sensors.getItemAt(light_sensors.getSelectedIndex());
		if(source_path.equals(""))
			ConsoleLog("+++++++++++++ NO SOURCE BPMN SELECTED+++++++++++++", 2);
		else
			ConsoleLog("SOURCE BPMN: " + source_path, 2);
		
		ConsoleLog("Generating cod for:\n->DEVICE: "+ Parameters.selected_device+
				"\n->NETWORK PROTOCOL: "+ Parameters.selected_protocol +
				" using " + Parameters.selected_wifisensor +
				"\n->SENSOR: " + Parameters.selected_sensor, 1);
	}
	
	
	 static public void ConsoleLog(String message, int code) {
		switch (code) {
		case 1: 
			System.out.println(message);
			break;
		case 2: 
			console.setSelectedTextColor(new Color(0, 0, 0));
			System.out.println( message);
			console.setSelectedTextColor(new Color(0, 0, 255));
			break;
		case 3:
			console.setSelectedTextColor(new Color(0, 0, 0));
			System.out.println( message);
			console.setSelectedTextColor(new Color(0, 0, 255));			
			break;
		default:
			System.out.println(message);
		}
	}
	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}	
	
}
