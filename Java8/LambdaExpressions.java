package Java8;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaExpressions {
	public static void main(String[] args) {
		// Example without implementing lambda Expression		
		/*Frame frame = new Frame("Sachin");		
		Button btn=new Button("Click Here!");
		//Setting a frame 
		btn.setBounds(150, 200, 80, 50);
		//Creating a method to listen from the user/programmer	
		 * 
		 * 
		 * 	
		btn.addActionListener (new ActionListener() {
			@Override
			public void actionPerformed(Sachin s) {
				System.out.println("Hello Sachin...!");
			}
		});		
		
		frame.add(btn);		
		frame.setSize(200,200);
		frame.setLayout(null);
		frame.setVisible(true);*/
		
		Frame frame = new Frame("This frame is lambda");		
		Button bt=new Button("Click Button");
		bt.setBounds(50,50,80,50);	
		
		Button b=new Button("ClickTOPrint");
		b.setBounds(150,160,90,40);
		//Lambda expression implementation
		// Using lambda we can actually lower the lines of code.
		bt.addActionListener(e -> 
						System.out.println("My name is Lambda! Hello to the world.!!"));
		b.addActionListener(s -> System.out.println("Hello Lambda. My name is Sachin..!"));
						
		frame.add(bt); frame.add(b);
		frame.setSize(100,100);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}