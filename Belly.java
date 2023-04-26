package drawingTool;

import java.awt.Color;

public class Belly {
	private int width = 355;
	private int height = 263;
	private int scale;
	
	public Belly() {
		this(1);
	}
	public Belly(int scale) {
		this.scale = scale;
		this.width = width*scale;
		this.height = height*scale;
	}
	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(new Color(213, 214, 216));
		Drawing.pen().fillArc(left, bottom, width, height, -16, -164);
		Drawing.pen().setColor(new Color(92, 47, 16));
		Drawing.pen().drawArc(left, bottom, width, height, -16, -164);
		int[] breastsize = {73, 68, 103, 45, 58, 22};
		Drawing.pen().drawArc(left + 13*scale, bottom + 110*scale, breastsize[0]*scale, breastsize[1]*scale, 180, 71);
		Drawing.pen().drawArc(left + 26*scale, bottom + 128*scale, breastsize[2]*scale, breastsize[3]*scale, 180, 34);
		Drawing.pen().drawArc(left + 40*scale, bottom + 143*scale, breastsize[4]*scale, breastsize[5]*scale, 180, 41);
	}
}
