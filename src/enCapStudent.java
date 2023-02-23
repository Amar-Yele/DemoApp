class Student1{
	
	private String Name;
	private int age;
	private String city;
	
	public Student1(String Name, int age, String city) {
		this.Name=Name;
		this.age = age;
		this.city= city;
	}

	public String getName() {
		return Name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}
}



public class enCapStudent {

	public static void main(String[] args) {
		
		Student1 std = new Student1("Virat", 18, "Bengluru");
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getCity());

	}

}
