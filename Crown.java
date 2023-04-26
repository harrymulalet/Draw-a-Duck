package drawingTool;

import java.awt.Color;

public class Crown {
	private int width = 135;
	private int height = 135;
	
	public Crown() {
		this(1);
	}
	
	public Crown(int scale) {
		this.width = width*scale;
		this.height = height*scale;
	}
	
	
	public void drawAt(int left, int bottom) {
		
		Drawing.pen().setColor(Color.WHITE);
		//Drawing.pen().setColor(new Color(213, 214, 216));
		Drawing.pen().fillOval(left, bottom, width, height);
		Drawing.pen().setColor(new Color(92, 47, 16));
		Drawing.pen().drawArc(left, bottom, width, height, -17, 287);
	}
}
