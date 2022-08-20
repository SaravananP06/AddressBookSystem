package AddressBookSystem;

import java.util.Scanner;

/*
 * This main class is the entry point of the application
 */

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Scanner sc = new Scanner(System.in);
		
		AddressBook objAddressBook = new AddressBook();
		System.out.println("Enter how many contacts to wanted to add it: ");
		int contacts = sc.nextInt();
		int n = 0;
		while(n < contacts) {
			n++;
			System.out.println("Create New Contact");
			
			/*
			 * Calling createContact method
			 */
			objAddressBook.createContact();
			
			/*
			 * Calling displayContacts method
			 */
			objAddressBook.displayContacts();
			}
		System.out.println("Enter \n1.to Edit contact: \n2.delete contact: ");
		int choice = sc.nextInt();
		switch (choice) {
			case 1:
				/*
				 * Calling to editContact method
				 */
				objAddressBook.editContact();
				/*
				 * Calling displayContacts method
				 */
				objAddressBook.displayContacts();
				break;
			case 2:
				
				/*
				 * Calling to deleteContact method
				 */
				objAddressBook.deleteContact();
				/*
				 * Calling displayContacts method
				 */
				objAddressBook.displayContacts();
				System.out.println("Your contact list is been modified");
				break;
			default:
				System.out.println("Enter your valid choice");
				break;
				
			
		}
 	}
	
}
