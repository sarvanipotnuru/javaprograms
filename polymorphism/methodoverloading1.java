package polymorphism;
class xz{
	void walk() {
		System.out.println("He can walk");
	}
	void walk (float a) {
		System.out.println(a);
	}
}
public class methodoverloading1 {
public static void main(String[] args) {
	xz obj = new xz();
	obj.walk();
	obj.walk(3.5f);
}
}
