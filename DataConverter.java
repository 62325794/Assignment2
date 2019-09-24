package MainClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 * Main driver program that reads in files of old system, parses the files line-by-line,
 * stores these values in variables/objects, and then outputs these variables/objects into platform
 * independent language formats
 */
public class DataConverter{
	
	public void main() throws FileNotFoundException {
		
		
		File personsData = new File("data/Persons.dat");
		File customersData = new File("data/Customers.dat");
		File productsData = new File("data/Products.dat");
		
		Scanner personsScanner = new Scanner(personsData);
		Scanner customersScanner = new Scanner(customersData);
		Scanner productsScanner = new Scanner(productsData);
		
		personsScanner.useDelimiter(";");
		customersScanner.useDelimiter(";");
		productsScanner.useDelimiter(";");
		
		Persons person;
		String primary;
		String data;
		String[] dataSplit;
		String[] addressSplit;
		String[] nameSplit;
		
		String type;
		Address address;
		String code;
		String name;
		ArrayList<Address> addressList = new ArrayList<Address>();
		ArrayList<Persons> personsList = new ArrayList<Persons>();
		
	
		//public Address(Integer zipCode, String street, Integer houseNumber, String city, String state)
		//“STREET,CITY,STATE,ZIP,COUNTRY"
		
		int i = 0;
		
		while (personsScanner.hasNext()) {
			
			data = personsScanner.nextLine();
			dataSplit = data.split(";");

			code = dataSplit[0];
			name = dataSplit[1];
			
			addressSplit = dataSplit[2].split(",");
			address = new Address(addressSplit[0], addressSplit[1], addressSplit[2], Integer.parseInt(addressSplit[3]), addressSplit[4]);
			
			
			person = new Persons(code, name, address);
			
			addressList[i] = address;
			personsList[i] = person;
			i++;
		}
		
		personsScanner.close();
		//code,type,primaryContact,name, address
		
		//String code, String type, String primaryContact, String name, Address address
		
		Customers customers;
		Customers[] customersList = null;
		int j = 0;
		
		while (customersScanner.hasNext()) {
			
			data = customersScanner.nextLine();
			dataSplit = data.split(";");

			code = dataSplit[0];
			type = dataSplit[1];
			primary = dataSplit[2];
			name = dataSplit[3];
			
			for(int p = 0; p < 10; p++) {
				if(primary == personsList[p].getCode()) {
					Persons primaryPerson = personsList[p];
				}
			}
			
			addressSplit = dataSplit[4].split(",");
			address = new Address(addressSplit[0], addressSplit[1], addressSplit[2], Integer.parseInt(addressSplit[3]), addressSplit[4]);
			
			
			customers = new Customers(code, type, primary, name, address);
			
			
			customersList[j] = customers;
			j++;
		}
		
		customersScanner.close();
		
		Date startDate;
		Date endDate;
		Double deposit;
		Double monthlyCost;
		Products product;
		ArrayList<Products> productList = new ArrayList<Products>();
		Double parkingFee;
		Double cost;
		
		int k = 0;
		
		while (productsScanner.hasNext()) {
			
			data = productsScanner.nextLine();
			dataSplit = data.split(";");
			code = dataSplit[0];
			type = dataSplit[1];
			
			if (dataSplit[1] == "L") {
				//code;L;startDate;endDate;address;customerName;deposit;monthlyCost
				//startDate = ;
				//endDate = ;
				addressSplit = dataSplit[4].split(",");
				address = new Address(addressSplit[0], addressSplit[1], addressSplit[2], Integer.parseInt(addressSplit[3]), addressSplit[4]);
				name = dataSplit[5];
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
			
			k++;
		}
		productsScanner.close();
		
		}
		
	}
