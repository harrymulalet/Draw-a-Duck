package drawingTool;

import javax.swing.JFrame;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class DrawingTool extends JFrame {
	private DrawingArea drawing;

	public DrawingTool(String title) {
		super(title);
		
		constructDrawingArea();

		Dimension screenSize = getToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height);
		System.out.println("Screen Width is " + screenSize.width + "\n" + "Screen Height is " + screenSize.height);

		setVisible(true);
	}
	
	private void constructDrawingArea() {
		drawing = new DrawingArea();
		add(drawing);
	}
	
	public static void main(String[] args) {
		new DrawingTool("Draw a Duck");
	}
}