package matt.ReactiveSpring.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import matt.ReactiveSpring.entities.Car;
import matt.ReactiveSpring.entities.Vehicle;
import matt.ReactiveSpring.services.VehicleService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class HomeController {

	@Autowired
	private VehicleService vServ;
	
	Logger log = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(value="/vehicles")
	public Iterable<Vehicle> getAllVehicles() {
		log.info("Getting all vehicle...");
		return vServ.getAllCars();
	}
	
	@PostMapping(value="/vehicles")
	public Car addNewCar(@RequestBody Car newCar) {
		return vServ.addNewCar(newCar);
	}
}
