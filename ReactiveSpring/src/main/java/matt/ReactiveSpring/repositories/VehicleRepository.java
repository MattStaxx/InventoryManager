package matt.ReactiveSpring.repositories;

import org.springframework.data.repository.CrudRepository;

import matt.ReactiveSpring.entities.Vehicle;

public interface VehicleRepository extends CrudRepository <Vehicle, Integer> {

}
