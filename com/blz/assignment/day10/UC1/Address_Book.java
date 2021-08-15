package com.blz.assignment.day10.UC1;

import java.util.Scanner;

import java.util.ArrayList;;


public class Address_Book {
	private static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		addressBook();
	}

	public static void addressBook() {
		ArrayList<Contact> contactList = new ArrayList<>();
		int choice = 0;
		do {
			System.out.println("1.add\n2.display\n3.exit");
			System.out.println("Enter choice");
			choice = SC.nextInt();
			switch (choice) {
			case 1:
				Contact add = addInputs();
				contactList.add(add);
				break;

			case 2:
				for (Contact  items : contactList) {
					System.out.println(items.toString());
				}
				break;

			case 3:
				System.out.println("Byee..");
				break;
			default:
				System.out.println("Please Enter from choice ");

				break;
			}
		} while (choice != 3);
	}

	public static Contact addInputs() {
		Contact add;
			add = new Contact();
			System.out.println("Enter a first name: ");
			add.setFirstName(SC.next());
			System.out.println("Enter a last name: ");
			add.setLastName(SC.next());
			System.out.println("Enter an address: ");
			add.setAddress(SC.next());
			System.out.println("Enter a city: ");
			add.setCity(SC.next());
			System.out.println("Enter a state: ");
			add.setState(SC.next());
			System.out.println("Enter a zip: ");
			add.setZip(SC.nextInt());
			System.out.println("Enter a phone number: ");
			add.setPhoneNumber(SC.nextLong());
			System.out.println("Enter an email ID: ");
			add.setEmailID(SC.next());
		return add;
	}
}

class Contact {
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private long phoneNumber;
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	String emailID;
	String firstName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int getZip() {
		return zip;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmailID() {
		return emailID;
	}
	
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	@Override
	public String toString() {
		return "Contact [lastName=" + lastName + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", emailID=" + emailID + ", firstName=" + firstName
				+ "]";
	}
	
}