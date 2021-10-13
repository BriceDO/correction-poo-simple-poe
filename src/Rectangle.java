
public class Rectangle {
	
	int a;
	int b;
	
	public Rectangle() {}
	
	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int surface() {
		int surface = a * b;
		System.out.println("La surface du rectangle est : "+surface);
		return surface;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "]";
	}
	
}
