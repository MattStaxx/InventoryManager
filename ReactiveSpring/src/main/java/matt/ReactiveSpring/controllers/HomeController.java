package matt.ReactiveSpring.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import matt.ReactiveSpring.entities.Car;
import matt.ReactiveSpring.entities.Vehicle;
import matt.ReactiveSpring.repositories.CarRepository;
import matt.ReactiveSpring.repositories.VehicleRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class HomeController {

	@Autowired
	private CarRepository carRepo;
	
	@Autowired
	private VehicleRepository veRepo;
	
	Logger log = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@GetMapping(value="/vehicles")
	public Iterable<Vehicle> getAllVehicles() {
		log.info("Getting all vehicle...");;
		return veRepo.findAll();
	}
}
