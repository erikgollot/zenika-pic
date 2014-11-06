package com.zenika.formation;

/**
 * 
 * @author Mathias Seguy (Android2EE)
 * @goals
 * This class aims to:
 * Erik Modification2
 */
public class Person
{

	private String name;
	
	private String firstName;
	
	private String address;

	/**
	 * @return the address
	 */
	public final String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public final void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	* The comment
	*
	**/
	public void doit(String args) {
		if (args!=null && args.length() > 12) {
			System.out.println("c'est bon");
		} 
		else 
			System.err.println("Là Sonar va gueuler");
	}

}
