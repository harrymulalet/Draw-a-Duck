package drawingTool;

import javax.swing.JPanel;


//import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Polygon;

@SuppressWarnings("serial")
public class DrawingArea extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Drawing.set(g);
		
		// here comes your code...
		Duck theFirstDuck = new Duck();
		int left = 0;// highly recommended starting x position = 300
		int bottom = 0;// highly recommended starting y position = 200
		theFirstDuck.drawAt(left, bottom);
		// please, don't use the following commands in this file
		// use them ONLY in your "drawAt"-methods of YOUR domain classes!!!
		//Drawing.pen().drawLine(10, 400, 400, 400);
		//Drawing.pen().drawRect(300, 300, 50, 50);
		//Drawing.pen().setColor(Color.BLUE);
		//Drawing.pen().fillRect(400, 500, 80, 30);
		//Drawing.pen().drawOval(200, 500, 50, 50);
		// you find further commands at oracle docs for Java 1.8:
		// https://docs.oracle.com/javase/8/docs/api/java/awt/Graphics.html
	}
}