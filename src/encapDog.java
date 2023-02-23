class Dog{
	
	private String name;
	private int cost;
	
	public void setData(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}
	
	
	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getCost() {
//		return cost;
//	}
//	public void setCost(int cost) {
//		this.cost = cost;
//	}
	
	
	
}

public class encapDog {

	public static void main(String[] args) {
		
//		Dog d = new Dog();
//		d.setName("Bhalu");
//		d.setCost(10000);
		
		Dog d1 = new Dog();
		d1.setData("Moti", 20000);
		
		System.out.println(d1.getName());
		System.out.println(d1.getCost());
//		System.out.println(d.getCost());
//		System.out.println(d.getCost());
		
		
	

	}

}
