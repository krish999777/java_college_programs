import java.awt.*;
public class MyComponents extends Frame{
	MyComponents(String title){
		super(title);
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		Label lbl=new Label("This is a label");
		add(lbl);
		Button btn=new Button("button");
		add(btn);
		TextField tf1=new TextField();
		add(tf1);
		TextField tf2=new TextField(10);
		add(tf2);
		TextField tf3=new TextField("Default");
		add(tf3);
		TextField tf4=new TextField("Default with num char",20);
		add(tf4);
		TextField tf5=new TextField("This is not editable",20);
		tf5.setEditable(false);
		add(tf5);
		TextField tf6=new TextField(20);
		tf6.setEchoChar('*');
		add(tf6);
	}
	public static void main(String[] args) {
		MyComponents f=new MyComponents("Hello my first frame");
	}
}