package drawingTool;

import java.awt.Color;

public class Wing {
	private int scale;
	
	public Wing() {
		this(1);
	}
	
	public Wing(int scale) {
		this.scale = scale;
	}
	
	public void drawAt(int left, int bottom) {
		
		int[] polygonXCoordinates = {left + 9*scale,left + 22*scale,left + 58*scale,left + 149*scale,left + 223*scale,left + 206*scale,left + 156*scale,left + 198*scale,left + 186*scale, left + 109*scale, left + 94*scale, left + 109*scale, left + 186*scale, left + 176*scale,left + 148*scale,left + 71*scale,left + 38*scale,left + 56*scale,left + 15*scale,left + 11*scale,left};
		int[] polygonYCoordinates = {bottom + 13*scale,bottom + 4*scale,bottom,bottom + 45*scale,bottom + 113*scale,bottom + 119*scale,bottom + 102*scale,bottom + 127*scale,bottom + 135*scale,bottom + 124*scale,bottom + 117*scale,bottom + 124*scale,bottom + 135*scale,bottom + 134*scale,bottom + 144*scale,bottom + 134*scale,bottom + 109*scale,bottom + 133*scale,bottom + 102*scale,bottom + 108*scale,bottom + 77*scale};
		
		Drawing.pen().setColor(Color.WHITE);
		//Drawing.pen().setColor(new Color(213, 214, 216));
		Drawing.pen().fillPolygon(polygonXCoordinates, polygonYCoordinates, polygonXCoordinates.length);
		Drawing.pen().setColor(new Color(92, 47, 16));
		Drawing.pen().drawPolyline(polygonXCoordinates, polygonYCoordinates, polygonXCoordinates.length);
	}
	
}
