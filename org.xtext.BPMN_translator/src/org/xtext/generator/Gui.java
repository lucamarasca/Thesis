package org.xtext.generator;

import java.awt.Button;
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
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
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
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

public class Gui implements ActionListener {
	
	
	Main main;
	String source_path;
	String output_path;
//++++++++++++++++++++++++++++++++++++++GUI ELEMENTS+++++++++++++++++++++++++++++++++++
	JFileChooser chooser;
	GridBagConstraints c;
	JPanel main_view;
	JPanel view_browse ; //View that contains browse options
	JPanel view_menus ;	//View that contains Jmenus bar
	JPanel view_console; //View that contain submit button and console
	JFrame frame;	//Container of all the views
	
	
	
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
	JComboBox<String> network_protocol_type;
	JComboBox<String> network_protocol_wired;
	JComboBox<String> network_protocol_wireless;
	JLabel text5;
	JComboBox<String> sensors;
	JComboBox<String> bluetooth_sensors;
	JComboBox<String> distance_sensors;
	JComboBox<String> wifi_sensors;
	JComboBox<String> temperature_sensors;
	//Third view
	JButton btnSubmit ;
	MessageConsole console;
	
	
	
	
	
	public Gui(Main main) {
		this.main = main;
		source_path = "";
		output_path = "";
		this.init();
		System.out.println("Console:");
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
		main_view = new JPanel(new GridLayout(0,1));
		c = new GridBagConstraints();
			    
	   
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
		network_protocol_type = new JComboBox<String>(new Vector<String>(Parameters.Network_protocols_type));
		network_protocol_wired = new JComboBox<String>(new Vector<String>(Parameters.Network_protocols_wired));
		network_protocol_wireless = new JComboBox<String>(new Vector<String>(Parameters.Network_protocols_wireless));
		sensors = new JComboBox<String>(new Vector<String>(Parameters.Sensor_type));
		bluetooth_sensors = new JComboBox<String>(new Vector<String>(Parameters.Bluetooth_sensors));
		distance_sensors = new JComboBox<String>(new Vector<String>(Parameters.Distance_sensors));
		wifi_sensors = new JComboBox<String>(new Vector<String>(Parameters.Wifi_sensors));
		temperature_sensors = new JComboBox<String>(new Vector<String>(Parameters.Temperature_sensors));
		btnSubmit = new JButton("Submit");
		
		
		
		
		
		
		
		btnBrowseSource.addActionListener(this);
		btnBrowseOutput.addActionListener(this);
		network_protocol_type.addActionListener(this);
		sensors.addActionListener(this);
	    btnSubmit.addActionListener(this);
        showAndAdjustGui();
	    
		
	}
	private void showAndAdjustGui() {
		
		
		c.fill = GridBagConstraints.BOTH;
		//First label
		c.insets = new Insets(30,30,5,0);
		c.gridx=0;
		c.gridy=0;
		c.weightx = 1;
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
		view_menus.add(network_protocol_type,c);
		c.gridy++;
		network_protocol_wired.setVisible(false);
		view_menus.add(network_protocol_wired,c);
		network_protocol_wireless.setVisible(false);
		view_menus.add(network_protocol_wireless,c);
		
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
		bluetooth_sensors.setVisible(false);
		view_menus.add(bluetooth_sensors,c);
		distance_sensors.setVisible(false);
		view_menus.add(distance_sensors,c);
		wifi_sensors.setVisible(false);
		view_menus.add(wifi_sensors,c);
		temperature_sensors.setVisible(false);
		view_menus.add(temperature_sensors,c);
		
	    //Confirm Button
	    c.weightx = 1;
	    c.gridx=0;
		c.gridy=0;
		c.insets = new Insets(30,30,5,30);
	    view_console.add(btnSubmit,c);
	    
	    //Console
	    c.gridx = 0;
	    c.gridy = 10;
	    c.gridwidth = 2;
	    c.gridheight = 10;
	    c.weighty = 1;
	    view_console.add(new JScrollPane(console),c);
	    
	    //End
	    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 	    
	    main_view.add(view_browse);
	    main_view.add(view_menus);
	    main_view.add(view_console);
	    frame.add(main_view);
	    frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		//Action to perform for the submit button
		if (e.getSource() == btnSubmit)
	    {
			if(source_path.equals(""))
			{
				JOptionPane.showMessageDialog(null, 
                        "ERROR", 
                        "select a source file", 
                        JOptionPane.WARNING_MESSAGE);
			}
        	else if (output_path.equals(""))
        	{
        		JOptionPane.showMessageDialog(null, 
                        "ERROR", 
                        "select output folder", 
                        JOptionPane.WARNING_MESSAGE);      		
        	} 
        	else
        	{
        		Parameters.selected_device = devices.getItemAt(devices.getSelectedIndex());
        		if (network_protocol_type.getSelectedIndex() == 1)
        			Parameters.selected_protocol = network_protocol_wired.getItemAt(network_protocol_wired.getSelectedIndex());
        		if (network_protocol_type.getSelectedIndex() == 2)
        			Parameters.selected_protocol = network_protocol_wireless.getItemAt(network_protocol_wireless.getSelectedIndex());
        		
        		if (sensors.getSelectedIndex() == 1)
        			Parameters.selected_sensor = bluetooth_sensors.getItemAt(bluetooth_sensors.getSelectedIndex());
        		if (sensors.getSelectedIndex() == 2)
        			Parameters.selected_sensor = distance_sensors.getItemAt(distance_sensors.getSelectedIndex());
        		if (sensors.getSelectedIndex() == 3)
        			Parameters.selected_sensor =  wifi_sensors.getItemAt(wifi_sensors.getSelectedIndex());
        		if (sensors.getSelectedIndex() == 4)
        			Parameters.selected_sensor = temperature_sensors.getItemAt(temperature_sensors.getSelectedIndex());
        		
        		
        		main.runGenerator(source_path, output_path);
        		
        	}
	    }
		//Action to perform for the browse button
	    if (e.getSource() == btnBrowseSource)
	    {
	        chooser = new JFileChooser(new File(System.getProperty("user.home") + "\\Downloads")); //Downloads Directory as default
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
	    if (e.getSource() == network_protocol_type)
	    {
	    	if(network_protocol_type.getSelectedIndex() == 0)
	    	{
	    		network_protocol_wireless.setVisible(false);
	    		network_protocol_wired.setVisible(false);
	    	}
	    	if(network_protocol_type.getSelectedIndex() == 1)
	    	{
	    		network_protocol_wireless.setVisible(true);
	    		network_protocol_wired.setVisible(false);
	    	}
	    	if(network_protocol_type.getSelectedIndex() == 2)
	    	{
	    		network_protocol_wireless.setVisible(false);
	    		network_protocol_wired.setVisible(true);
	    	}
	    }
	    if (e.getSource() == sensors)
	    {
	    	if(sensors.getSelectedIndex() == 0)
	    	{
	    		bluetooth_sensors.setVisible(false);
				distance_sensors.setVisible(false);
				wifi_sensors.setVisible(false);
				temperature_sensors.setVisible(false);
	    	}
	    	if(sensors.getSelectedIndex() == 1)
	    	{
	    		bluetooth_sensors.setVisible(true);
				distance_sensors.setVisible(false);
				wifi_sensors.setVisible(false);
				temperature_sensors.setVisible(false);
	    	}	
	    	if(sensors.getSelectedIndex() == 2)
	    	{
	    		bluetooth_sensors.setVisible(false);
				distance_sensors.setVisible(true);
				wifi_sensors.setVisible(false);
				temperature_sensors.setVisible(false);
	    	}
	    	if(sensors.getSelectedIndex() == 3)
	    	{
	    		bluetooth_sensors.setVisible(false);
				distance_sensors.setVisible(false);
				wifi_sensors.setVisible(true);
				temperature_sensors.setVisible(false);
	    	}
	    	if(sensors.getSelectedIndex() == 4)
	    	{
	    		bluetooth_sensors.setVisible(false);
				distance_sensors.setVisible(false);
				wifi_sensors.setVisible(false);
				temperature_sensors.setVisible(true);
	    	}
	    }
	    
	}
	
}
