//code;S;dateTime;address;totalCost;downPayment;monthlyPayment;payableMonths;interestRate

package MainClasses;

import java.util.Date;

public class SalesAgreement{
	
	private String code;
	private Date dateTime;
	private Address address;
	private Double totalCost;
	private Double downPayment;
	private Double monthlyPayment;
	private Integer payableMonths;
	private Double interestRate;
	
	
	public String getCode() {
		return this.code;
	}
	public Date getDateTime() {
		return this.dateTime;
	}
	public Address getAddress() {
		return this.address;
	}
	public Double getTotalCost() {
		return this.totalCost;
	}
	public Double getDownPayment() {
		return this.downPayment;
	}
	public Double getMonthlyPayment() {
		return this.monthlyPayment;
	}
	public Integer getPayableMonths() {
		return this.payableMonths;
	}
	public Double getInterestRate() {
		return this.interestRate;
	}
	
	
	public void setCode(String code) {
		this.code = code;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	public void setDownPayment(Double downPayment) {
		this.downPayment = downPayment;
	}
	public void setMonthlyPayment(Double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	public void setPayableMonths(Integer payableMonths) {
		this.payableMonths = payableMonths;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public SalesAgreement(String code, Date dateTime, Address address, Double totalCost, Double downPayment, Double monthlyPayment, Integer payableMonths, Double interestRate) {
		
		this.code = code;
		this.dateTime = dateTime;
		this.address = address;
		this.totalCost = totalCost;
		this.downPayment = downPayment;
		this.monthlyPayment = monthlyPayment;
		this.payableMonths = payableMonths;
		this.interestRate = interestRate;
		
	}
	
}