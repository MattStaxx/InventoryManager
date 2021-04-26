package matt.ReactiveSpring.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Car extends Vehicle {

	//TODO: Add view representation for Car entity in front-ends 
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String engineSize;
	private int numWheels;
	private int doors;
	
	public Car(String color, int crew, int passengers, String name, BigDecimal price, String engineSize, int numWheels, int doors) {
		super(color, crew, passengers, name, price);
		this.engineSize = engineSize;
		this.numWheels = numWheels;
		this.doors = doors;
	}
}
