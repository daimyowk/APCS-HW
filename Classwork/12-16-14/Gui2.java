import javax.swing.*;
import java.awt.*;
//JFrame is basic window
//JPanel nothing
public class Gui2 extends JFrame implements ActionListener {
    private JButton b1,b2;
    private Container pane;
    private JLabel label;
    private JTextArea text; //multiple lines
    //JTextField one line
    private JPanel canvas;
    public void actionPerformed(){

    }
    public Gui2(){
	
	setTitle("My First Gui");
	setSize(600,600);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE); //allows x to close program

	pane=getContentPane();
      	//pane.setLayout(new GridLayout(3,3));
	pane.setLayout(new FlowLayout());
	b1=new JButton("Click me");
	pane.add(b1);
	b2=new JButton("exit");
	pane.add(b2);
	label=new JLabel("the Label:");
	pane.add(label);
	text=new JTextArea();
	text.setColumns(40);
	text.setRows(5);
	text.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(text);

	canvas=new JPanel();
	canvas.setPreferredSize(new Dimension(300,300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	pane.add(canvas);

				
    }
    public static void main(String[] args) {
	Gui2 f = new Gui2();
	f.setVisible(true);
	//event driven programming
	//many possible events happen
	//use event handlers
	//when sometime happen(ex.button click) call something
    }
}
