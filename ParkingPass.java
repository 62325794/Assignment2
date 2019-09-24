package MainClasses;

public class ParkingPass{
	
	private String code;
	private String type;
	private Double parkingFee;
	
	
	public String getCode() {
		return this.code;
	}
	public String getType() {
		return this.type;
	}
	public Double getParkingFee() {
		return this.parkingFee;
	}
	
	
	public void setPassCode(String code) {
		this.code = code;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setParkingFee(Double parkingFee) {
		this.parkingFee = parkingFee;
	}
	
	public ParkingPass(String code, String type, Double parkingFee) {
		
		this.code = code;
		this.type = type;
		this.parkingFee = parkingFee;
		
	}
}