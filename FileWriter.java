package MainClasses;

import java.io.PrintWriter;

public class FileWriter{
	
	PrintWriter personsOut = new PrintWriter("data/NewPersons.dat");
	
	for(Persons x : personsList) {
		String result = String.format("\n" + x);
		personsOut.write(result);
	}
	
	PrintWriter customersOut = new PrintWriter("data/NewCustomers.dat");
	
	for(Customers x : customersList) {
		String result = String.format("\n" + x);
		customersOut.write(result);
	}
}
}