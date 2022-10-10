public class Rectangle {

    private double width;
    private double length;

	public Rectangle(){}
	public Rectangle(double w, double l) {
		width = w;
		length = l;
	}
	public double getWidth(){
		return width;
	}
	public double getLength(){
		return length;
	}
    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2*length+2*width;
    }
	
	@Override
    public String toString() {
        return "width="+width+", length="+length;
    }
}