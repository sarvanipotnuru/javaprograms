package oops;
class x{
	int s=89;
}
class y extends x{
	float fl = 90.3f;
	y(){
		System.out.println("constructor");
	}
	
}
class z extends y{
	String str = "saravani";
}
class w extends x{
	int a=30;
	w(){
	   }
	}

class  n extends z{
	double d=3.245d;
}



public class hybridinheritance {
	public static void main(String[] args) {
		z obj = new z();
		System.out.println(obj.str);
		w ob = new w();
		System.out.println(ob.a);
		System.out.println(obj.s);
		System.out.println(obj.fl);
		n obi = new n();
		System.out.println(obi.d);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
