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

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

public class Gui implements ActionListener {
	private JTextComponent textComponent;
	private Document document;
	private boolean isAppend;
	private DocumentListener limitLinesListener;
	
	
	Main main;
	String source_path;
	String output_path;
	JTextField txtFieldSource; 
	JTextField txtFieldOutput; 
	JButton btnBrowseSource ;
	JButton btnBrowseOutput ;
	JButton btnSubmit ;
	JFileChooser chooser;
	JLabel text1;
	JLabel text2;
	GridBagConstraints c;
	JPanel view ;
	JFrame frame;
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
		
		view = new JPanel(new GridBagLayout());
		c = new GridBagConstraints();
			    
	   
          
		text1 = new JLabel("source BPMN file:");
		text2 = new JLabel("Output folder:");
		btnBrowseSource = new JButton("Browse");
		btnBrowseOutput = new JButton("Browse");
		txtFieldSource = new JTextField();
		txtFieldOutput = new JTextField();
		btnBrowseSource.addActionListener(this);
		btnBrowseOutput.addActionListener(this);
		
		
		
		btnSubmit = new JButton("Submit");
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
		view.add(text1,c);
		
		//First textField
		c.insets = new Insets(0,30,5,30);
		c.gridx=0;
		c.gridy=1;
		view.add(txtFieldSource,c);
		
		//First button
		c.gridx=1;
		c.gridy=1;
		c.weightx = 0;
	    view.add(btnBrowseSource,c);
	    
	    //Second Label
	    c.weightx = 1;
	    c.gridx=0;
		c.gridy=2;
		c.insets = new Insets(30,30,5,0);
		text2.setFont(new Font("Courier", Font.BOLD,14));
		view.add(text2,c);
		
		//Second textField
		c.insets = new Insets(0,30,5,30);
		c.gridx=0;
		c.gridy=3;
		c.weightx = 0;
	    view.add(txtFieldOutput,c);
	    
	    //Second Button
	    c.gridx=1;
		c.gridy=3;
		c.weightx = 0;
	    view.add(btnBrowseOutput,c);
	    
	    //Confirm Button
	    c.weightx = 1;
	    c.gridx=0;
		c.gridy=4;
		c.gridwidth = 2;
		c.anchor = GridBagConstraints.PAGE_END;
		c.weightx = 0;
		c.insets = new Insets(30,30,5,30);
	    view.add(btnSubmit,c);
	    
	    //Console
	    c.gridx = 0;
	    c.gridy = 10;
	    c.gridwidth = 2;
	    c.gridheight = 10;
	    c.weighty = 1;
	    view.add(new JScrollPane(console),c);
	    
	    //End
	    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 	    
	    frame.setContentPane(view);
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
        		main.runGenerator(source_path, output_path);
        		source_path = "";
        		output_path = "";
        	}
	    }
		//Action to perform for the browse button
	    if (e.getSource() == btnBrowseSource)
	    {
	        chooser = new JFileChooser(new File(System.getProperty("user.home") + "\\Downloads")); //Downloads Directory as default
	        chooser.setDialogTitle("Select Location");
	        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	        chooser.setAcceptAllFileFilterUsed(false);
	        
	        if (chooser.showSaveDialog(view) == JFileChooser.APPROVE_OPTION)
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
	        
	        if (chooser.showSaveDialog(view) == JFileChooser.APPROVE_OPTION)
	        { 
	            output_path = chooser.getSelectedFile().getPath();
	            txtFieldOutput.setText(output_path);
	        }
	    }
	    
	}
	
}
