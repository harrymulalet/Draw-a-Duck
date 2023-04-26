package drawingTool;

import java.awt.Color;

public class Tail {
	
	private int scale;
	
	public Tail() {
		this(1);
	}
	
	public Tail(int scale) {
		this.scale = scale;
	}
	
	public void drawAt(int left, int bottom) {
		
		int[] polygonXCoordinates = {left,left + 21*scale,left + 41*scale,left + 35*scale,left + 28*scale,left + 35*scale,left + 57*scale,left + 82*scale,left + 72*scale, left + 55*scale, left + 81*scale, left + 80*scale, left + 77*scale, left + 80*scale, left + 93*scale, left + 98*scale, left + 84*scale, left + 94*scale,left + 110*scale,left + 93*scale,left + 83*scale};
		int[] polygonYCoordinates = {bottom + 78*scale,bottom + 36*scale,bottom + 18*scale,bottom + 47*scale,bottom + 54*scale,bottom + 47*scale,bottom + 16*scale,bottom,bottom + 28*scale,bottom + 46*scale,bottom + 23*scale,bottom + 32*scale,bottom + 37*scale,bottom + 32*scale,bottom + 19*scale,bottom + 32*scale,bottom + 71*scale,bottom + 50*scale,bottom + 46*scale,bottom + 101*scale,bottom + 112*scale};
		
		Drawing.pen().setColor(new Color(213, 214, 216));
		Drawing.pen().fillPolygon(polygonXCoordinates, polygonYCoordinates, polygonXCoordinates.length);
		Drawing.pen().setColor(new Color(92, 47, 16));
		Drawing.pen().drawPolyline(polygonXCoordinates, polygonYCoordinates, polygonXCoordinates.length);
	}
	
}