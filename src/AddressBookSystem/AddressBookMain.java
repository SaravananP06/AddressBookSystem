package AddressBookSystem;

/*
 * This main class is the entry point of the application
 */

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		AddressBook objAddressBook = new AddressBook();
		/*
		 * Calling createContact method
		 */
		objAddressBook.createContact();
		/*
		 * Calling displayContacts method
		 */
		objAddressBook.displayContacts();	
		/*
		 * Calling to editContact method
		 */
		objAddressBook.editContact();
		objAddressBook.displayContacts();
	}
	
}
