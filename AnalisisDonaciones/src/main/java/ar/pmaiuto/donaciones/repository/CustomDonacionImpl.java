package ar.pmaiuto.donaciones.repository;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.sort;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

//import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
//import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
//import static org.springframework.data.mongodb.core.aggregation.Aggregation.sort;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

import ar.pmaiuto.donaciones.model.Donacion;
import ar.pmaiuto.donaciones.model.SexoDonanteResult;
import ar.pmaiuto.donaciones.model.TipoDonanteResult;

public class CustomDonacionImpl implements CustomDonacion{
	
	private final MongoTemplate mongoTemplate;
	 
	@Autowired
	public CustomDonacionImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
 
	
	public long  cantidadDonaciones()
	{
		
		Query query = new Query();		
		query.addCriteria(Criteria.where("nbolsa").regex("JL"));
		
		return mongoTemplate.count(query,Donacion.class);
	}
	
	
	public List<TipoDonanteResult> listaTipoDonResult(Date fechaInicio,Date fechaFin)
	{		
	  		
		Aggregation aggregation = newAggregation(      
		match(Criteria.where("tipoDonante").in("P","H","N").and("fechaDonacion").gte(fechaInicio).lt(fechaFin).and("tipoDonacion").ne("27")),
		project("tipoDonante","estado").and("fechaDonacion").extractYear().as("anio"), 		
        group("anio","tipoDonante","estado").count().as("total"),        
        sort(Sort.Direction.ASC,  "anio")    
        );
        
        AggregationResults<TipoDonanteResult> groupResults = mongoTemplate.aggregate(
        aggregation, Donacion.class, TipoDonanteResult.class);
              
        List<TipoDonanteResult> resultadoTipoDonResult = groupResults.getMappedResults();         
        return resultadoTipoDonResult;
        		
	}
	
	
	public long cantidadDonacionesEdadesPorEstado(Date fechaInicio,Date fechaFin,int edadInicio,int edadFin, String estado)
	{			
	           
        Query query = new Query();
		query.addCriteria(Criteria.where("tipoDonante").in("P","H","N").and("fechaDonacion").gte(fechaInicio).lt(fechaFin).and("tipoDonacion").ne("27")
	              .and("estado").is(estado).and("edadAlDonar").lte(edadFin).gte(edadInicio)) ;		
		
		return mongoTemplate.count(query,Donacion.class);

		
	}
	
	public List<SexoDonanteResult> listaSexoDonResult(Date fechaInicio,Date fechaFin)
	{		
	  
		
		Aggregation aggregation = newAggregation(        
		match(Criteria.where("tipoDonante").in("P","H","N").and("fechaDonacion").gte(fechaInicio).lt(fechaFin).and("tipoDonacion").ne("27")),
		project("tipoDonante","estado","sexoDonante"), 		
        group("tipoDonante","estado","sexoDonante").count().as("total"),                 
        sort(Sort.Direction.ASC,  "sexoDonante")    
        );
        
        AggregationResults<SexoDonanteResult> groupResults = mongoTemplate.aggregate(
        aggregation, Donacion.class, SexoDonanteResult.class);
              
        List<SexoDonanteResult> resultadoaSexoDonResult = groupResults.getMappedResults();         
        return resultadoaSexoDonResult;
        

		
	}
	
	

}
