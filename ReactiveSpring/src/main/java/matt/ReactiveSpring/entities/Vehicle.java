package matt.ReactiveSpring.entities;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
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

//	public Vehicle() {}
	
	public Vehicle(String color, int crew, int passengers, String name, BigDecimal price) {
		
		
	}
}
