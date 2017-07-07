import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class CaesarPlain extends JFrame {

    final static String ALPPHABET = "abcdefghijklmnopqrstuvwxyz";
	private JButton btn2;
	private JButton btn1;
	private static JLabel l2;
	 CaesarPlain(){}

	 static String dec(String cip1){
	       String cip2=cip1.toLowerCase();
	        String pla="";
	        for(int ke=0;ke<ALPPHABET.length();ke++){
	            if(pla!="") pla+="<br>";
	             
	        for(int i=0;i<cip2.length();i++){
	        	char c=cip2.charAt(i);
	        	if(c==' ') pla+=' ';
	        	else {
	            int pos=ALPPHABET.indexOf(c);
	            int key=(pos-ke)%26;
	            if(key<0){
	                key=ALPPHABET.length()+key;
	            }
	            char re=ALPPHABET.charAt(key);
	            pla+=re;
	            }
	        }
	        }
	    return pla;
	    }
	
	public CaesarPlain(String cip) {
		 String s=new String();
		 s=dec(cip);
		 try {
	           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	        } catch (Exception e) {
	           System.err.println("Error at Look And Feel");
	        }
		   setExtendedState( getExtendedState()|JFrame.MAXIMIZED_BOTH );
		  
		   setLocationRelativeTo( null );
	        setTitle("Caesar Cipher");
	        setBackground(Color.BLUE);
	        
	        l2 = new JLabel();
	        btn1 = new JButton("Try Again");
	        btn2 = new JButton("Exit");
	     
	        l2.setBounds(650, 05, 300, 650);
	        btn1.setBounds(500, 650, 200, 30);
	        btn2.setBounds(800, 650, 200, 30);
	        
	        l2.setFont(new Font("Monotype Corsiva",Font.BOLD,18));
	        btn1.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
	        btn2.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
	        
	        l2.setText("<html><body>"+s+"</body></html>");
	        System.out.println(s);
	        add(l2);
	        add(btn1);
	        add(btn2);
	        
	        setLayout(new BorderLayout());
	        setVisible(true);
	       
	     btn1.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e)
	    {
	       	
	        new CaeCip();
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
	     getRootPane().setWindowDecorationStyle((int) JRootPane.TOP_ALIGNMENT);
	     setVisible(true);
	          }
	
	    public static void main(String args[])
	    {
	         new CaesarPlain();
	     }
	 	
	 }