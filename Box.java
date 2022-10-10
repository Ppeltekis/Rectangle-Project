public class Box extends Rectangle {

    private double height;
    
	public Box(){
		super();
	}
	public Box(double w, double l, double h) {
		super(w,l);
		height = h;
	}
	public double getHeight(){
		return height;
	}
	public double volume() {
        return height * super.area();
    }

    @Override
	public double area() {
        return 2*super.area()+2*height*getLength()+2*height*getWidth();
    }
	
	@Override
    public String toString() {
        return super.toString()+", height="+height;
    }
}