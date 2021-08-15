package com.blz.assignment.day10.UC4;

import java.util.ArrayList;
import java.util.Scanner;

class Address_Book_UC4 {
	private static final Scanner SC = new Scanner(System.in);
	static Contacts obj;

	public static void main(String[] args) {
		addressBook();
	}

	public static void addressBook() {
		ArrayList<Contacts> contactList = new ArrayList<>();
		int choice = 0;
		do {
			System.out.println("1.add\n2.display\n3.exit\n 4.update\n 5.delete comtact");
			System.out.println("Enter choice");
			choice = SC.nextInt();
			switch (choice) {
			case 1:
				addInputs();
				contactList.add(obj);
				break;

			case 2:
				for (Contacts items : contactList) {
					System.out.println(items.toString());
				}
				break;

			case 3:
				System.out.println("Byee..");
				break;
			case 4:
				System.out.println("Enter name which you want to replace: ");
				String nameReplace = SC.next();
				for (int i = 0; i < contactList.size(); i++) {
					System.out.println(contactList.get(i));
					Contacts editContact = contactList.get(i);
					if (nameReplace.equals(editContact.getFirstName())) {
						System.out.println("Enter a first name: ");
						editContact.setFirstName(SC.next());
						System.out.println("Enter a last name: ");
						editContact.setLastName(SC.next());
						System.out.println("Enter an address: ");
						editContact.setAddress(SC.next());
						System.out.println("Enter a city: ");
						editContact.setCity(SC.next());
						System.out.println("Enter a state: ");
						editContact.setState(SC.next());
						System.out.println("Enter a zip: ");
						editContact.setZip(SC.nextInt());
						System.out.println("Enter a phone number: ");
						editContact.setPhoneNumber(SC.nextLong());
						System.out.println("Enter an email ID: ");
						editContact.setEmailID(SC.next());
						contactList.set(i, editContact);
					}
				}
				break;
			case 5:
				System.out.println("Enter name which you want to delete: ");
				String nameDelete = SC.next();
				for (int i = 0; i < contactList.size(); i++) {
					System.out.println(contactList.get(i));
					Contacts editContact = contactList.get(i);
					if (nameDelete.equals(editContact.getFirstName())) {
						contactList.remove(i);
					}
				}
				break;
			default:
				System.out.println("Please Enter from choice ");

				break;
			}
		} while (choice != 3);
	}

	public static void addInputs() {
		obj = new Contacts();
		System.out.println("Enter a first name: ");
		obj.setFirstName(SC.next());
		System.out.println("Enter a last name: ");
		obj.setLastName(SC.next());
		System.out.println("Enter an address: ");
		obj.setAddress(SC.next());
		System.out.println("Enter a city: ");
		obj.setCity(SC.next());
		System.out.println("Enter a state: ");
		obj.setState(SC.next());
		System.out.println("Enter a zip: ");
		obj.setZip(SC.nextInt());
		System.out.println("Enter a phone number: ");
		obj.setPhoneNumber(SC.nextLong());
		System.out.println("Enter an email ID: ");
		obj.setEmailID(SC.next());
	}
}

class Contacts {
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
	public Object getFirstName;

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
		return "Contacts [lastName=" + lastName + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", emailID=" + emailID + ", firstName=" + firstName
				+ ", getFirstName=" + getFirstName + "]";
	}

}