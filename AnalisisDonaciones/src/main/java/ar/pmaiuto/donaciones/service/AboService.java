package ar.pmaiuto.donaciones.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.pmaiuto.donaciones.model.Abo;
import ar.pmaiuto.donaciones.model.ResultAbo;
import ar.pmaiuto.donaciones.repository.AboRepository;


@Service
public class AboService {
	
	
	 @Autowired AboRepository repo;

	   public void guardar(Abo d)  {
	    		   	   
		   repo.save(d);        
	        
	    }
	   
	   
	   
	   public void llenarBase() throws IOException  {
		   	
		   String SEPARATOR=";";
		   BufferedReader br = null;
		      
		    try {
		         
		    	
		    	 URL fileLocation = getClass().getClassLoader().getResource("abo.csv");
		    	 System.out.println( fileLocation.getFile()  );
		    	 br =new BufferedReader(new FileReader(fileLocation.getFile()));
		    	
		         String line = br.readLine();
		         while (null!=line) {
		            String [] fields = line.split(SEPARATOR);	          
		            
		            System.out.println(fields[0] + ", " + fields[1] + ", " + fields[2]  );
		            
		            line = br.readLine();
		            
		            Abo abo = new Abo();
		    		abo.setAbolsa(fields[0]);
		    		abo.setGrupo(fields[1]);
		    		abo.setFactor(fields[2]);   	
		    			      			   		    		
		    				    		
		            repo.save(abo);
		         }
		         
		      } catch (Exception e) {
		    	  System.out.println("Error al leer archivo");	    	 
		          e.printStackTrace();
		      } finally {
		         if (null!=br) {
		            br.close();
		         }
		      }
		      
	    }
	   
	   public void eliminarTodos() {
	   	
	   	repo.deleteAll();
	       
	       
	   }
	    
	    public long home() {	    		    	
	     
	    	
	    	return repo.cantidadDonaciones();
	    	
	        
	    }
	    
       public List<Abo>  aboPatron(String patron)
       {	
	    		     
	    	
	    	return repo.aboPatron(patron);
	    	
	        
	    }
       
       public List<ResultAbo>  listaGrupoFactor()
       {	
	    		    
	    	
	    	return repo.listaGrupoFactor();
	    	
	        
	    }
       
	     
	     
	   

}
