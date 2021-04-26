package matt.ReactiveSpring.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Data
public class Vehicle {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String color;
	private int crew;
	private int passengers;
	private String name;
	private BigDecimal price;
	@Enumerated(EnumType.STRING)
	private Type type;
	public enum Type { AIR(0), LAND(1), SPACE(2), WATER(3); 
		private int type;
		private Type(int type) {
			this.type = type;
		}
	}

	public Vehicle() {}
	
	public Vehicle(Type type, String color, int crew, int passengers, String name, BigDecimal price) {
			
	}
}
