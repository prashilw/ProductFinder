package org.prashil.core.demo.beans;

import java.util.Date;

public class Student {
	private String sFirstName;
	private String sLastName;
	private int iAge;
	private Date dDob;
	/**
	 * @return the sFirstName
	 */
	public String getsFirstName() {
		return sFirstName;
	}
	/**
	 * @param sFirstName the sFirstName to set
	 */
	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}
	/**
	 * @return the sLastName
	 */
	public String getsLastName() {
		return sLastName;
	}
	/**
	 * @param sLastName the sLastName to set
	 */
	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}
	/**
	 * @return the iAge
	 */
	public int getiAge() {
		return iAge;
	}
	/**
	 * @param iAge the iAge to set
	 */
	public void setiAge(int iAge) {
		this.iAge = iAge;
	}
	/**
	 * @return the dDob
	 */
	public Date getdDob() {
		return dDob;
	}
	/**
	 * @param dDob the dDob to set
	 */
	public void setdDob(Date dDob) {
		this.dDob = dDob;
	}

}
