package Packag_comp;

public class Rectangle_Pro1 {

	
	 private float length;
	    private float width;

	    // Setter method for setting the length of the rectangle
	    public void setLength(float length) {
	        this.length = length;
	    }

	    // Getter method for getting the length of the rectangle
	    public float getLength() {
	        return length;
	    }

	    // Setter method for setting the width of the rectangle
	    public void setWidth(float width) {
	        this.width = width;
	    }

	    // Getter method for getting the width of the rectangle
	    public float getWidth() {
	        return width;
	    }

	    // Method to calculate the area of the rectangle
	    public float getArea() {
	        return length * width;
	    }

	    // Method to calculate the Perimeter of the rectangle
	    public float getPerimeter() {
	        return 2 * (length + width);
	    }

	    public static void main(String[] args) {
	    	Rectangle_Pro1 rectangle = new Rectangle_Pro1();
	        rectangle.setLength(5.0f);
	        rectangle.setWidth(3.0f);

	        System.out.println("Length: " + rectangle.getLength());
	        System.out.println("Width: " + rectangle.getWidth());
	        System.out.println("Area: " + rectangle.getArea());
	        System.out.println("Perimeter: " + rectangle.getPerimeter());
	    }	
			
	
}
