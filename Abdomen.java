package drawingTool;

public class Abdomen {
	
	private Belly belly;
	private Wing wing;
	private Tail tail;
	private Leg leg;
	private int scale;
	
	public Abdomen(){
		this(1);
	}
	
	public Abdomen(int scale){
		this.scale = scale;
		belly = new Belly(scale);
		wing = new Wing(scale);
		tail = new Tail(scale);
		leg = new Leg(scale);
	}
	
	public void drawAt(int left, int bottom) {
		
		leg.drawAt(left + 51*scale, bottom + 256*scale);
		leg.drawAt(left + 147*scale, bottom + 256*scale);
		belly.drawAt(left, bottom);
		tail.drawAt(left + 260*scale, bottom + 66*scale);
		wing.drawAt(left + 75*scale, bottom + 60*scale);
		
	}
}
