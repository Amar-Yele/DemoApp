
class Student{
	
	private String name;
	private int rollNumber;
	private String city;
	int Date;
	
	// Setters and Getters
	
	public void setDate() { 
		this.setDate();
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	
}

public class Encapsulation1 {

	public static void main(String[] args) {
		
		Student St = new Student();
		St.setName("Amar");
		St.setRollNumber(78);
		St.setDate();
		
		String name = St.getName();
		int rollNumber = St.getRollNumber();
		System.out.println("Name of Student: "+name);
		System.out.println("Roll Number: "+rollNumber);
		
		Student st2 = new Student();
		st2.setCity("Pune");
		String city = st2.getCity();
		
		System.out.println("Name of city: "+city);
		
		Student st3 = new Student();
		st3.setCity("SATARA");
		String city1 = st3.getCity();
		
		System.out.println("Name of city: "+city1);
		System.out.println(st2.getCity());
		System.out.println(st3.getCity());
		System.out.println(St.getCity());
		
		System.out.println(St.getDate());
		
		
		
//		for one Class We can create a Multiple objects in the Encapsulation
		
	}

}
