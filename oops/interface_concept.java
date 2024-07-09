package oops;
interface shape{
	int x=23;
	float f= 34.5f;
	double d = 34.5678d;
	abstract void circle();
	 static int  square() {
		 int i =20;
		int k= i*i;
		return k;
		
		
	 }
	static int rectangle(int a ,int b) {
		int c= a*b;
		
		System.out.println("Area of rectangle" +c);
		return c;

}
	default float triangle( int d , int e) {
		float g = 0.5f*d*e;
		return g;
		
	}
}
class shape1 implements shape{
	 public void circle() {
		 System.out.println("Area of circle");
	 }
	
}

public class interface_concept {
	public static void main(String[] args) {
		shape1 ss = new shape1();
		ss.circle();
		System.out.println(ss.triangle(6, 7));
		shape.rectangle( 3,4);
		System.out.println(ss.x);
		System.out.println(ss.d);
		System.out.println(ss.f);
		System.out.println(shape.square());
	}
	

}
