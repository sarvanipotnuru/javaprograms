package polymorphism;
class shapes{
	void draw() {
		System.out.println("");
		
	}
}
class polygon extends shapes{
	void draw() {
		System.out.println("polygon is drawn");
		
	}
}
class hexagon extends shapes{
	void draw () {
		System.out.println("Draw a hexagon");
		super.draw();
	}
}

public class methodoverriding {
public static void main(String[] args) {
	hexagon obje = new hexagon();
	obje.draw();
	shapes poly = new polygon();
	poly.draw();
	
}
}
