package oops;
class max{
	int a=20;
	float b=2.3f;
	void min() {
		System.out.println("Hello");
	}
	void ben() {
		System.out.println("Hi");
	}
	max(){
		System.out.println("Namaste");
	}
}

public class example { 
	public static void main (String args[]){
		max ob =new max();
		System.out.println(ob.a);
		System.out.println(ob.b);
		ob.min();
		ob.ben();
	}

}
