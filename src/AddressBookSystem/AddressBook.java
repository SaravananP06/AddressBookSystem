package AddressBookSystem;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Class is used for storing all the contact details
 */
public class AddressBook {
	ArrayList<Contact> listOfContacts = new ArrayList<Contact>();
	
	/*
	 * Added contact into a list
	 */
	public void createContact() {
		   Scanner sc = new Scanner(System.in);
		  
			Contact objContact = new Contact();
			
			System.out.print("Enter First Name: ");
			objContact.firstName = sc.nextLine();
			
			System.out.print("Enter Last Name: ");
			objContact.lastName = sc.nextLine();
			
			System.out.print("Enter Address: ");
			objContact.address = sc.nextLine();
			
			System.out.print("Enter City: ");
			objContact.city = sc.nextLine();
			
			System.out.print("Enter State: ");
			objContact.state = sc.nextLine();
			
			System.out.print("Enter Email ID: ");
			objContact.email = sc.nextLine();
			
			System.out.print("Enter Zip: ");
			objContact.zip = sc.nextInt();
			
			System.out.print("Enter Phone Number: ");
			objContact.phoneNumber = sc.nextLong();
			
			listOfContacts.add(objContact);
		
	}
	
	/*
	 * Displaying all contacts
	 */
	public void displayContacts() {
		for (int i = 0; i<listOfContacts.size(); i++) {
			System.out.println("First Name: "+listOfContacts.get(i).firstName);
			System.out.println("Last Name: "+listOfContacts.get(i).lastName);
			System.out.println("Address: "+listOfContacts.get(i).address);
			System.out.println("city: "+listOfContacts.get(i).city);
			System.out.println("State: "+listOfContacts.get(i).state);
			System.out.println("Zip: "+listOfContacts.get(i).zip);
			System.out.println("Phone Number: "+listOfContacts.get(i).phoneNumber);
			System.out.println("Email id: "+listOfContacts.get(i).email);
		}
	}
	

}
