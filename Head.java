package drawingTool;

public class Head {
	
	private Eye eye;
	private Beak beak;
	private Crown crown;
	private int scale;
	
	public Head(){
		this(1);
	}
	
	public Head(int scale){
		this.scale = scale;
		crown = new Crown(scale);
		eye = new Eye(scale);
		beak = new Beak(scale);
	}
	
	public void drawAt(int left, int bottom) {
		
		crown.drawAt(left + 95*scale, bottom);
		eye.drawAt(left + 138*scale, bottom + 55*scale);
		beak.drawAt(left, bottom + 53*scale);
		
//		crown.drawAt(left + 103*scale, bottom + 8*scale);
//		eye.drawAt(left + 146*scale, bottom + 63*scale);
//		beak.drawAt(left + 8*scale, bottom + 61*scale);
	}
}
