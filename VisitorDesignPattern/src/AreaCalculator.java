
public class AreaCalculator implements ShapeVisitor{
	
	private double totalArea = 0;
	private double radiusOfCircle = 5;
    private double sideOfSquare = 4;
    private double baseOfTriangle = 3;
    private double heightOfTriangle = 6;

	@Override
	public void visit(Circle circle) {
		totalArea += Math.PI * Math.pow(radiusOfCircle, 2);
		
	}

	@Override
	public void visit(Square square) {
		totalArea += Math.pow(sideOfSquare, 2);
		
	}

	@Override
	public void visit(Triangle triangle) {
		totalArea += (baseOfTriangle * heightOfTriangle) / 2;
		
	}
	
	public double getTotalArea() {
        return totalArea;
    }

}
