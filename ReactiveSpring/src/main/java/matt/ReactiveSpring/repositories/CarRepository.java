package matt.ReactiveSpring.repositories;

import org.springframework.data.repository.CrudRepository;

import matt.ReactiveSpring.entities.Car;

public interface CarRepository extends CrudRepository <Car, Integer> {

}
