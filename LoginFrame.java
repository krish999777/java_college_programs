import java.awt.*;
public class LoginFrame extends Frame{
	LoginFrame(String title){
		super(title);
		setSize(300,300);
		setVisible(true);
		// setLayout(new FlowLayout());
		setLayout(new GridLayout(3,2,10,10));
		Label lbl=new Label("Username");
		add(lbl);
		TextField tf1=new TextField(10);
		add(tf1);
		Label lbl2=new Label("Password");
		add(lbl2);
		TextField tf2=new TextField(10);
		tf2.setEchoChar('*');
		add(tf2);
		Button btn=new Button("Login");
		add(btn);
		Button btn2=new Button("Clear");
		add(btn2);
	}
	public static void main(String[] args) {
		LoginFrame f=new LoginFrame("Login form");
	}
}