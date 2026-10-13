import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;
class LoginFrame extends JFrame implements ActionListener
{  
   String username="student";
   String password="pass@123";
   JTextField usertxt;
   JPasswordField passtxt;
   JButton lgbtn, rsbtn;
   LoginFrame() 
   {  
   setLayout(new GridLayout(3,2));
   setTitle("LOGIN FRAME");  

    add(new JLabel("User Name:"));
    usertxt= new JTextField(10);
    add(usertxt);
    add(new JLabel("Password:"));  
    passtxt=new JPasswordField(10);  
    add(passtxt);
    lgbtn=new JButton("LOGIN");  
    add(lgbtn);
    rsbtn=new JButton("RESET");  
    add(rsbtn);
    setSize(300, 300);  
    setPreferredSize(getSize());  
    setVisible(true);  
    setDefaultCloseOperation(EXIT_ON_CLOSE);  
    lgbtn.addActionListener(this);
    rsbtn.addActionListener(this);
} //end of constructor
public void actionPerformed(ActionEvent ae)
{

   String btn_pressed_lbl= ae.getActionCommand();
   if(btn_pressed_lbl.equals("LOGIN"))
   {

      if(usertxt.getText().equals("") && passtxt.getText().equals(""))
      {
            JOptionPane.showMessageDialog(this,"Please, enter user name and/or password","Validation Error",JOptionPane.ERROR_MESSAGE);
      }   
      else
      {
            if(usertxt.getText().equals("student") && passtxt.getText().equals("pass@123"))
            {

               JOptionPane.showMessageDialog(this,"Congratulations,LOGIN SUCCEEDED!!!.");
            }   
            
else
            {
               JOptionPane.showMessageDialog(this,"LOGIN FAILED","Login Error",JOptionPane.ERROR_MESSAGE);
            }   

      }   

   }   
   else 
   {
      usertxt.setText("");
      passtxt.setText("");

   }   
} // end of actionPerformed()
} // end of class
class LoginFrameSwingTest
{

public static void main(String[] args) 
{ 
JFrame.setDefaultLookAndFeelDecorated(true);  
LoginFrame f = new LoginFrame();  
}  
      
} // end of class  
