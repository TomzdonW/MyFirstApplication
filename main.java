import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.Group;

class main
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() { 
				window frame=new window();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
			}
		});
	}
}

class window extends JFrame implements ActionListener
{
	
	private static final int height=400;
	private static final int width=300;
	private JPanel panel;
	String user="O";
	private int winner_O=0;
	private int winner_X=0;
	private JButton p1;
	private JButton p2;
	private JButton p3;
	private JButton p4;
	private JButton p5;
	private JButton p6;
	private JButton p7;
	private JButton p8;
	private JButton p9;
	private JButton new_game;
	public window()
	
	{
		setSize(height,width);
		setTitle("Game");
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(3, 3));
		
		String user="O";
		
				p1=new JButton("");
				p2=new JButton("");
				p3=new JButton("");
				p4=new JButton("");
				p5=new JButton("");
				p6=new JButton("");
				p7=new JButton("");
				p8=new JButton("");
				p9=new JButton("");
			    new_game=new JButton("New game");
				
	
		p9.setPreferredSize(new Dimension(40, 40));
		
		panel.add(p1);
	    panel.add(p2);
		panel.add(p3);
		
		panel.add(p4);
		panel.add(p5);
		panel.add(p6);
		
		panel.add(p7);
		panel.add(p8);
		panel.add(p9);
		
		p1.addActionListener(this);
		p2.addActionListener(this);
		p3.addActionListener(this);
		
		p4.addActionListener(this);
		p5.addActionListener(this);
		p6.addActionListener(this);
		
		p7.addActionListener(this);
		p8.addActionListener(this);
		p9.addActionListener(this);
		new_game.addActionListener(this);
		add("South", panel);
		add("North",new_game);
		painting rys=new painting();
		add(rys);
		
		
	}
	

 public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() instanceof JButton)
		{
		        System.out.println(((JButton)e.getSource()).getText());
		}
		if (((JButton)e.getSource()).getActionCommand()=="" &&  user == "X") {                                                  //       przycisku, a jest kolej krzy¿yka to
			((JButton)e.getSource()).setText("X");    
			user = "O";                                   
			 repaint(); }              
			 
		if (((JButton)e.getSource()).getText()=="" &&  user == "O") {                                                  //       przycisku, a jest kolej krzy¿yka to
			((JButton)e.getSource()).setText("O");    
			user = "X";                                   
			 repaint(); }
		if (((JButton)e.getSource()).getText()=="New game") {       
			  p1.setText(""); p2.setText(""); p3.setText(""); p4.setText("");
			  p5.setText(""); p6.setText(""); p7.setText(""); p8.setText("");
			  p9.setText("");
			  user = "O"; repaint();
		}
		
		
		if (p1.getText() == "X" && p2.getText() == "X" && p3.getText() == "X") {
		    user = "win X"; repaint(); winner_X++;
		  }  else
		    if (p4.getText() == "X" && p5.getText() == "X" && p6.getText() == "X") {
		    user = "win X"; repaint();winner_X++;
		    }  else
		    if (p7.getText() == "X" && p8.getText() == "X" && p9.getText() == "X") {
		    user = "win X"; repaint();winner_X++;
		    }  else
		    if (p1.getText() == "X" && p5.getText() == "X" && p9.getText() == "X") {
		    user = "win"; repaint(); winner_X++;
		    }  else
		    if (p3.getText() == "X" && p5.getText() == "X" && p7.getText() == "X") {
		    user = "win"; repaint(); winner_X++;
		    }  else
		    if (p1.getText() == "X" && p4.getText() == "X" && p7.getText() == "X") {
		    user = "win"; repaint();winner_X++;
		    }  else
		    if (p2.getText() == "X" && p5.getText() == "X" && p8.getText() == "X") {
		    user = "win X"; repaint();winner_X++;
		    }  else
		    if (p3.getText() == "X" && p6.getText() == "X" && p9.getText() == "X") {
		    user = "win X"; repaint();winner_X++;
		    }  else
		 
		    if (p1.getText() == "O" && p2.getText() == "O" && p3.getText() == "O") {
		user = "win O"; repaint();winner_O++;
		}  else
		    if (p4.getText() == "O" && p5.getText() == "O" && p6.getText() == "O") {
		    user = "win O"; repaint(); winner_O++;
		    }  else
		    if (p7.getText() == "O" && p8.getText() == "O" && p9.getText()== "O") {
		    user = "win O"; repaint();winner_O++;
		    }  else
		    if (p1.getText() == "O" && p5.getText() == "O" && p9.getText() == "O") {
		    user = "win O"; repaint();winner_O++;
		    }  else
		    if (p3.getText() == "O" && p5.getText() == "O" && p7.getText() == "O") {
		    user = "win O"; repaint();winner_O++;
		    }  else
		    if (p1.getText() == "O" && p4.getText() == "O" && p7.getText() == "O") {
		    user = "win O"; repaint();winner_O++;
		    }
		          else
		    if (p2.getText() == "O" && p5.getText()== "O" && p8.getText() == "O") {
		    user = "win O"; repaint(); winner_O++;}
		    else
		    if (p3.getText() == "O" && p6.getText() == "O" && p9.getText() == "O") {
		    user = "win O"; repaint(); winner_O++;
		    }else if (p1.getText() != "" && p2.getText() != "" && p3.getText() != "" &&
		      p4.getText() != "" && p5.getText() != "" && p6.getText() != "" &&
		      p7.getText() != "" && p8.getText() != "" && p9.getText()!= "")
		    { user ="no won"; }
		
	}
	
	class painting extends JComponent
	{
		
	
	public void paint(Graphics g)
	{
		Font font=new Font("Serif",Font.BOLD,16);
		g.setFont(font);
		g.drawString("Player: ", 140, 60);
		g.drawString(user, 190,60);
		g.drawString("Winner X = " + winner_X, 270, 30);
		g.drawString("Winner O = " + winner_O,270 , 50);
		
	}
	}
	
	
}
