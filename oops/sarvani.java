package oops;
class shivani{
	int age =20;
	float grade=9.12f;
void friend() {
	System.out.println("She is my friend");
}
void bestFriend() {
	
	System.out.println("She is my bestfriend too");
	
}
shivani(){
	int a=10;
	int b=20;
	int result=a+b;
	System.out.println(result);
}
	
}

public class sarvani {
	public static void main(String args[]) {
		shivani obj =new shivani();
		obj.friend();
		obj.bestFriend();
		System.out.println(obj.age);
		


	
		
	}

}
