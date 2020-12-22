package es2;

public class provamain {

	public static void main(String[] args) {
		
		figure f = new figure(12, 30);
		rettangolo r = new rettangolo(10, 20);
		triangoloRettangolo t = new triangoloRettangolo(10, 10);
		cerchio c = new cerchio(20);
		
		f.area();
		r.area();
		t.area();
		c.area();

	}

}
