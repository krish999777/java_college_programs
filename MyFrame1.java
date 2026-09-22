import java.awt.*;
public class MyFrame1 extends Frame{
	MyFrame1(String title){
		super(title);
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		Label lbl=new Label("This is a label");
		add(lbl);
		Label lbl2=new Label("This is the second label");
		add(lbl2);
	}
	public static void main(String[] args) {
		MyFrame1 f=new MyFrame1("Hello my first frame");
	}
}