package Mypackage;
public class Customer{
	private int customerid;
	private int age;
	private int pincode;
	private String name;
	private String city;
	public Customer() {
		System.out.println("Default Constructor");
	}
	public Customer(String name,String city,int age,int pinc,int cid) {
		this.name = name;
		this.city = city;
		this.age = age;
		pincode = pinc;
		customerid = cid;
	}
	public void setName(String Name) {
		name = Name;
	}
	public String getName() {
		return name;
	}
	public void printdetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("City: " + city);
		System.out.println("Pincode: " + pincode);
		System.out.println("ID: " + customerid);
	}
	public static class CustomerMain {

		public static void main(String[] args) {
			// TODO Au	to-generated method stub
			Customer obj = new Customer();
			obj.setName("Kashish Jain");
			System.out.println("Name is:(Using getName()) " + obj.getName());
			Customer obj1 = new Customer("Kashish Jain","Himatnagar",21,383001,1);
			obj1.printdetails();
		}

}
}

