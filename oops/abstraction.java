package oops;
 abstract class a1{
	int a=90;
	abstract void fun(); 
	static int c = 30;
	void fact () {
		System.out.println("facting");
	}
	abstract int  add();
	static int  sub( int u ,int v) {
		int g= u-v;
		return g;
		
	
		
		
		
	}
}
class b extends a1{
	void fun() {
		System.out.println("fun is fun");
	}
	void ben () {
		System.out.println("not fun");
	}
	int add() {
		int e =35;
		int f=40;
		int c =e+f;
		return c;
	}
}


public class abstraction {
	public static void main(String[] args) {
		b obj = new b();
		obj.fun();
		obj.ben();
		System.out.println(a1.c);
		obj.fact();
		System.out.println(obj.add());
		System.out.println(a1.sub(25,15));
	}

}
