import javax.swing.*;

import java.awt.*;
import java.awt.Font.*;
import java.awt.event.*;
import javax.swing.UIManager.*;

 
@SuppressWarnings({ "serial", "unused" })
public class CaesarCipher extends JFrame { 
	private JTextField tf1;
	private JButton btn1;
	private JButton btn2;
	private JLabel l1;
	
	public CaesarCipher()
     {
	   
	   try {
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
           System.err.println("Error at Look And Feel");
        }
	   setExtendedState( getExtendedState()|JFrame.MAXIMIZED_BOTH );
	  
	   setLocationRelativeTo( null );
        setTitle("Caesar Cipher");
        setBackground(Color.BLUE);
        
        l1 = new JLabel("Enter Plain Text:");
        tf1 = new JTextField();
        
        btn1 = new JButton("Start");
        btn2 = new JButton("Exit");
     
        l1.setBounds(400, 70, 300, 30);
        tf1.setBounds(700, 70, 250, 30);
        
        btn1.setBounds(550, 400, 150, 30);
        btn2.setBounds(770, 400, 150, 30);
        
        l1.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        tf1.setFont(new Font("Monotype Corsiva",Font.BOLD,15));
        btn1.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        btn2.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        
       
        add(l1);
        add(tf1);
        add(btn1);
        add(btn2);
        
        setLayout(new BorderLayout());
        setVisible(true);
       
     btn1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
       	String s1;
        s1 = tf1.getText();
        new PlainCaesar(s1);
        s1=null;
        setVisible(false);
   		dispose();
    }
}); 
    btn2.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
});    
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setResizable(true);
     getRootPane().setWindowDecorationStyle(JRootPane.NONE);
     setVisible(true);
          }
    
   
    public static void main(String args[])
   {
        new CaesarCipher();
    }
	
}
