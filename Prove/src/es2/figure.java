package es2;

public class figure {

	protected double dim1;
	protected double dim2;
	
	public figure() {}
	
	public figure(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	public void area() {
		System.out.println("La figura è indefinita");
	}
	
}
