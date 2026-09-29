import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginFrame1 extends Frame implements ActionListener{
	Button btn,btn2;
	TextField tf1,tf2;
	Label lbl3;
	LoginFrame1(String title){
		super(title);
		setSize(300,300);
		setVisible(true);
		// setLayout(new FlowLayout());
		setLayout(new GridLayout(4,2,10,10));
		Label lbl=new Label("Username");
		add(lbl);
		tf1=new TextField(10);
		add(tf1);
		Label lbl2=new Label("Password");
		add(lbl2);
		tf2=new TextField(10);
		add(tf2);
		btn=new Button("Login");
		add(btn);
		btn2=new Button("Clear");
		add(btn2);
		lbl3=new Label("");
		add(lbl3);
		btn.addActionListener(this);
		btn2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		String myUsername="krish";
		String myPassword="demo";
		if(ae.getSource()==btn){
			String username=tf1.getText();
			String password=tf2.getText();
			System.out.println(username);
			System.out.println(password);
			if(myUsername.equals(username)&&myPassword.equals(password)){
				lbl3.setText("Login successful");
			}else{
				lbl3.setText("Wrong username or password");
			}
			if(username.isEmpty() || password.isEmpty()) 
			{

			 JOptionPane.showMessageDialog(this,"Please enter data in both textboxes");  
			 System.out.println("Please Enter The data");    

			 }

		}else{
			tf1.setText("");
			tf2.setText("");
		}
	}
	public static void main(String[] args) {
		LoginFrame1 f=new LoginFrame1("Add frame"); 
	}
}