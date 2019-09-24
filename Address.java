package MainClasses;

public class Address {
	
	private Integer zip;
	private String street;
	private String country;
	private String city;
	private String state;
	
	
	public Integer getZipCode() {
		return this.zip;
	}
	public String getStreet() {
		return this.street;
	}
	public String getCity() {
		return this.city;
	}
	public String getState() {
		return this.state;
	}
	public String getCountry() {
		return this.country;
	}
	
	
	public void setZipCode(Integer zip) {
		this.zip = zip;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString() {
		return "\nStreet:" + this.street + "\nCity: " +
				this.city + "\nState: " + this.state;
	}
	
	//“STREET,CITY,STATE,ZIP,COUNTRY”
	
	public Address(String street,String city, String state, Integer zip, String country) {
		
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip= zip;
		this.country = country;
	}
}