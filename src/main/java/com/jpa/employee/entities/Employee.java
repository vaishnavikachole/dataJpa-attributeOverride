
package com.jpa.employee.entities;



import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="employee_table")
@AttributeOverrides({
	@AttributeOverride(
			name="id",
			column=@Column(name="employee_id")
			),
	@AttributeOverride(
			name="firstName",
			column=@Column(name="first_name")
			),
	@AttributeOverride(
			name="lastName",
			column=@Column(name="last_name")
			),
	@AttributeOverride(
			name="email",
			column=@Column(name="employee_email_id")
			),
	@AttributeOverride(
			name="creationDate",
			column=@Column(name="employee_creation_date")
			)})
public class Employee
{
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="employee_id")
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	//@Column(name="first_name" ,length=60,nullable=false)
	private String firstName;
	
	//@Column(name="last_name", length=60,nullable=false)
	private String lastName;
	
	//@Column(name="employee_email_id",unique=true) 
	private String email;
	
	//@Column(name="employee_creation_date")
	private Date creationDate;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, String email, Date creationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.creationDate = creationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", creationDate=" + creationDate + "]";
	}
	
	

}

