package es2;

public class rettangolo extends figure{

	rettangolo(double dim1, double dim2) {
		
		super(dim1, dim2);
		
	}
	
	public void area() {
		System.out.println("Area di questo rettangolo: " + dim1*dim2);
	}
	
}
