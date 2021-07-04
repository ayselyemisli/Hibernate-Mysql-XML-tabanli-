package entity;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer personId;
	private String personName;
	private String personLastname;
	private String personAdress;
	private Date personBirthDate;

	public Person() {

	}

	public Person(String name, String lastname, String adress, Date date) {

		this.personName = name;
		this.personLastname = lastname;
		this.personAdress = adress;
		this.personBirthDate = date;

	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonLastname() {
		return personLastname;
	}

	public void setPersonLastname(String personLastname) {
		this.personLastname = personLastname;
	}

	public String getPersonAdress() {
		return personAdress;
	}

	public void setPersonAdress(String personAdress) {
		this.personAdress = personAdress;
	}

	public Date getPersonBirthDate() {
		return personBirthDate;
	}

	public void setPersonBirthDate(Date personBirthDate) {
		this.personBirthDate = personBirthDate;
	}

}
