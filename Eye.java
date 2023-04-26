package drawingTool;

import java.awt.Color;

public class Eye {
	private int width = 17;
	private int height = 22;
	private int scale;
	
	public Eye() {
		this(1);
	}
	
	public Eye(int scale) {
		this.scale = scale;
		this.width = scale * width;
		this.height = scale * height;
	}
	
	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(new Color(92, 47, 16));
		Drawing.pen().fillOval(left, bottom, width, height);
		Drawing.pen().setColor(Color.WHITE);
		Drawing.pen().fillOval(left + 3*scale, bottom + 3*scale, width/3, height/3);
	}
}