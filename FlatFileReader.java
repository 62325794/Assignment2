package MainClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FlatFileReader{
	
	public void main() throws FileNotFoundException {
		
		//File objects of given data files
		File personsData = new File("data/Persons.dat");
		File customersData = new File("data/Customers.dat");
		File productsData = new File("data/Products.dat");
		
		//Scanner objects for every file
		Scanner personsScanner = new Scanner(personsData);
		Scanner customersScanner = new Scanner(customersData);
		Scanner productsScanner = new Scanner(productsData);
		
		//Parses every scanner object with ";" delimeter
		personsScanner.useDelimiter(";");
		customersScanner.useDelimiter(";");
		productsScanner.useDelimiter(";");
		
		//Object types for address, person, customers, and products
		Address address;
		Persons person;
		Customers customers;
		Products product;
		
		//product sub class objects
		LeaseAgreements leaseAgreement;
		SalesAgreement salesAgreement;
		
		//Variables used for Date objects
		Integer startYear;
		Integer startMonth;
		Integer startDay;
		Date startDate;
		
		Integer endYear;
		Integer endMonth;
		Integer endDay;
		Date endDate;
		
		//Variables for time object
		Integer hour;
		Integer minute;
		Integer second;
		Integer nano;
		
		//ArrayLists that will store the corresponding objects
		ArrayList<Address> addressList = new ArrayList<Address>();
		ArrayList<Persons> personsList = new ArrayList<Persons>();
		ArrayList<Customers> customersList = new ArrayList<Customers>();
		ArrayList<Products> productsList = new ArrayList<Products>();
		
		//Object variables that will be used to read in each file
		String data;
		String code;
		String name;
		String type;
		
		//Object variables used to read in the number of lines (first line) of every file;
		String numPersonLines = personsScanner.nextLine();
		String numCustomersLines = customersScanner.nextLine();
		String numProductsLines = productsScanner.nextLine();
		
		String primary;
		
		String[] dataSplit; //used to store the parsed lines of the data files one by one
		String[] addressSplit; //used to store the and parse a single field of the dataSplit[] string
		
		
		//Object variables used for Products subclasses
		Double deposit;
		Double monthlyCost;
		Double parkingFee;
		Double cost;
	
		//public Address(Integer zipCode, String street, Integer houseNumber, String city, String state)
		//“STREET,CITY,STATE,ZIP,COUNTRY"
		
		while (personsScanner.hasNext()) {
			
			data = personsScanner.nextLine();
			dataSplit = data.split(";");

			code = dataSplit[0];
			name = dataSplit[1];
			
			addressSplit = dataSplit[2].split(",");
			address = new Address(addressSplit[0], addressSplit[1], addressSplit[2], Integer.parseInt(addressSplit[3]), addressSplit[4]);
			
			person = new Persons(code, name, address);
			
			addressList.add(address);
			personsList.add(person);
		}
		
		personsScanner.close();
		
		//code,type,primaryContact,name, address
		
		//String code, String type, String primaryContact, String name, Address address
		
		while (customersScanner.hasNext()) {
			
			data = customersScanner.nextLine();
			dataSplit = data.split(";");

			code = dataSplit[0];
			type = dataSplit[1];
			primary = dataSplit[2];
			name = dataSplit[3];
			
			addressSplit = dataSplit[4].split(",");
			address = new Address(addressSplit[0], addressSplit[1], addressSplit[2], Integer.parseInt(addressSplit[3]), addressSplit[4]);
			
			customers = new Customers(code, type, primary, name, address);
			
			addressList.add(address);
			customersList.add(customers);
		}
		
		customersScanner.close();
		
		
		while (productsScanner.hasNext()) {
			
			data = productsScanner.nextLine();
			dataSplit = data.split(";");
			code = dataSplit[0];
			type = dataSplit[1];
			
			if (dataSplit[1] == "L") {
				//public LeaseAgreements(String code, Date startDate, Date endDate, Address address, String customerName, Double deposit, Double monthlyCost)
				//code;L;startDate;endDate;address;customerName;deposit;monthlyCost
				
				addressSplit = dataSplit[4].split(",");
				address = new Address(addressSplit[0], addressSplit[1], addressSplit[2], Integer.parseInt(addressSplit[3]), addressSplit[4]);
				name = dataSplit[5];
				String[] startDateSplit = dataSplit[2].split("-");
				String[] endDateSplit = dataSplit[3].split("-");
				
				startYear = Integer.parseInt(startDateSplit[0]);
				startMonth = Integer.parseInt(startDateSplit[1]);
				startDay = Integer.parseInt(startDateSplit[2]);
				endYear = Integer.parseInt(endDateSplit[0]);
				endMonth = Integer.parseInt(endDateSplit[1]);
				endDay = Integer.parseInt(endDateSplit[2]);
				
				startDate = new Date(startYear, startMonth, startDay);
				endDate = new Date(endYear, endMonth, endDay);
				deposit = Double.parseDouble(dataSplit[6]);
				monthlyCost = Double.parseDouble(dataSplit[7]);
				leaseAgreement = new LeaseAgreements(code, startDate, endDate, address, name, deposit, monthlyCost);
				
			} else if (dataSplit[1] == "S") {
				//code;S;dateTime;address;totalCost;downPayment;monthlyPayment;payableMonths;interestRate
				
				
				addressSplit = dataSplit[3].split(",");
				address = new Address(addressSplit[0], addressSplit[1], addressSplit[2], Integer.parseInt(addressSplit[3]), addressSplit[4]);
			} else if (dataSplit[1] == "P") {
				//code;P;parkingFee
				parkingFee = Double.parseDouble(dataSplit[2]);
				ParkingPass pass = new ParkingPass(code, type, parkingFee);
				
			} else if (dataSplit[1] == "A") {
				//code;A;name;cost
				cost = Double.parseDouble(dataSplit[3]);
				Amenity amenity = new Amenity(code, type, dataSplit[2], cost);
			}
			
		}
		productsScanner.close();
		
		}
}