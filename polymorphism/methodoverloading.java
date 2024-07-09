package polymorphism;
class xyz{
 
	int run() {
		System.out.println("He can run ");
		return 0;
		
	}
	int run(int a) {
		int a1=10;
		System.out.println(a1);
		return a1;
	}
	int run (int a,int b) {
		int c = a+b;
		return c;
	}

}

public class methodoverloading {
	public static void main(String[] args) {
		xyz ob =new xyz();
		ob.run();
		ob.run(2);
		System.out.println(ob.run(10, 20));

	}
	
}
