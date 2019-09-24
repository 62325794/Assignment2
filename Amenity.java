package MainClasses;

//import java.util.ArrayList;


public class Amenity {
	
	private String code;
	private String type;
	private String name;
	private Double cost;
	
	
	
	public String getCode() {
		return this.code;
	}

	public String getType() {
		return this.type;
	}

	public String getName() {
		return this.name;
	}

	public double getCost() {
		return this.cost;
	}

	
	
	public void setAmenityCode(String code) {
		this.code = code;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "Amenity Code:" + this.code + "\nType:" + this.type + "\nName: " +
				this.name + "\nCost: " + this.cost;
	}
	
	public Amenity(String code, String type, String name, Double cost) {
		this.code = code;
		this.type = type;
		this.name = name;
		this.cost = cost;
	}

}