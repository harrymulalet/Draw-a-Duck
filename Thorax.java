package drawingTool;

import java.awt.Color;

public class Thorax {
	private int scale;
	
	public Thorax() {
		this.scale = 1;
	}
	
	public Thorax(int scale) {
		this.scale = scale;
	}
	public void drawAt(int left, int bottom) {
		int[] intArrayForXCoordinates = {left + 51*scale, left + 115*scale, left + 97*scale, left + 97*scale, left};
		int[] intArrayForYCoordinates = {bottom + 47*scale, bottom, bottom + 95*scale, bottom + 163*scale, bottom + 163*scale};
		Drawing.pen().setColor(new Color(213, 214, 216));
		Drawing.pen().fillPolygon(intArrayForXCoordinates, intArrayForYCoordinates, 5);
		Drawing.pen().setColor(new Color(92, 47, 16));
		
		Drawing.pen().drawLine(intArrayForXCoordinates[0], intArrayForYCoordinates[0], intArrayForXCoordinates[4], intArrayForYCoordinates[4]);
		Drawing.pen().drawLine(intArrayForXCoordinates[1], intArrayForYCoordinates[1], intArrayForXCoordinates[2], intArrayForYCoordinates[2]);
	}
}
