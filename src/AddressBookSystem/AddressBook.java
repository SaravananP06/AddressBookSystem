package AddressBookSystem;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Class is used for storing all the contact details
 */
public class AddressBook {
	HashMap<String,Contact> HPOfContacts = new HashMap<String,Contact>();
	
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
		
		String key = objContact.firstName + " " + objContact.lastName;
		HPOfContacts.put(key,objContact);
		
	}
	public void editContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details to edit contact: ");
		System.out.print("Enter First Name : ");
		String firstName = sc.nextLine();
		
		System.out.print("Enter Last Name: ");
		String lastName = sc.nextLine();
		
		String key = firstName + " " + lastName;
		
		if (HPOfContacts.containsKey(key)) {
			Contact objCont = HPOfContacts.get(key);
			
			System.out.print("Enter Address: ");
			objCont.address = sc.nextLine();
			
			System.out.print("Enter City: ");
			objCont.city = sc.nextLine();
			
			System.out.print("Enter State: ");
			objCont.state = sc.nextLine();
			
			System.out.print("Enter Email ID: ");
			objCont.email = sc.nextLine();
			
			System.out.print("Enter Zip: ");
			objCont.zip = sc.nextInt();
			
			System.out.print("Enter Phone Number: ");
			objCont.phoneNumber = sc.nextLong();
		}
		
	}
	
	/*
	 * For deleting the array elements
	 */
	public void deleteContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details to edit contact: ");
		System.out.print("Enter First Name : ");
		String firstName = sc.nextLine();
		
		System.out.print("Enter Last Name: ");
		String lastName = sc.nextLine();
		
		String key = firstName + " " + lastName;
		
		if (HPOfContacts.containsKey(key)) {
			
			HPOfContacts.remove(key);
			}
		
	}
	
	
	
	/*
	 * Displaying all contacts
	 */
	public void displayContacts() {
		for (Contact objContact : HPOfContacts.values()) {
			System.out.println("First Name: "+objContact.firstName);
			System.out.println("Last Name: "+objContact.lastName);
			System.out.println("Address: "+objContact.address);
			System.out.println("City: "+objContact.city);
			System.out.println("State: "+objContact.state);
			System.out.println("Email id: "+objContact.email);
			System.out.println("Zip: "+objContact.zip);
			System.out.println("Phone No: "+objContact.phoneNumber);
	}
	
	}
}