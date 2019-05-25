package ar.pmaiuto.donaciones.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.sort;
import ar.pmaiuto.donaciones.model.Abo;
import ar.pmaiuto.donaciones.model.ResultAbo;


public class CustomAboImpl  implements CustomAbo{
	
	private final MongoTemplate mongoTemplate;
	 
	@Autowired
	public CustomAboImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
 
	
	public long  cantidadDonaciones()
	{
		
		Query query = new Query();	
		query.addCriteria(Criteria.where("abolsa").regex("J"));
		
		return mongoTemplate.count(query,Abo.class);
	}
	
	public List<Abo>  aboPatron(String patron)
	{
		
		Query query = new Query();	
		query.addCriteria(Criteria.where("abolsa").regex(patron));		
	
		List<Abo> result = mongoTemplate.find(query(where("abolsa").regex(patron)), Abo.class);
		return result;
	}
	
	
	public List<ResultAbo>  listaGrupoFactor()
	{
		
		Aggregation aggregation = newAggregation(
			    group("grupo","factor").count().as("total"),			   
			    sort(Sort.Direction.ASC,  "total")    
			  );
		
			  AggregationResults<ResultAbo> groupResults = mongoTemplate.aggregate(
			    aggregation, Abo.class, ResultAbo.class);
			  
			  List<ResultAbo> resultadoAbo = groupResults.getMappedResults();
			  return resultadoAbo;
	}
	
	
	
}
