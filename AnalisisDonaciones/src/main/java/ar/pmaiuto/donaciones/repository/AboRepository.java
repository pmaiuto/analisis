package ar.pmaiuto.donaciones.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ar.pmaiuto.donaciones.model.Abo;



public interface AboRepository extends MongoRepository<Abo, String>, CustomAbo {

}
