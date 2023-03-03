
class demoStatic{
	
	static int a;
	static int b;
	static int c;
	
	static void disp() {
		a = 10;
		b = 20;
		c = a+b;
		System.out.println("This is just an Static numbers Calculation");
		System.out.println(c);
	}
	
}


public class StaticKeys {

	static int z = 80;
	static {
		System.out.println("Inside main Class Static method is Called"); // this will run 1st and then ohters will be run
		System.out.println("Number Z is: "+z); 
		// if you dont define the z as a Static then inside the static method it will show error
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demoStatic.disp();  // we have called display Method by directly using class without use of the Object
		demoStatic d1 = new demoStatic();
		d1.disp();		// here we have create a Object and called the display Method
		
		

	}

}
