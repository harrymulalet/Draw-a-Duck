package drawingTool;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class Beak {
	
	private int scale;
	
	public Beak() {
		this(1);
	}
	
	public Beak(int scale) {
		this.scale = scale;
	}

	public void drawAt(int left, int bottom) {
		ArrayList<Integer> polygonXCoordinates = new ArrayList<Integer>(Arrays.asList(left, left + 74*scale, left + 98*scale, left + 117*scale, left + 144*scale, left + 141*scale, left + 113*scale, left + 49*scale));
		ArrayList<Integer> polygonYCoordinates = new ArrayList<Integer>(Arrays.asList(bottom + 63*scale, bottom + 31*scale, bottom, bottom + 29*scale, bottom + 45*scale, bottom + 73*scale, bottom + 82*scale, bottom + 77*scale));
		
		Drawing.pen().setColor(new Color(249, 183, 71));
		Drawing.pen().fillPolygon(polygonXCoordinates.stream().mapToInt(i -> i).toArray(), polygonYCoordinates.stream().mapToInt(i -> i).toArray(), polygonXCoordinates.size());
		Drawing.pen().setColor(new Color(92, 47, 16));
		Drawing.pen().drawPolygon(polygonXCoordinates.stream().mapToInt(i -> i).toArray(), polygonYCoordinates.stream().mapToInt(i -> i).toArray(), polygonXCoordinates.size());
	
		polygonXCoordinates.subList(5, 7).clear();
		polygonXCoordinates.add(5, left + 142*scale);
		polygonYCoordinates.subList(5, 7).clear();
		polygonYCoordinates.add(5, bottom + 62*scale);
		
		Drawing.pen().setColor(new Color(242, 132, 17));
		Drawing.pen().fillPolygon(polygonXCoordinates.stream().mapToInt(i -> i).toArray(), polygonYCoordinates.stream().mapToInt(i -> i).toArray(), polygonXCoordinates.size());
		
		Drawing.pen().setColor(new Color(92, 47, 16));
		Drawing.pen().drawPolygon(polygonXCoordinates.stream().mapToInt(i -> i).toArray(), polygonYCoordinates.stream().mapToInt(i -> i).toArray(), polygonXCoordinates.size());
		Drawing.pen().fillOval(left + 86*scale, bottom + 22*scale, 6*scale, 12*scale);
	}
}
