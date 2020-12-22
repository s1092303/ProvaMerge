package es2;

public class triangoloRettangolo extends figure{
		
		public triangoloRettangolo(double dim1, double dim2) {
			
			super(dim1, dim2);
			
		}
		
		public void area() {
			System.out.println("Area del triangolo: " + (dim1*dim2)/2);
		}

}
