package Proyecto3;

public class Person {
	private String name;
	private String email;
	private String rfc;
	private String address;
	private int age;
	
	
	private static int total=0;

	   
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", rfc=" + rfc + ", address=" + address + ", age=" + age + "]";
	}

	
	public Person(String name, String email, String rfc, String address, int age) {
		super();
		this.name = name;
		this.email = email;
		this.rfc = rfc;
		this.address = address;
		this.age = age;
	}	//Constructor
	
	
	public static int getTotal() {
		return Person.total;
	}//getTotal

	//TODO Getters y Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	


	
}
