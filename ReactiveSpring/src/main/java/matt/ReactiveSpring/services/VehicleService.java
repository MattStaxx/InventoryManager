package matt.ReactiveSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import matt.ReactiveSpring.entities.Car;
import matt.ReactiveSpring.entities.Vehicle;
import matt.ReactiveSpring.repositories.CarRepository;
import matt.ReactiveSpring.repositories.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	private CarRepository carRepo;
	
	@Autowired
	private VehicleRepository veRepo;
	
	public Iterable<Vehicle> getAllCars() {
		return veRepo.findAll(); 
	}
	
	public Car addNewCar(Car newCar) {
		return carRepo.save(newCar);
	}
}
