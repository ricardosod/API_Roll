package com.roll;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order {

	@Id
	@GeneratedValue
	private Long id;
	private String description;
	private Status status;
	
	
	public Order() {
	
	}


	public Order(String description, Status status) {
		
		this.description = description;
		this.status = status;
	}


	public Long getId() {
		return this.id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	@Override
	public int hashCode() {
		return Objects.hash(this.description, this.id, this.status);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Order))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(description, other.description) && id == other.id && Objects.equals(status, other.status);
	}


	@Override
	public String toString() {
		return "Order {" + "id=" + this.id + ", description=" + this.description + ", status=" + this.status + "]";
	}
	
	
}
