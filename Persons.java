package MainClasses;


public class Persons {
	
	private String code;
	private String name;
	private String firstName;
	private String lastName;
	private Address address;
	private String email;
	
	
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	
	
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Persons(String code, String name, Address address) {
		this.code = code;
		this.name = name;
		this.address = address;
	}
}