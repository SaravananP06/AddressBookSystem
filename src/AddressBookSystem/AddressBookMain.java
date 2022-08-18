package AddressBookSystem;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		Contact objContact = new Contact();
		objContact.firstName = "Saravanan";
		objContact.lastName = "P";
		objContact.address = "Mahim";
		objContact.city = "Mumbai";
		objContact.state = "Maharashtra";
		objContact.zip = 400019;
		objContact.phoneNumber = 1234563090;
		objContact.email = "Saravanan@gmail.com";
		
		System.out.println("First Name: "+objContact.firstName);
		System.out.println("Last Name: "+objContact.lastName);
		System.out.println("Address: "+objContact.address);
		System.out.println("city: "+objContact.city);
		System.out.println("State: "+objContact.state);
		System.out.println("Zip: "+objContact.zip);
		System.out.println("Phone Number: "+objContact.phoneNumber);
		System.out.println("Email id: "+objContact.email);
	}

}
