package oops;
interface jhansi{
	abstract void girl();
	
	
}
interface manju{
	abstract void boy();
	
}
class sravanthi implements  jhansi,manju{
     public void girl() {
	    System.out.println("He is a boy");
}

	@Override
	public void boy() {
		System.out.println("she is girl");
	}
	
}
class nagu{
	
}

public class interface2 {
	public static void main(String[] args) {
		sravanthi SS = new sravanthi();
		SS.girl();
		SS.boy();
		
	}

}
