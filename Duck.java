package drawingTool;

public class Duck {
	
	private Head head;
	private Thorax thorax;
	private Abdomen abdomen;
	private int scale;
	
	public Duck(){
		this(1);
	}
	
	public Duck(int scale){
		this.scale = scale;
		head = new Head(scale);
		thorax = new Thorax(scale);
		abdomen = new Abdomen(scale);
	}
	
	public void drawAt(int left, int bottom) {	
		head.drawAt(left + 8*scale, bottom + 8*scale);
		thorax.drawAt(left + 119*scale, bottom + 95*scale);
		abdomen.drawAt(left + 119*scale, bottom + 126*scale);
	}
}