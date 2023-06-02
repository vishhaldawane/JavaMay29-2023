import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyEditorTest {
	public static void main(String[] args) {
		MyNotepad pad = new MyNotepad(700, 400, 100, 200, "MyEditor");
		pad.setVisible(true);
	}
}
class MyNotepad extends JFrame implements ActionListener
{
	JLabel label1 = new JLabel("Enter filename : ");
	JTextField filename = new JTextField(20);
	
	JLabel label2 = new JLabel("Enter data : ");
	JTextArea data = new JTextArea(10,50);
	
	JButton save = new JButton("SAVE");
	JButton clear = new JButton("Clear");
	
	MyNotepad(int w, int h, int x, int y, String name) {
		super(name);
		setLocation(x,y);
		setSize(w,h);
		setLayout(new FlowLayout());
		add(label1); add(filename);
		add(label2); add(data);
		add(save); add(clear);
		
		save.addActionListener(this); //registration of the button for event handling
		clear.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==save) {
			System.out.println("Save button clicked..."+filename.getText()+" to be created...");
			try {
				FileWriter fileWriter = new FileWriter(filename.getText());
				fileWriter.write(data.getText());
				System.out.println("DATA IS WRITTEN");
				JOptionPane.showMessageDialog(this, "File is SAVED");
				fileWriter.close();
			} catch (IOException e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(this, e1.getMessage());
			} 
		}
		else if(e.getSource()==clear) {
			System.out.println("Clear button clicked...");
			filename.setText("");
			data.setText("");
		} 
		
	}
	
}