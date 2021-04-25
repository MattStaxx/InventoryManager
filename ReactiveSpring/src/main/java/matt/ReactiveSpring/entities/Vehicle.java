package matt.ReactiveSpring.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String color;
	private int crew;
	private int passengers;
	private String name;
	private BigDecimal price;
	private enum Type { AIR, LAND, SPACE, WATER }

	public Vehicle() {}
	
	public Vehicle(String color, int crew, int passengers, String name, int price) {
		// TODO Auto-generated constructor stub
	}
}
