package MainClasses;

import java.util.Date;

//code;L;startDate;endDate;address;customerName;deposit;monthlyCost

public class LeaseAgreements{
	
	private String code;
	private Date startDate;
	private Date endDate;
	private Address address;
	private String customerName;
	private Double deposit;
	private Double monthlyCost;
	
	
	public String getCode() {
		return code;
	}
	public Date getStartDate() {
		return startDate;
	}
	public Date getEndDate() {
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
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(Date endDate) {
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
	
	public LeaseAgreements(String code, Date startDate, Date endDate, Address address, String customerName, Double deposit, Double monthlyCost) {
		
		this.code = code;
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
		this.customerName = customerName;
		this.deposit = deposit;
		this.monthlyCost = monthlyCost;
		
	}
}