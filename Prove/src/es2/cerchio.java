package es2;

public class cerchio extends figure{
	
	private double raggio;
	
	public cerchio(double raggio) {
		this.raggio = raggio;
	}
	
	public void area() {
		System.out.println("Area del cerchio: " + raggio*raggio*Math.PI);
	}
	
}
