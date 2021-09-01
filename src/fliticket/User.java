package fliticket;

public class User {
	private String name;
	private String cpf;
	private int age;
	private String address;
	
	public User() {
		
	}
	
	
	public User(String name, String cpf, int age, String address) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.age = age;
		this.address = address;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "User [name=" + name + "; cpf=" + cpf + "; age=" + age + "; address=" + address + "]";
	}
	
	
	
}
