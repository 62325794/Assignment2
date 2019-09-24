package MainClasses;

public class Customers{
	private String code;
	private String type;
	private String primaryContact;
	private String name;
	private Address address;
	
	
	public String getCode() {
		return code;
	}
	public String getType() {
		return type;
	}
	public String getPrimaryContact() {
		return primaryContact;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	
	
	public void setCode(String code) {
		this.code = code;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Customers(String code, String type, String primaryContact, String name, Address address) {
		this.code = code;
		this.type = type;
		this.primaryContact = primaryContact;
		this.name = name;
		this.address = address;
	}
}