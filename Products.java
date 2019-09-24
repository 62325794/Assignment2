package MainClasses;

public class Products{
	private String code;
	private String type;
	private String startDate;
	private String endDate;
	private Address address;
	private String customerName;
	private Double deposit;
	private Double monthlyCost;
	
	
	public String getCode() {
		return code;
	}
	public String getType() {
		return type;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public Address getAddress() {
		return address;
	}
	public String getCustomerName() {
		return customerName;
	}
	public Double getDeposit() {
		return deposit;
	}
	public Double getMonthlyCost() {
		return monthlyCost;
	}
	
	
	public void setCode(String code) {
		this.code = code;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public void setMonthlyCost(Double monthlyCost) {
		this.monthlyCost = monthlyCost;
	}
	
	public Products(String code, String type, String startDate, String endDate, Address address, String customerName, Double deposit, Double monthlyCost) {
		this.code = code;
		this.type = type;
	}
	
}