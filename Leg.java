package drawingTool;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class Leg {
	
	private int scale;
	
	public Leg() {
		
		this(1);
		
	}
	
	public Leg(int scale) {
		
		this.scale = scale;
	}
	
	public void drawAt(int left, int bottom) {
		
		Integer[] polygonXCoordinatesArray = {left + 66*scale,left + 70*scale,left + 36*scale,left,left + 7*scale,left + 53*scale,left + 57*scale,left + 28*scale,left + 35*scale, left + 57*scale, left + 77*scale, left + 77*scale, left + 65*scale, left + 82*scale,left + 97*scale,left + 96*scale,left + 87*scale,left + 84*scale};
		Integer[] polygonYCoordinatesArray = {bottom,bottom + 36*scale,bottom + 48*scale,bottom + 68*scale,bottom + 67*scale,bottom + 47*scale,bottom + 49*scale,bottom + 74*scale,bottom + 72*scale,bottom + 55*scale,bottom + 47*scale,bottom + 62*scale,bottom + 96*scale,bottom + 79*scale,bottom + 44*scale,bottom + 37*scale,bottom + 31*scale,bottom};
		ArrayList<Integer> polygonXCoordinates = new ArrayList<Integer>(Arrays.asList(polygonXCoordinatesArray));
		ArrayList<Integer> polygonYCoordinates = new ArrayList<Integer>(Arrays.asList(polygonYCoordinatesArray));
		
		Drawing.pen().setColor(new Color(249, 183, 71));
		Drawing.pen().fillPolygon(polygonXCoordinates.stream().mapToInt(i -> i).toArray(), polygonYCoordinates.stream().mapToInt(i -> i).toArray(), polygonXCoordinates.size());
		Drawing.pen().setColor(new Color(92, 47, 16));
		Drawing.pen().drawPolyline(polygonXCoordinates.stream().mapToInt(i -> i).toArray(), polygonYCoordinates.stream().mapToInt(i -> i).toArray(), polygonXCoordinates.size());
		
		polygonXCoordinates = new ArrayList<Integer>(polygonXCoordinates.subList(4, 13));
		polygonYCoordinates = new ArrayList<Integer>(polygonYCoordinates.subList(4, 13));
		polygonXCoordinates.add(polygonXCoordinatesArray[8]);
		polygonXCoordinates.add(polygonXCoordinatesArray[7]);
		polygonXCoordinates.add(polygonXCoordinatesArray[4]);
		polygonYCoordinates.add(polygonYCoordinatesArray[8]);
		polygonYCoordinates.add(polygonYCoordinatesArray[7]);
		polygonYCoordinates.add(polygonYCoordinatesArray[4]);
		
		Drawing.pen().setColor(new Color(242, 132, 17));
		Drawing.pen().fillPolygon(polygonXCoordinates.stream().mapToInt(i -> i).toArray(), polygonYCoordinates.stream().mapToInt(i -> i).toArray(), polygonXCoordinates.size());
		Drawing.pen().setColor(new Color(92, 47, 16));
		Drawing.pen().drawPolyline(polygonXCoordinates.stream().mapToInt(i -> i).toArray(), polygonYCoordinates.stream().mapToInt(i -> i).toArray(), polygonXCoordinates.size());
		
	}
	
}

