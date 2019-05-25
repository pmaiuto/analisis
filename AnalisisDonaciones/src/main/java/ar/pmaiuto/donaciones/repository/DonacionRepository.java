package ar.pmaiuto.donaciones.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ar.pmaiuto.donaciones.model.Donacion;

public interface DonacionRepository extends MongoRepository<Donacion, String>, CustomDonacion {
	
	

}
