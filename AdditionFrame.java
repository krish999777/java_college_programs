import java.awt.*;
import java.awt.event.*;
public class AdditionFrame extends Frame implements ActionListener{
	Button btn,btn2;
	TextField tf1,tf2,tf3;
	AdditionFrame(String title){
		super(title);
		setSize(300,300);
		setVisible(true);
		// setLayout(new FlowLayout());
		setLayout(new GridLayout(4,2,10,10));
		Label lbl=new Label("num 1");
		add(lbl);
		tf1=new TextField(10);
		add(tf1);
		Label lbl2=new Label("num 2");
		add(lbl2);
		tf2=new TextField(10);
		add(tf2);
		Label lbl3=new Label("Result");
		add(lbl3);
		tf3=new TextField(10);
		tf3.setEditable(false);
		add(tf3);
		btn=new Button("Login");
		add(btn);
		btn2=new Button("Clear");
		add(btn2);
		btn.addActionListener(this);
		btn2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==btn){
			int num1=Integer.parseInt(tf1.getText());
			int num2=Integer.parseInt(tf2.getText());
			int num3=num1+num2;
			tf3.setText(""+num3);
		}else{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}
	public static void main(String[] args) {
		AdditionFrame f=new AdditionFrame("Add frame"); 
	}
}