
public class Point {

	int x, y;
	
	public Point() {};
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(Point point) {
		double distance = (double) Math. sqrt((this.x-point.x)*(this.x-point.x) + (this.y-point.y)*(this.y-point.y));
		System.out.println("La distance entre P1 et P2 est de : "+distance);
		return distance;
	}
}
