package com.roll;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Long id;
	
	
	private String firstName;
	private String lastName;
	private String role;
	public Employee() {
	
	}
	public Employee(String firstName, String lastName, String role) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}
	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, lastName, role);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(role, other.role);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role + "]";
	}
	
	
	
}
